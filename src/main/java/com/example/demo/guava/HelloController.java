package com.example.demo.guava;

import com.example.demo.mybatis.BusinessEnums;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author: zcf
 * @Date: 2019/8/24 15:05
 */
@RestController
public class HelloController {

    @Autowired
    private CacheManager cacheManager;

    //@Autowired
    private LoadingCache<String, BusinessEnums> businessEnumsDtoLoadingCache;


    @RequestMapping("load")
    public Map<String, BusinessEnums> load(@RequestParam("key") String key, @RequestParam("k2") String k2) throws Exception{
        ConcurrentMap<String, BusinessEnums> concurrentMap = businessEnumsDtoLoadingCache.asMap();
        String k = key + "|" + k2;
        BusinessEnums businessEnums = null;
        try {
             businessEnums = businessEnumsDtoLoadingCache.get(k);
        } catch (CacheLoader.InvalidCacheLoadException e) {
            businessEnums = businessEnumsDtoLoadingCache.get("OTHER");
        }
        System.out.println("businessEnums = " + businessEnums);
        return concurrentMap;
    }


    @RequestMapping("hello")
    public String hello(){
        long start = System.currentTimeMillis();
        String value = cacheManager.getCache("hello").get("hello").get().toString();
        long end = System.currentTimeMillis();

        return String.format("value=[%s], wait time : [%d]",value,(end - start));
    }

    @RequestMapping("world")
    public String world(){
        long start = System.currentTimeMillis();
        String value = cacheManager.getCache("world").get("world").get().toString();
        long end = System.currentTimeMillis();

        return String.format("value=[%s], wait time : [%d]",value,(end - start));
    }
}
