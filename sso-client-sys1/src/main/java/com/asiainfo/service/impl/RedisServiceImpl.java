package com.asiainfo.service.impl;

import java.util.concurrent.TimeUnit;

import com.asiainfo.service.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 19:15 2018/8/8
 * @Modified By:
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String,?> redisTemplate;

    @Override
    public boolean set(final String key, final String value) {
        return redisTemplate.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(final RedisConnection redisConnection)
                    throws DataAccessException {
                /** 序列化器*/
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                redisConnection.set(serializer.serialize(key),serializer.serialize(value));
                return true;
            }
        });
    }

    @Override
    public String get(final String key) {
        return redisTemplate.execute(new RedisCallback<String>() {

            @Override
            public String doInRedis(final RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] keyBytes = redisConnection.get(serializer.serialize(key));
                return serializer.deserialize(keyBytes);
            }
        });
    }

    @Override
    public boolean expire(final String key, final long time) {
        return redisTemplate.expire(key,time,TimeUnit.SECONDS);
    }
}
