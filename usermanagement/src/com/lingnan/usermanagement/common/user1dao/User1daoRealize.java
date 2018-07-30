package com.lingnan.usermanagement.common.user1dao;

import java.util.Iterator;

import java.util.List;
import java.sql.*;

import com.lingnan.usermanagement.common.user1dto.User1Vo;

import jdbctool.DaoImplement;

/**
 * 用户操作实现的dao方法的接口的具体实现
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
	 * 登录（id或用户名）和密码相匹配即可
	 * @param user id或用户名
	 * @param password 密码
	 * @return 成功一个结果集
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
	 * @param uv 传入一个UserVo的对象
	 * @return 成功返回true ,失败返回false
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
	 * @param userid 传入用户的id来进行删除操作
	 * @return 成功返回true， 失败返回flase
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
	 * 传入一个UserVo的对象,通过id对其他数据进行修改
	 * @param uv 
	 * @return 成功返回true， 失败返回flase
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
	 * 管理员查看全部信息
	 * @return 返回一个结果集的集合
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
	 * 输入想要查找的ID
	 * @param userid
	 * @return 成功返回一个结果集，失败或者数据为空则返回null
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
	 * 输入想要查找的用户名
	 * @param 
	 * @return 成功返回一个结果集，失败或者数据为空则返回null
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
