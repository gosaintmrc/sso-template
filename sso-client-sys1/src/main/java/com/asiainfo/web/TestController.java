package com.asiainfo.web;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 21:47 2018/8/7
 * @Modified By:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private static final Logger log = LogManager.getLogger(TestController.class);
    @RequestMapping("/cmd")
    @ResponseBody
    public String testDemo(){
        log.info("开始测试");
        return "Hello"+new Date();
    }
}
