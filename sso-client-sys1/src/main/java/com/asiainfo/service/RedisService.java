package com.asiainfo.service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 19:14 2018/8/8
 * @Modified By:
 */
public interface RedisService {
    boolean set(String key,String value);
    String get(String key);
    boolean expire(String key,long time);
}
