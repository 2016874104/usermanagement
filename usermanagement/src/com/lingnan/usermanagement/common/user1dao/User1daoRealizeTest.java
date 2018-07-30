package com.lingnan.usermanagement.common.user1dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lingnan.usermanagement.common.util.DBUtils;

public class User1daoRealizeTest {

	@Test
	public void testLogin() {
		User1daoRealize ur = new User1daoRealize(DBUtils.getConnection());
		if(ur.login("1", "1")==null)System.out.println("µÇÂ½³É¹¦£¡£¡");
		else System.out.println("µÇÂ½Ê§°Ü£¡£¡");
	}

}
