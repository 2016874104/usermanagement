package com.lingnan.usermanagement.common.fengzhuang;
import java.io.EOFException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.*;

/*
 * ����ת�������ݵ���ȷ�Լ�⣨������ʽ��
 * 
 */
public class Typeutils {
		
		public static Date strToDate(String str) {
			Date dt = null;
			/*
			 * ����һ��simpledateformat�Ķ���
			 * 
			 */
				SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					/*
					 * ���ַ�������ת��������parse(String str)
					 * 
					 */
					dt = adf.parse(str);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					System.out.println("Stringתdate�����뵽fengzhuang�µ�strToDate�鿴");
				}
			return dt;			
		}
		
		public static String dateToString(Date dat) {
				String str = null;
				/*
				 * ����һ��simpledateformat�Ķ���
				 * 
				 */
				SimpleDateFormat adf = new SimpleDateFormat("MM-DD-YYYY");
				/*
				 * ��format����������ת�����ַ���
				 */
				str = adf.format(dat);
			return str;			
		}
		
		public static boolean mailTypeUtil(String str) {
			boolean flag=false;
			/*
			 * ������ʽ��qq����
			 */
				String str1="^[0-9]{5,9}[@][q]{2}[.][c][o][m]$";
				/*
				 * �ж�������ַ����Ƿ����������ʽ
				 */
				if(str.matches(str1))
					flag=true;			
			return flag;
		}
		
		public static boolean dateCheck(String str) {
			boolean flag=false;
			/*
			 * ������ʽ������
			 */
				String str1="^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$";
				/*
				 * �ж�����������Ƿ����������ʽ
				 */
				if(str.matches(str1))flag=true;
			return flag;
		}
		
		public static boolean phoneCheck(String str)
		{
			boolean flag=false;
			/*
			 * �绰������1��ͷ�Ӻ���10λ����
			 */
			String str1="^1[0-9]{10}";
			/*
			 * �ж��Ƿ����
			 */
			if(str.matches(str1))flag=true;
			return flag;
		}
		

}
