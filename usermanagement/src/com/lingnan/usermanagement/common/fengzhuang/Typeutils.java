package com.lingnan.usermanagement.common.fengzhuang;
import java.io.EOFException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.*;

/*
 * 类型转化与数据的正确性检测（正则表达式）
 * 
 */
public class Typeutils {
		
		public static Date strToDate(String str) {
			Date dt = null;
			/*
			 * 定义一个simpledateformat的对象
			 * 
			 */
				SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					/*
					 * 将字符型数据转化成日期parse(String str)
					 * 
					 */
					dt = adf.parse(str);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					System.out.println("String转date出错，请到fengzhuang下的strToDate查看");
				}
			return dt;			
		}
		
		public static String dateToString(Date dat) {
				String str = null;
				/*
				 * 定义一个simpledateformat的对象
				 * 
				 */
				SimpleDateFormat adf = new SimpleDateFormat("MM-DD-YYYY");
				/*
				 * 用format函数把日期转化成字符串
				 */
				str = adf.format(dat);
			return str;			
		}
		
		public static boolean mailTypeUtil(String str) {
			boolean flag=false;
			/*
			 * 正则表达式，qq邮箱
			 */
				String str1="^[0-9]{5,9}[@][q]{2}[.][c][o][m]$";
				/*
				 * 判断输入的字符串是否符合正则表达式
				 */
				if(str.matches(str1))
					flag=true;			
			return flag;
		}
		
		public static boolean dateCheck(String str) {
			boolean flag=false;
			/*
			 * 正则表达式，日期
			 */
				String str1="^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$";
				/*
				 * 判断输入的日期是否符合正则表达式
				 */
				if(str.matches(str1))flag=true;
			return flag;
		}
		
		public static boolean phoneCheck(String str)
		{
			boolean flag=false;
			/*
			 * 电话号码以1开头接后面10位数字
			 */
			String str1="^1[0-9]{10}";
			/*
			 * 判断是否符合
			 */
			if(str.matches(str1))flag=true;
			return flag;
		}
		

}
