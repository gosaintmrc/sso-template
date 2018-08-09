package com.asiainfo.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 21:32 2018/8/7
 * @Modified By:
 */
@Data
public class SSO implements Serializable {

    private Long id;
    private String email;
    private String password;

}
