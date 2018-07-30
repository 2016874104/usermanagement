package com.lingnan.usermanagement.common.user1dao;

import java.sql.Connection;

public class daoFactory {
	
	public static Basedao getdao(Connection conn,String Type) {
		
		if("user".equals(Type))
			return new User1daoRealize(conn);
		else
		{
			System.out.println("dao工厂方法出错！！");
		}
		return null;
}
}
