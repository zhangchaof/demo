package com.example.demo.guava;

import com.example.demo.mybatis.BusinessEnums;
import com.example.demo.mybatis.dao.BusinessEnumsMapper;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author
 */
@Slf4j
@Data
@Configuration
public class BusinessEnumRepository {
    public static final String SPLIT_SYMBOL = "\\|";

    @Autowired
    private BusinessEnumsMapper businessEnumsMapper;

    @Autowired
    private LoadingCache<String, BusinessEnums> businessEnumsDtoLoadingCache;

    private static ExecutorService pool;

    private static ListeningExecutorService backgroundRefreshPools;

    static {
        pool = new ThreadPoolExecutor(2, 2, 5,
                TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(10), new ThreadPoolExecutor.DiscardPolicy());
        backgroundRefreshPools = MoreExecutors.listeningDecorator(pool);

    }
    @PostConstruct
    public void initBankData() {

        List<BusinessEnums> listBusinessEnums = businessEnumsMapper.getListBusinessEnums();
        BusinessEnums other = new BusinessEnums();
        other.setCode("OTHER");
        other.setPayNum("99");
        businessEnumsDtoLoadingCache.put("OTHER", other);
        for (BusinessEnums businessEnums : listBusinessEnums) {
            businessEnumsDtoLoadingCache.put(businessEnums.getEnumType() + "|" + businessEnums.getCode(), businessEnums);
        }

    }

    @PreDestroy
    public void destroy() {
        if (pool != null) {
            pool.shutdownNow();
        }
    }

    @Bean("enumsStorage")
    public LoadingCache<String, BusinessEnums> enumsStorage() {

        return CacheBuilder.newBuilder().refreshAfterWrite(600, TimeUnit.SECONDS).build(new CacheLoader<String, BusinessEnums>() {
            @Override
            public BusinessEnums load(String key) {
                System.out.println("load = " + key);
                return getCacheEnums(key);
            }

            @Override
            public ListenableFuture<BusinessEnums> reload(String key, BusinessEnums businessEnums) throws Exception {
                return backgroundRefreshPools.submit(new Callable<BusinessEnums>() {
                    @Override
                    public BusinessEnums call() {
                        System.out.println("reload = " + key);
                        return getCacheEnums(key);
                    }
                });
            }
        });
    }

    private BusinessEnums getCacheEnums(String key) {
        String[] params = key.split(SPLIT_SYMBOL);
        BusinessEnums businessEnumsParam = new BusinessEnums();
        businessEnumsParam.setEnumType(params[0]);
        businessEnumsParam.setCode(params[1]);
        BusinessEnums businessEnums = businessEnumsMapper.selectByTypeAndCode(businessEnumsParam);
        return businessEnums;
    }
}
