package com.lingnan.usermanagement.common.user1dao;

import java.util.List;

import com.lingnan.usermanagement.common.user1dto.User1Vo;

/**
 * 用户操作实现的dao方法的接口
 * @author Administrator
 *
 */
public interface User1dao extends Basedao {
	/**
	 * 登录（id或用户名）和密码相匹配即可
	 * @param user id或用户名
	 * @param password 密码
	 * @return 成功一个结果集
	 */
	public User1Vo login(String user,String password);
	
	
	/**
	 * @param uv 传入一个UserVo的对象
	 * @return 成功返回true ,失败返回false
	 */
	public boolean addUser1(User1Vo uv); 
	
	/**
	 * @param userid 传入用户的id来进行删除操作
	 * @return 成功返回true， 失败返回flase
	 */
	public boolean deleteuser1(String userid);
	
	/**
	 * 传入一个UserVo的对象,通过id对其他数据进行修改
	 * @param uv 
	 * @return 成功返回true， 失败返回flase
	 */
	public boolean updateuser1(User1Vo uv);
	
	/**
	 * 管理员查看全部信息
	 * @return 返回一个结果集的集合
	 */
	public List<User1Vo> FindAllInfo();
	
	/**
	 * 输入想要查找的ID
	 * @param userid
	 * @return 成功返回一个结果集，失败或者数据为空则返回null
	 */
	public User1Vo FindIdInfo(String userid);
	
	/**
	 * 输入想要查找的ID
	 * @param 
	 * @return 成功返回一个结果集，失败或者数据为空则返回null
	 */
	public User1Vo FindNameInfo(String Name);
	
}
