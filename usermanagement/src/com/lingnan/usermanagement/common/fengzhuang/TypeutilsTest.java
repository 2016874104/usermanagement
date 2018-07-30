package com.lingnan.usermanagement.common.fengzhuang;

import static org.junit.Assert.*;

import org.junit.Test;

public class TypeutilsTest {
//	@Test
//	public void testStrToDate() {
//		System.out.println("转化后的日期是："+Typeutils.strToDate("2018-04-10"));
//	}

//	@Test
//	public void testDateToString() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testMailTypeUtil() {
//		System.out.println("1字符串符合邮箱的格式吗？？回答是"+Typeutils.mailTypeUtil("1"));
//		System.out.println("11111字符串符合邮箱的格式吗？？回答是"+Typeutils.mailTypeUtil("11111"));
//		System.out.println("777@qq.com字符串符合邮箱的格式吗？？回答是"+Typeutils.mailTypeUtil("777@qq.com"));
//		System.out.println("737481564@qq.com字符串符合邮箱的格式吗？？回答是"+Typeutils.mailTypeUtil("737481564@qq.com"));
//	}

	@Test
	public void testDateCheck() {
		System.out.println("1字符串符合日期的格式吗？？回答是"+Typeutils.dateCheck("1"));
		System.out.println("1222字符串符合日期的格式吗？？回答是"+Typeutils.dateCheck("1222"));
		System.out.println("2018-07-28字符串符合日期的格式吗？？回答是"+Typeutils.dateCheck("2018-07-28"));
		System.out.println("2018-7-28字符串符合日期的格式吗？？回答是"+Typeutils.dateCheck("2018-7-28"));
	}

}
