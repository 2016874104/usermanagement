package com.lingnan.usermanagement.common.exception;

/*
 * �Զ���������쳣accessException�̳�RunTImeException
 */
public class accessException extends RuntimeException {

	/*
	 * �޲ι��췽��
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
	 * ����ʾ�Ľ������������ԭ��e��Ϊ����
	 * @param message
	 * @param cause
	 */
	public accessException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/*
	 * ����Ҫ����Ľ��Ϊ����
	 * @param message
	 */
	public accessException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * �Բ��������ԭ��e��Ϊ����
	 * @param cause
	 */
	public accessException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
