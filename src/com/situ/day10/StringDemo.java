package com.situ.day10;

import org.junit.Test;

public class StringDemo {
	@Test
	public void test1() {
		//如果常量池中没有"abc"这个字符串，就在常量池中new一个字符串
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		System.out.println(str1 == str2);//false
		System.out.println(str1 == str3);//true
		System.out.println(str2 == str3);//false
		if (str1.equals(str2)) {
			System.out.println("equals");
		}
	}
	
	@Test
	public void test2() {
		String str1 = new String("abc");
		String str2 = new String("Abc");
		System.out.println(str1 == str2);//false
		if (str1.equals(str2)) {
			System.out.println("equals");
		}
		if (str1.equalsIgnoreCase(str2)) {//忽略大小写
			System.out.println("equalsIgnoreCase");
		}
	}
	
	
	@Test
	public void test11() {
		String str = "java AndroidA";
		char[] array = str.toCharArray();
		char ch = str.charAt(5);
		System.out.println(ch);// A
		
		System.out.println(str.indexOf('A'));//5
		System.out.println(str.indexOf('X'));//如果未出现该字符，则返回 -1。
		System.out.println(str.indexOf('A', 7));//12
		System.out.println(str.indexOf("And"));//5
		
		System.out.println(str.lastIndexOf('A'));//12
		System.out.println(str.lastIndexOf('A', 7));//5
	}
	
	@Test
	public void test33() {
		String str = "java AndroidA";
		System.out.println(str.contains("And"));//true
		System.out.println(str.startsWith("java A"));//true
		System.out.println(str.startsWith("jaa"));//false
		System.out.println(str.startsWith("And", 5));//true
		System.out.println(str.endsWith("idA"));//true
		System.out.println(str.isEmpty());//false
		System.out.println("".isEmpty());//true
	}
	
	@Test
	public void test44() {
		//String str = "java And";
		char[] array = {'j', 'a', 'v', 'a', ' ', 'A', 'n', 'd'};
		String str = new String(array);
		System.out.println(str);// java And
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.out.print(c + " ");
		}
	}
	
	@Test
	public void test55() {
		String str = "java AndroidA";
		System.out.println(str.replace('A', 'B'));
	}
	
	@Test
	public void test66() {
		String str = "java AndroidA";
		String[] array = str.split(" ");
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	@Test
	public void test77() {
		String str = "java AndroidA";
		System.out.println(str.substring(5));//AndroidA
		System.out.println(str.substring(5, 8));//And
	}
	
	@Test
	public void test88() {
		String str = "   java Android    ";
		System.out.println(str);//   java Android    
		System.out.println(str.trim());//java Android
	}
}
