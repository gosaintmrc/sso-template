package com.asiainfo.service.impl;

import com.asiainfo.service.SSOService;
import com.asiainfo.service.UserCenterService;
import com.asiainfo.web.util.Ret;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:00 2018/8/9
 * @Modified By:
 */
@Service
public class UserCenterServiceImpl implements UserCenterService {

    @Autowired
    private SSOService ssoService;

    @Override
    public Ret login(final String email, final String password) {
        return ssoService.login(email,password);
    }
}
