package com.situ.day11;

import org.junit.Test;

public class StringDemo {
	@Test
	public void test1() {
		String str1 = "Hello";
		String str2 = "Java";
		String str3 = "Android";
		String str4 = "Python";
		String str = str1 + str2 + str3;
		System.out.println(str);
		
		StringBuilder builder = new StringBuilder(str1);//Hello
		builder.append(str2);//HelloJava
		builder.append(str3);//HelloJavaAndroid
		builder.append(str4);//HelloJavaAndroidPython
		System.out.println(builder);
		
		//链式编程
		StringBuilder builder2 = new StringBuilder(str1);
		builder2.append(str2).append(str3).append(str4);
		System.out.println(builder2);
	}
}
