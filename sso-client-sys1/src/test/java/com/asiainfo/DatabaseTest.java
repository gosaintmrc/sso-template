package com.asiainfo;

import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 21:38 2018/8/7
 * @Modified By:
 */
@Slf4j
public class DatabaseTest extends BaseTest{

    @Autowired
    private DruidDataSource druidDataSource;

    /**
     * 数据库连接池的测试
     */
    @Test
    public void conn(){
        try {
            DruidPooledConnection connection = druidDataSource.getConnection();
            log.info("获取数据库连接"+connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
