package com.lingnan.usermanagement.common.fengzhuang;

import static org.junit.Assert.*;

import org.junit.Test;

public class TypeutilsTest {
//	@Test
//	public void testStrToDate() {
//		System.out.println("ת����������ǣ�"+Typeutils.strToDate("2018-04-10"));
//	}

//	@Test
//	public void testDateToString() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testMailTypeUtil() {
//		System.out.println("1�ַ�����������ĸ�ʽ�𣿣��ش���"+Typeutils.mailTypeUtil("1"));
//		System.out.println("11111�ַ�����������ĸ�ʽ�𣿣��ش���"+Typeutils.mailTypeUtil("11111"));
//		System.out.println("777@qq.com�ַ�����������ĸ�ʽ�𣿣��ش���"+Typeutils.mailTypeUtil("777@qq.com"));
//		System.out.println("737481564@qq.com�ַ�����������ĸ�ʽ�𣿣��ش���"+Typeutils.mailTypeUtil("737481564@qq.com"));
//	}

	@Test
	public void testDateCheck() {
		System.out.println("1�ַ����������ڵĸ�ʽ�𣿣��ش���"+Typeutils.dateCheck("1"));
		System.out.println("1222�ַ����������ڵĸ�ʽ�𣿣��ش���"+Typeutils.dateCheck("1222"));
		System.out.println("2018-07-28�ַ����������ڵĸ�ʽ�𣿣��ش���"+Typeutils.dateCheck("2018-07-28"));
		System.out.println("2018-7-28�ַ����������ڵĸ�ʽ�𣿣��ش���"+Typeutils.dateCheck("2018-7-28"));
	}

}
