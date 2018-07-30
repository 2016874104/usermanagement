package com.lingnan.usermanagement.common.exception;

/*
 * 自定义的连接异常accessException继承RunTImeException
 */
public class accessException extends RuntimeException {

	/*
	 * 无参构造方法
	 */
	public accessException() {
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
	public accessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 以显示的结果与产生错误的原因（e）为参数
	 * @param message
	 * @param cause
	 */
	public accessException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 以想要输出的结果为参数
	 * @param message
	 */
	public accessException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 以产生错误的原因（e）为参数
	 * @param cause
	 */
	public accessException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
