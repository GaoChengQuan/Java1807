package com.situ.day1.homework;

import static org.hamcrest.CoreMatchers.endsWith;

import java.util.Scanner;

import org.junit.Test;

public class Work {

	// 计算某年是不是闰年：
	// 1、能被4整除，但是不能被100整除 &&
	// ||
	// 2、能被400整除
	// () || ()
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}

	// 作业：
	// 1、编写一个收银台收款程序，if
	// 定义输入----单价、数量、金额
	// 定义输出----应收金额、找零
	// 使用double类型变量
	//
	// 2、当总价>=500时候打八折
	//
	// 3、考虑程序出现异常的情况，如：收款金额小于应收金额
	// 若收款金额大于等于应收金额，则计算找零后输出
	// 若收款金额小于应收金额，输出错误信息。
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入单价:");
		double unitPrice = scanner.nextDouble();
		System.out.println("请输入数量：");
		double count  = scanner.nextDouble();
		System.out.println("请输入用户金额：");
		double price =  scanner.nextDouble();
		
		//应收金额
		double  totalPrice = unitPrice *count;
		if (totalPrice >= 500) {
			totalPrice = totalPrice *0.8;
			//totalPrice *= 0.8;
		}
		//找零
		double returnPrice = price - totalPrice;
		if (returnPrice >= 0) {
			System.out.println("应收金额" + totalPrice);
			System.out.println("找零： " + returnPrice);
		} else {
			System.out.println("付款金额不足");
		}
	}
	
	
	
	
	
	
	
	
	

}
