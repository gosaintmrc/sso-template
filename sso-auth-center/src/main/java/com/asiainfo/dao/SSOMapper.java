package com.asiainfo.dao;

import com.asiainfo.domain.SSO;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 22:13 2018/8/9
 * @Modified By:
 */
public interface SSOMapper {
    SSO getSsoByEmail(String email);
}
