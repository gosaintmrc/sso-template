package com.asiainfo.web.util;

import javax.servlet.http.HttpServletRequest;

import com.asiainfo.domain.SSO;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 登录上下文
 * 获取当前登录用户
 */
public class SSOContext {

	public static final String SSO_USER_IN_SESSION = "sso";

	private static HttpServletRequest getRequest(){
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	public static SSO getSso(){
		return (SSO) getRequest().getSession().getAttribute(SSO_USER_IN_SESSION);
	}
	
	public static Long getSsoId() {
		return SSOContext.getSso().getId();
	}
	
	public static void setSso(SSO sso){
		getRequest().getSession().setAttribute(SSO_USER_IN_SESSION,sso);
	}
	
	public static void logOut(){
		getRequest().getSession().invalidate();
	}
}
