package com.lingnan.usermanagement.common.exception;


/*
 * 自定义的连接异常emailException继承accessException
 */
public class emailException extends accessException {

	/*
	 * 无参构造方法
	 */
	public emailException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public emailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 以显示的结果与产生错误的原因（e）为参数
	 * @param message
	 * @param cause
	 */
	public emailException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 以想要输出的结果为参数
	 * @param message
	 */
	public emailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 以产生错误的原因（e）为参数
	 * @param cause
	 */
	public emailException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
