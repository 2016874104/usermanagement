package com.lingnan.usermanagement.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
/*
 * 数据库工具类
 * 
 */
public class DBUtils {	
		/*
		 * 获取数据库连接
		 * 
		 */
	public static Connection getConnection() {
			String  drive="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String password="123456";
			Connection conn=null; 
			try {
				Class.forName(drive);
				conn=DriverManager.getConnection(url, user, password);
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("jdbc加载驱动出错,请到util包下检查DBUtils下的getConnection");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("获取数据库连接失败，请到util包下检查DBUtils下的getConnection");
				e.printStackTrace();
			}
			return conn;
	}
	/*
	 * 关闭连接，结果集及语句对象
	 * 
	 */
	public static void closeAllOracleTool(Connection conn,ResultSet rst,Statement state)
	{
		
			try {
				if(conn != null)
				conn.close();
				if(rst != null)
					rst.close();
				if(state != null)
					state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("关闭连接，结果集及语句对象失败，获取数据库连接失败，请到util包下检查DBUtils下的closeAllOracleTool");
				e.printStackTrace();
			}
		
	}
	
	/*
	 * 开启事务
	 * 
	 */
		public static void actionMatter(Connection conn)
		{
			try {
				//将事物提交设置为假
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("事物开启失败，请到util包下检查DBUtils下的actionMatter");
				e.printStackTrace();
			}
		}
	
	/*
	 * 提交事务
	 * 
	 */
		public static void commitMatter(Connection conn)
		{
			try {
				//提交事务
				conn.commit();
				//将事物提交设置为真
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("事物开启失败，请到util包下检查DBUtils下的commitMatter");
				e.printStackTrace();
			}
		}
		
	/*
	 * 回滚事务
	 * 
	 */
		public static void rollBackMatter(Connection conn) {
			try {
				//回滚事务
				conn.rollback();
				//将事物提交设置为真
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("事物回滚失败，请到util包下检查DBUtils下的rollBackMatter");
				e.printStackTrace();
			}
		}
		
		
}
