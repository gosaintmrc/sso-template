package com.asiainfo.web.util;

public interface ICodes {
	@ConstName("成功")
	public static final int SUCCESS = 0;
	@ConstName("失败")
	public static final int FAILED = 1;
	@ConstName("需要登录")
	public static final int UNAUTHED = 2;
	@ConstName("非法访问")
	public static final int ILLEGAL_ACCESS = 3;
}
