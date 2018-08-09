package com.asiainfo;

import com.asiainfo.service.RedisService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.extern.slf4j.Slf4j;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:00 2018/8/8
 * @Modified By:
 */
@Slf4j
public class RedisTest extends BaseTest{

    @Autowired
    private RedisService redisService;

    @Test
    public void redisConn(){
        log.info("redis开始连接");
        boolean a = redisService.set("caozg", "123456");
        log.info("---------"+a);
    }

}
