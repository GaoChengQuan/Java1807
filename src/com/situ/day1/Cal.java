package com.situ.day1;

import org.junit.Test;

public class Cal {
	
	@Test
	public void test1() {
		// "="不是相等的意思，是赋值的意思
		// "=="来判断是不是相等
		int num1 = 3;
		int num2 = 5;
		int result = num1 + num2;
		System.out.println(result);
		System.out.println(num1 + num2);
		System.out.println(8 / 2);//商  4
		System.out.println(8 % 2);//余数 0
		System.out.println(8 / 3);//商  2
		System.out.println(8 % 3);//余数 2
		System.out.println(2 / 7);//商  0
		System.out.println(2 % 7);//余数 2
	}
	
	@Test
	public void test2() {
		System.out.println(3 >= 5);// false
		System.out.println(5 <= 10);// true
	}
	
	@Test
	public void test3() {
		int num1 = 3;
		int num2 = 5;
		num1 = num1 + 1;
		num1++;
		System.out.println(num2++);//先使用num2的值，再自增
		System.out.println(2 + num2++);// 8
		System.out.println(num2);//7
	}
	
	@Test
	public void test4() {
		int num1 = 3;
		int num2 = 5;
		num1 = num1 + 1;
		num1++;
		System.out.println(--num2);
	}
	
	@Test
	public void test5() {
		int num1 = 3;
		int num2 = 5;
		// &&短路
		System.out.println(num1 < 0 && num1++ < num2);//false
		System.out.println(num1);// 3
		System.out.println(num2);// 5
		// || 短路
		System.out.println(num1 > 0 || num1++ < num2);
		System.out.println(num1);// 3
		System.out.println(num2);// 5
	}
	
	@Test
	public void test6() {
		int num1 = 3;
		int num2 = 5;
		// 语法：boolean ? 数1 ： 数2
		int max = num1 > num2 ? num1 : num2;
		System.out.println(max);
	}
	
	@Test
	public void test7() {
		int age = 22;
		// 我的年龄是22
		System.out.println("我的年龄是" + age);
		//我20岁了     豆豆加加
		System.out.println("我" + age + "岁了");
		System.out.println(10 + 20 + "" + 30);// 3030
		System.out.println("" + 10 + 20 + 30);// 102030
	}
	
	@Test
	public void test8() {
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(!(3 > 5));
		
	}
	
	@Test
	public void test9() {
		int num1 = 3;
		int num2 = 5;
		System.out.println("before num1: " + num1);
		System.out.println("before num2: " + num2);
		
		int temp = num1;//备份一下num1的值
		num1 = num2;
		num2 = temp;
		
		System.out.println("after num1: " + num1);
		System.out.println("after num2: " + num2);
	}

}
