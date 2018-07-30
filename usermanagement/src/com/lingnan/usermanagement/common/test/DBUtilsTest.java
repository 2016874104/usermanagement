package com.lingnan.usermanagement.common.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.lingnan.usermanagement.common.util.DBUtils;

public class DBUtilsTest {

	@Test
	public void testGetConnection() {
		Connection conn = DBUtils.getConnection();
		if(conn != null)System.out.println(conn);
		else 
			System.out.println("连接不到数据库！！"+conn);
	}
}
