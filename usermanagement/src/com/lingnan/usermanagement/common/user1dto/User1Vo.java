package com.lingnan.usermanagement.common.user1dto;

/**
 * �����û�����Ϣ�ࣨUserVo��
 * @author Administrator
 *
 */
public class User1Vo {
		private String userid ;
		private String password;
		private String username;
		private String sex;		
		private String phone;	//��ϵ��ʽ�绰������
		private String superuser;
		private String amputate;
		
		/*
		 * �����˻�
		 */
		public String getUserid() {
			return userid;
		}
		/*
		 * ��ȡ�˻�
		 */
		public void setUserid(String userid) {
			this.userid = userid;
		}
		/*
		 * ��������
		 */
		public String getPassword() {
			return password;
		}
		/*
		 * ��ȡ����
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		/*
		 * �����û���
		 */
		public String getUsername() {
			return username;
		}
		/*
		 * ��ȡ�û���
		 */
		public void setUsername(String username) {
			this.username = username;
		}
		/*
		 * �����Ա�
		 */
		public String getSex() {
			return sex;
		}
		/*
		 * ��ȡ�Ա�
		 */
		public void setSex(String sex) {
			this.sex = sex;
		}
		/*
		 * ���ص绰���������
		 */
		public String getPhone() {
			return phone;
		}
		/*
		 * ��ȡ�绰���������
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}
		/*
		 * ����Ȩ��
		 */
		
		public String getSuperuser() {
			return superuser;
		}
		/*
		 * ��ȡȨ��
		 */
		public void setSuperuser(String superuser) {
			this.superuser = superuser;
		}
		/*
		 * ������ɾ����ʶ
		 */
		public String getAmputate() {
			return amputate;
		}
		/*
		 * ��ȡ��ɾ����ʶ
		 */
		public void setAmputate(String amputate) {
			this.amputate = amputate;
		}
	
}
