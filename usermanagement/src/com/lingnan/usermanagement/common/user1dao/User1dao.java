package com.lingnan.usermanagement.common.user1dao;

import java.util.List;

import com.lingnan.usermanagement.common.user1dto.User1Vo;

/**
 * �û�����ʵ�ֵ�dao�����Ľӿ�
 * @author Administrator
 *
 */
public interface User1dao extends Basedao {
	/**
	 * ��¼��id���û�������������ƥ�伴��
	 * @param user id���û���
	 * @param password ����
	 * @return �ɹ�һ�������
	 */
	public User1Vo login(String user,String password);
	
	
	/**
	 * @param uv ����һ��UserVo�Ķ���
	 * @return �ɹ�����true ,ʧ�ܷ���false
	 */
	public boolean addUser1(User1Vo uv); 
	
	/**
	 * @param userid �����û���id������ɾ������
	 * @return �ɹ�����true�� ʧ�ܷ���flase
	 */
	public boolean deleteuser1(String userid);
	
	/**
	 * ����һ��UserVo�Ķ���,ͨ��id���������ݽ����޸�
	 * @param uv 
	 * @return �ɹ�����true�� ʧ�ܷ���flase
	 */
	public boolean updateuser1(User1Vo uv);
	
	/**
	 * ����Ա�鿴ȫ����Ϣ
	 * @return ����һ��������ļ���
	 */
	public List<User1Vo> FindAllInfo();
	
	/**
	 * ������Ҫ���ҵ�ID
	 * @param userid
	 * @return �ɹ�����һ���������ʧ�ܻ�������Ϊ���򷵻�null
	 */
	public User1Vo FindIdInfo(String userid);
	
	/**
	 * ������Ҫ���ҵ�ID
	 * @param 
	 * @return �ɹ�����һ���������ʧ�ܻ�������Ϊ���򷵻�null
	 */
	public User1Vo FindNameInfo(String Name);
	
}
