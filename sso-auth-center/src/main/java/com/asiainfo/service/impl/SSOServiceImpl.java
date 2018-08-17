package com.asiainfo.service.impl;

import com.asiainfo.dao.SSOMapper;
import com.asiainfo.domain.SSO;
import com.asiainfo.service.SSOService;
import com.asiainfo.web.util.Ret;
import com.asiainfo.web.util.UserCenterMsgConsts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:24 2018/8/9
 * @Modified By:
 */
@Service
public class SSOServiceImpl implements SSOService {

    @Autowired
    private SSOMapper ssoMapper;

    @Override
    public SSO getSSOByEmail(final String email) {
        /** 通过邮箱获取SSO对象*/
        return ssoMapper.getSsoByEmail(email);
    }

    @Override
    public Ret login(final String email, final String password) {
        SSO sso = this.getSSOByEmail(email);
        /**
         * 如果用户为空，输出用户名或者密码不正确
         */
        if (null == sso) {
            return Ret.me().setSuccess(false).setCode(UserCenterMsgConsts.INVALIDE_EMAIL_PASSWORD);
        }

        if(! sso.getPassword().equals(password)){
            return Ret.me().setSuccess(false).setCode(UserCenterMsgConsts.INVALIDE_EMAIL_PASSWORD);
        }
        return Ret.me().setData(sso.getId());
    }
}
