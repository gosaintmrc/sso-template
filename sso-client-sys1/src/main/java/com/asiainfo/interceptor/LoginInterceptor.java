package com.asiainfo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 17:48 2018/8/8
 * @Modified By:
 */
public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger log = LogManager.getLogger(LoginInterceptor.class);
    @Override
    public boolean preHandle(
            final HttpServletRequest request, final HttpServletResponse response, final Object handler)
            throws Exception {
        log.info("拦截器开始执行-----------------");
        String uri = request.getRequestURI();
        return false;
    }

    @Override
    public void postHandle(
            final HttpServletRequest request,
            final HttpServletResponse response,
            final Object handler,
            final ModelAndView modelAndView)
            throws Exception {
    }

    @Override
    public void afterCompletion(
            final HttpServletRequest request,
            final HttpServletResponse response,
            final Object handler,
            final Exception ex) throws Exception {
    }
}
