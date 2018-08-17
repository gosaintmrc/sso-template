package com.asiainfo.domain;

import java.io.Serializable;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 21:32 2018/8/7
 * @Modified By:
 */

public class SSO implements Serializable {

    private Long id;
    private String email;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
