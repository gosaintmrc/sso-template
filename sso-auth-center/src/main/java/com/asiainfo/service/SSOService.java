package com.asiainfo.service;

import com.asiainfo.domain.SSO;
import com.asiainfo.web.util.Ret;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:16 2018/8/9
 * @Modified By:
 */
public interface SSOService {
     /**
      * 根据邮箱查询用户
      * @param email
      * @return
      */
     SSO getSSOByEmail(final String email);

     /**
      * 登录服务
      * @param email
      * @param password
      * @return
      */
     Ret login(String email, String password);
}
