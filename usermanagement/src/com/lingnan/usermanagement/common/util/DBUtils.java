package com.lingnan.usermanagement.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
/*
 * ���ݿ⹤����
 * 
 */
public class DBUtils {	
		/*
		 * ��ȡ���ݿ�����
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
				System.out.println("jdbc������������,�뵽util���¼��DBUtils�µ�getConnection");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("��ȡ���ݿ�����ʧ�ܣ��뵽util���¼��DBUtils�µ�getConnection");
				e.printStackTrace();
			}
			return conn;
	}
	/*
	 * �ر����ӣ��������������
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
				System.out.println("�ر����ӣ��������������ʧ�ܣ���ȡ���ݿ�����ʧ�ܣ��뵽util���¼��DBUtils�µ�closeAllOracleTool");
				e.printStackTrace();
			}
		
	}
	
	/*
	 * ��������
	 * 
	 */
		public static void actionMatter(Connection conn)
		{
			try {
				//�������ύ����Ϊ��
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("���￪��ʧ�ܣ��뵽util���¼��DBUtils�µ�actionMatter");
				e.printStackTrace();
			}
		}
	
	/*
	 * �ύ����
	 * 
	 */
		public static void commitMatter(Connection conn)
		{
			try {
				//�ύ����
				conn.commit();
				//�������ύ����Ϊ��
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("���￪��ʧ�ܣ��뵽util���¼��DBUtils�µ�commitMatter");
				e.printStackTrace();
			}
		}
		
	/*
	 * �ع�����
	 * 
	 */
		public static void rollBackMatter(Connection conn) {
			try {
				//�ع�����
				conn.rollback();
				//�������ύ����Ϊ��
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("����ع�ʧ�ܣ��뵽util���¼��DBUtils�µ�rollBackMatter");
				e.printStackTrace();
			}
		}
		
		
}
