package com.lingnan.usermanagement.common.user1dto;

/**
 * 定义用户的信息类（UserVo）
 * @author Administrator
 *
 */
public class User1Vo {
		private String userid ;
		private String password;
		private String username;
		private String sex;		
		private String phone;	//联系方式电话或邮箱
		private String superuser;
		private String amputate;
		
		/*
		 * 返回账户
		 */
		public String getUserid() {
			return userid;
		}
		/*
		 * 获取账户
		 */
		public void setUserid(String userid) {
			this.userid = userid;
		}
		/*
		 * 返回密码
		 */
		public String getPassword() {
			return password;
		}
		/*
		 * 获取密码
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		/*
		 * 返回用户名
		 */
		public String getUsername() {
			return username;
		}
		/*
		 * 获取用户名
		 */
		public void setUsername(String username) {
			this.username = username;
		}
		/*
		 * 返回性别
		 */
		public String getSex() {
			return sex;
		}
		/*
		 * 获取性别
		 */
		public void setSex(String sex) {
			this.sex = sex;
		}
		/*
		 * 返回电话号码或邮箱
		 */
		public String getPhone() {
			return phone;
		}
		/*
		 * 获取电话号码或邮箱
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}
		/*
		 * 返回权限
		 */
		
		public String getSuperuser() {
			return superuser;
		}
		/*
		 * 获取权限
		 */
		public void setSuperuser(String superuser) {
			this.superuser = superuser;
		}
		/*
		 * 返回软删除标识
		 */
		public String getAmputate() {
			return amputate;
		}
		/*
		 * 获取软删除标识
		 */
		public void setAmputate(String amputate) {
			this.amputate = amputate;
		}
	
}
