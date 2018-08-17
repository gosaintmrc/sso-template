package asiainfo;

import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.asiainfo.dao.SSOMapper;
import com.asiainfo.domain.SSO;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Autowired
    private SSOMapper ssoMapper;

    /**
     * 数据库连接池的测试
     */
    @Test
    public void conn(){
        try {
            DruidPooledConnection connection = druidDataSource.getConnection();
            log.info("获取数据库连接"+connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMapper(){
        SSO sso = ssoMapper.getSsoByEmail("15140366082@163.com");
        System.out.println(sso);
    }
}
