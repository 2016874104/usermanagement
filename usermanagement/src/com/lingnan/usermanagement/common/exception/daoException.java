package com.lingnan.usermanagement.common.exception;
/*
 * �Զ���������쳣daoException�̳�accessException
 */
public class daoException extends accessException {
	
	/*
	 * �޲ι��췽��
	 */
	public daoException() {
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
	public daoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/*
	 * ����ʾ�Ľ������������ԭ��e��Ϊ����
	 * @param message
	 * @param cause
	 */
	public daoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/*
	 * ����Ҫ����Ľ��Ϊ����
	 * @param message
	 */
	public daoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/*
	 * �Բ��������ԭ��e��Ϊ����
	 * @param cause
	 */
	public daoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
