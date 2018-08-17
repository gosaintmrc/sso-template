package com.asiainfo.dao;

import com.asiainfo.domain.SSO;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 23:43 2018/8/17
 * @Modified By:
 */
public interface SSOMapper {
    SSO getSsoByEmail(String email);
}
