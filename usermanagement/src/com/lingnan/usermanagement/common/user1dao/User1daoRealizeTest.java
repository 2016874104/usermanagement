package com.lingnan.usermanagement.common.user1dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lingnan.usermanagement.common.util.DBUtils;

public class User1daoRealizeTest {

	@Test
	public void testLogin() {
		User1daoRealize ur = new User1daoRealize(DBUtils.getConnection());
		if(ur.login("1", "1")==null)System.out.println("��½�ɹ�����");
		else System.out.println("��½ʧ�ܣ���");
	}

}
