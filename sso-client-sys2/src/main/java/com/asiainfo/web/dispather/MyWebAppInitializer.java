package com.asiainfo.web.dispather;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 11:48 2018/8/10
 * @Modified By:基于Java代码的DispatherServlet的配置
 */
public class MyWebAppInitializer extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        XmlWebApplicationContext cxt = new XmlWebApplicationContext();
        cxt.setConfigLocation("classpath:dispatcher-config.xml");
        return cxt;
    }
}
