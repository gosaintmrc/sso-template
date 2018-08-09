package com.asiainfo.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

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

    /**
     * sso认证中心登录统一接口的处理*/
    @RequestMapping("/login")
    @ResponseBody
    public String ssoCenterLogin(HttpServletRequest request){
        /** 1 获取Ticket-granting cookie（TGC） */
        Cookie[] cookies = request.getCookies();
        String tgc="";
        if(cookies != null){
            for (Cookie cookie:cookies) {
                if(cookie.getName().equals("TGC")){
                    tgc=cookie.getValue();
                }
            }
        }
        return null;
    }
}
