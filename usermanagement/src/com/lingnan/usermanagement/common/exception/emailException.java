package com.lingnan.usermanagement.common.exception;


/*
 * �Զ���������쳣emailException�̳�accessException
 */
public class emailException extends accessException {

	/*
	 * �޲ι��췽��
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
	 * ����ʾ�Ľ������������ԭ��e��Ϊ����
	 * @param message
	 * @param cause
	 */
	public emailException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/*
	 * ����Ҫ����Ľ��Ϊ����
	 * @param message
	 */
	public emailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * �Բ��������ԭ��e��Ϊ����
	 * @param cause
	 */
	public emailException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
