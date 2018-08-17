package com.asiainfo.service;

import com.asiainfo.web.util.Ret;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:00 2018/8/9
 * @Modified By:
 */
public interface UserCenterService {
    Ret login(String email, String password);
}
