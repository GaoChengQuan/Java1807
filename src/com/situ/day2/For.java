package com.situ.day2;

import org.junit.Test;

public class For {
//	1、循环条件的初始化
//	2、循环条件的控制
//	3、循环条件的改变（趋向于循环条件的结束）
	@Test
	public void test1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("HelloWorld!");
		}
	}
	
	// 1+2+3+4+...+100=5050
	@Test
	public void test2() {
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum :" + sum);
	}
	
	// 计算1-100以内7的倍数的个数
	@Test
	public void test3() {
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {//满足是7的倍数
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count: " + count);
	}
	
	// ****
	// ****
	// ****
	@Test
	public void test4() {
		// ****
		for(int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		// *
		// *
		// *
		for(int i = 1; i <= 3; i++) {
			System.out.println("*");
		}
		System.out.println("------------");
		// i,j,k
		for(int i = 1; i <= 3; i++) { //外层循环控制行数
			for(int j = 1; j <= 4; j++) {//内层循环控制每一行打印多少列
				System.out.print("*");//打印某一行的内容不需要换行
			}
			System.out.println();//打印完一行之后要换行打印下一行
		}
	}
	
//	*
//	**
//	***
//	****
//	*****
	// i=1  1
	// i=2  2
	// i=3  3
	@Test
	public void test5() {
		for(int i = 1; i <= 5; i++) {//外层循环控制行数，只要数一下就可以
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();//打印完一行之后要换行
		}
	}

	@Test
	public void test6() {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j++) {
				// 1*7=7 2*7=14 ...
				//System.out.println(j + "*" + i + "=" + (j * i));
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
	}
	
}
