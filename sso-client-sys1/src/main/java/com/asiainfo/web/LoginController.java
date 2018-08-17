package com.asiainfo.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 12:58 2018/8/8
 * @Modified By:
 */
@Controller
@RequestMapping("")
public class LoginController {

    private static final Logger log = LogManager.getLogger(LoginController.class);

    @Value("${URL_SSO_LOGIN}")
    private String sso_center_url;

    @Value("${URL_SSO_CLIENT_FROM}")
    private String fromUrl;

    @RequestMapping("/client/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        log.info("开始执行登录-----------"+sso_center_url);
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        /*** 用户名或者密码为空*/
        if(StringUtils.isEmpty(email) || StringUtils.isEmpty(password)){

        }else {
            /** 用户名密码非空的状态*/
        }
        log.info("email-----------"+email);
        return "OK";
    }

    /**
     *
     * @param serviceTicket 票据
     * @param to
     * @return
     */
    @RequestMapping("/client/login")
    @ResponseBody
    public String login(String  serviceTicket,String to){
        String redirectUrl = "";
        if(StringUtils.isEmpty(serviceTicket)){
            /** 无票据跳转SSO认证中心，并且携带上该系统登录地址
             *  http://127.0.0.1:9093/sso/login SSO 统一登录接口URL
             *  跳转地址
             *  http://127.0.0.1:9093/sso/login?from=http://127.0.0.1:9091/client/login
             *  */

            redirectUrl=sso_center_url+"?from="+fromUrl;
        }
        return "redirect:"+redirectUrl;
    }
}
