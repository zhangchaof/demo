package com.example.demo.guava;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: zcf
 * @Date: 2019/8/24 14:57
 */
@ConfigurationProperties(prefix = "guava.cache.config")
@Data
public class GuavaProperties {
    private long maximumSize;

    private long maximumWeight;

    private long expireAfterAccessDuration;

    private long expireAfterWriteDuration;

    private long refreshDuration;

    private int initialCapacity;

    private int concurrencyLevel;
}
