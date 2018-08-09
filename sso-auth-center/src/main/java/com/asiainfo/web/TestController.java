package com.asiainfo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 16:58 2018/8/9
 * @Modified By:
 */
@Controller
@RequestMapping("/auth")
public class TestController {

    @RequestMapping("/sso")
    @ResponseBody
    public String testdemo(){
        return "AUTH";
    }
}
