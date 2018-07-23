package com.situ.day1;

import org.junit.Test;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int num;
		num = 3;
		num = 4;
		// int 类型，num是这种类型的一个变量
		int num2 = 4;
		String name = "zhansgan";
		name = "lisi";
		double d = 3.14;
		// num = 3.0;

		char ch1 = '中';
		System.out.println(ch1);
		char ch2 = 'a';
		System.out.println(ch2);

	}

	@Test
	public void ttt() {
		System.out.println("HelloWorld.ttt()");
	}

	@Test
	public void test1() {
		int sum = 1;
		int i = 1;
		while (i <= 100) {
			sum = sum * i;
			i++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

	@Test
	public void test4() {
		char ch = 'a'; // 97
		System.out.println(ch);
		System.out.println(ch + 1);// 97+1=98从小到大自动类型转换
		System.out.println(ch + 2);// 97+2=99从小到大自动类型转换
		System.out.println((char) (ch + 1));// b 从大到小需要强制类型转换
		System.out.println((char) (ch + 2));// c 从大到小需要强制类型转换
		char ch2 = '中';
		System.out.println(ch2);// 中
	}

}
