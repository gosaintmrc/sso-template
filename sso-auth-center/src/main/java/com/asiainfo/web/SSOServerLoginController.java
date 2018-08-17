package com.asiainfo.web;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asiainfo.service.UserCenterService;
import com.asiainfo.web.util.Ret;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 17:03 2018/8/9
 * @Modified By:
 */
@Controller
@RequestMapping("/sso")
public class SSOServerLoginController {

    @Autowired
    private UserCenterService userCenterService;
    /**
     * sso认证中心登录统一接口的处理
     * @param from 判断是哪一个系统访问SSO认证中心的地址
     * @param to
     * @param relogin
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping("/login")
    @ResponseBody
    public String ssoCenterLogin(String from,String to, Integer relogin,
            HttpServletRequest request, HttpServletResponse response) throws IOException {
        /** 1 获取Ticket-granting cookie（TGC）
         *  获取Cookie中的TGC*/
        Cookie[] cookies = request.getCookies();
        /** TGC的名称*/
        String tgcName="TGC";
        /** Cookie中TGC的值*/
        String tgc="";
        if(cookies != null){
            for (Cookie cookie:cookies) {
                if(cookie.getName().equals(tgcName)){
                    tgc=cookie.getValue();
                }
            }
        }
        /** 2 判断TGC是否存在
         *  如果TGC不存在，则证明没有登录，跳转到SSO统一登录页面。
         *  统一登录页面和SSO认证服务器在一起*/
        if(StringUtils.isEmpty(tgc)){
            return "redirect:/login.html";
        }
        return null;
    }


    @RequestMapping("/passport/in")
    @ResponseBody
    public Ret loginValidate(String email,String password,
            HttpServletRequest request,HttpServletResponse response){
        /** 验证邮箱和密码是否正确*/
        Ret ret=userCenterService.login(email,password);
        return null;
    }
}
