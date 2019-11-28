package com.example.demo.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zcf
 * @Date: 2019/8/24 15:01
 */
@EnableConfigurationProperties(GuavaProperties.class)
@Configuration
@EnableCaching
public class GuavaCacheConfig {

    @Autowired
    private GuavaProperties guavaProperties;

    @Bean
    public CacheBuilder<Object, Object> cacheBuilder() {
        long maximumSize = guavaProperties.getMaximumSize();
        long refreshDuration = guavaProperties.getRefreshDuration();

        if (maximumSize <= 0) {
            maximumSize = 1024;
        }

        if (refreshDuration <= 0) {
            refreshDuration = 1800;
        }

        return CacheBuilder.newBuilder().maximumSize(maximumSize).refreshAfterWrite(refreshDuration, TimeUnit.SECONDS);
    }

    @Bean(name = "guavaCacheLoader")
    public CacheLoader cacheLoader() {
        return new GuavaCacheLoader();
    }

    @Bean
    public CacheManager cacheManager(@Qualifier("cacheBuilder") CacheBuilder cacheBuilder,
                                     @Qualifier("guavaCacheLoader") CacheLoader cacheLoader) {
        GuavaCacheManager cacheManager = new GuavaCacheManager();
        cacheManager.setCacheBuilder(cacheBuilder);
        cacheManager.setCacheLoader(cacheLoader);
        return cacheManager;
    }

}

