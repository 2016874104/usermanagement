package com.lingnan.usermanagement.common.exception;

/*
 * �Զ���������쳣dateException�̳�accessException
 */
public class dateException extends accessException {
	/*
	 * �޲ι��췽��
	 */
	public dateException() {
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
	public dateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/*
	 * ����ʾ�Ľ������������ԭ��e��Ϊ����
	 * @param message
	 * @param cause
	 */
	public dateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/*
	 * ����Ҫ����Ľ��Ϊ����
	 * @param message
	 */
	public dateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * �Բ��������ԭ��e��Ϊ����
	 * @param cause
	 */
	public dateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
