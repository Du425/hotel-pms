package com.du.pmscommon.core.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author DU425
 * @Date 2023/3/14 16:03
 * @Version 1.0
 * @Description
 */
@Component
public class RedisCache {

    @Autowired
    public RedisTemplate redisTemplate;

    public <T> void setCacheObject(final String key, final T value, final Integer timeout, final TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, timeout, timeUnit);
    }

}
