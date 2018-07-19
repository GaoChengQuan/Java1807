package com.situ.day1;

import java.util.Scanner;

import org.junit.Test;

public class If {
	@Test
	public void test1() {
		//判断学生成绩的登记
		//>=90   <=100   优秀 
		//>=80    <90       良好
		//>=70    <80       一般
		//>=60    <70      及格
		//<60                    不及格
		Scanner scanner = new Scanner(System.in);
		//int num = 37;
		System.out.println("请输入学生的成绩：");
		int num = scanner.nextInt();
		
		if (num < 0 || num > 100) {
			System.out.println("输入的成绩非法！");
			return;//遇到这个return，下面代码都不执行
		}
		
		if (num >= 90) {
			System.out.println("优秀");
		} else if (num >= 80 && num < 90) {
			System.out.println("良好");
		} else if (num >= 70 && num < 80) {
			System.out.println("一般");
		} else if (num >= 60 && num < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
	
	@Test
	public void test11() {
		int num = 600;
		if ((num % 4 == 0 && num % 100 != 0) 
				|| (num % 400 == 0)) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}
}
