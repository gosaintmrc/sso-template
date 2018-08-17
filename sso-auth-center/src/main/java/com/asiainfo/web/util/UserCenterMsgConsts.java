package com.asiainfo.web.util;

public interface UserCenterMsgConsts extends ICodes{
	public static final int BASECODE = 20000;//基准常量码
	
	@ConstName("邮箱已被注册")
	public static final int PHONE_NUMBER_EXISTS = 0+BASECODE;
	
	@ConstName("图形验证码不正确")
	public static final int INVALIDE_CAPTCHA = 1+BASECODE;
	
	@ConstName("短信验证码不正确")
	public static final int SMS_CODE_INVALIDE = 2+BASECODE;
	
	@ConstName("短信验证码不存在或已过期")
	public static final int SMSCODE_EXPIRED = 3+BASECODE;
	
	@ConstName("未过重发时间（60s）")
	public static final int SMSCODE_ERR_FREQUNCE = 4+BASECODE;
	
	@ConstName("邮箱或密码不正确")
	public static final int INVALIDE_EMAIL_PASSWORD = 5+BASECODE;
	
	@ConstName("库存不足")
	public static final int ORDER_STOCK_NOT_ENOUGH = 6+BASECODE;
	
	@ConstName("该订单不允许删除")
	public static final int ORDER_CANCEL_FORBIDDEN = 7+BASECODE;

}