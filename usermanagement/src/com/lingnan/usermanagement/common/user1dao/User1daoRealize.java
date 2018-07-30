package com.lingnan.usermanagement.common.user1dao;

import java.util.Iterator;

import java.util.List;
import java.sql.*;

import com.lingnan.usermanagement.common.user1dto.User1Vo;

import jdbctool.DaoImplement;

/**
 * �û�����ʵ�ֵ�dao�����Ľӿڵľ���ʵ��
 * @author Administrator
 *
 */
public class User1daoRealize  extends DaoImplement implements User1dao{

			private Connection conn = null;
			String sql=null;
			ResultSet rest = null;
			PreparedStatement prep = null;
			User1Vo uv = null;
		public User1daoRealize(Connection conn) {
			this.conn=conn;
		}
	/**
	 * ��¼��id���û�������������ƥ�伴��
	 * @param user id���û���
	 * @param password ����
	 * @return �ɹ�һ�������
	 */
	public User1Vo login(String user, String password) {
		String sql="select * from user1 where userid=? and password=? and amputate=?";
		try {
			return (User1Vo)get(conn,sql,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param uv ����һ��UserVo�Ķ���
	 * @return �ɹ�����true ,ʧ�ܷ���false
	 */
	public boolean addUser1(User1Vo uv) {
		boolean flag=false;
		sql="insert into user1 values(?,?,?,?,?,?,?)";
		int i = 0; 
		try {
			 i = update(conn, sql, uv.getUserid(),uv.getUsername(),uv.getPassword(),uv.getSex(),
					uv.getPhone(),uv.getSuperuser(),1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0)flag=true;
		return flag;
	}

	/**
	 * @param userid �����û���id������ɾ������
	 * @return �ɹ�����true�� ʧ�ܷ���flase
	 */
	public boolean deleteuser1(String userid) {
		boolean flag=false;
		sql="update user1 set amputate=0 where user1id=? and amputate=1";
		int i = 0;
		try {
			i=update(conn,sql,userid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) flag=true;
		return flag;
	}

	/**
	 * ����һ��UserVo�Ķ���,ͨ��id���������ݽ����޸�
	 * @param uv 
	 * @return �ɹ�����true�� ʧ�ܷ���flase
	 */
	public boolean updateuser1(User1Vo uv) {
		boolean flag=false;
		sql="update user1 set password=?,username=?, sex=?, phone=?,superuser=? where userid=? and amputate=1";
		int i = 0;
		try {
			i=update(conn,sql,uv.getPassword(),uv.getUsername(),uv.getSex(),uv.getPhone(),uv.getSuperuser(),uv.getUserid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) flag=true;
		return flag;
	}

	/**
	 * ����Ա�鿴ȫ����Ϣ
	 * @return ����һ��������ļ���
	 */
	@SuppressWarnings("unchecked")
	public List<User1Vo> FindAllInfo() {
		sql = "select * from user1 where amputate=1";
		
		try {
			return getForList(conn, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ������Ҫ���ҵ�ID
	 * @param userid
	 * @return �ɹ�����һ���������ʧ�ܻ�������Ϊ���򷵻�null
	 */
	public User1Vo FindIdInfo(String userid) {
			sql="select * from user1 where userid=? and amputate=1";
			try {
				return (User1Vo)get(conn, sql, userid);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

	/**
	 * ������Ҫ���ҵ��û���
	 * @param 
	 * @return �ɹ�����һ���������ʧ�ܻ�������Ϊ���򷵻�null
	 */
	public User1Vo FindNameInfo(String Name) {
			sql = "select * from user1 where username=? and amputate=1";
			try {
				return (User1Vo)get(conn, sql, Name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

}
