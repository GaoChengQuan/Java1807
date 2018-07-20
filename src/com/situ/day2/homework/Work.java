package com.situ.day2.homework;

import java.util.Scanner;

import org.junit.Test;

public class Work {
//	1
//	12
//	123
//	1234
//	12345
	// i=1 	1
	// i=2  12
	@Test
	public void test1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
//	 	 *
//	    ***
//	   *****
//	  *******
//	 *********
//	***********
	// i=1    5
	// i=2    4
	// i=3    3
	// i=4    2
	
	// i=1 	  1
	// i=2 	  3
	// i=3 	  5
	// i=4 	  7
	// 2*i-1=j
	@Test
	public void test2() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//计算1-100以内所有奇数的和以及所有偶数的和，分别打印出来。
	@Test
	public void test3() {
		int oddSum = 0;//odd 奇数
		int evenSum = 0;//even 偶数
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {//偶数
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("奇数：" + oddSum);
		System.out.println("偶数：" + evenSum);
	}
	
	//用for循环输出1—1000之间能被5整除的数，且每行输出3个
	@Test
	public void test7() {
		int count = 0;
		for (int i =1; i <= 1000; i++) {
			if (i % 5 == 0) {
				System.out.print(i + "\t");
				count++;
				/*if (count == 3) {
					System.out.println();
					count = 0;
				}*/
				if (count % 3 == 0) {
					System.out.println();
				}
			}
		}
	}
	
	@Test
	public void test8() {
		for (int i =1; i <= 1000; i++) {
			if (i % 5 == 0) {
				System.out.print(i + "\t");
			}
			if (i % 15 == 0) {
				System.out.println();
			}
		}
	}
	
	
	//计算9的阶乘
	@Test
	public void test9() {
		// 9!=9*8*7*6...*2*1
		int sum = 1;
		for (int i = 9; i >= 1; i--){
			sum = sum * i;
		}
		System.out.println(sum);
	}
	
//	6、题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，
//	奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
//	高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，
//	可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，
//	高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
//	从键盘输入当月利润，求应发放奖金总数？
	@Test
	public void test10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请如数利润：");
		double liRun  = scanner.nextDouble();
		double jiangJin = 0;
		if (liRun > 0 && liRun <= 10) {
			jiangJin = liRun * 0.1;
		} else if (liRun > 10 && liRun <= 20) {
			jiangJin = 10 * 0.1 + (liRun - 10) * 0.075;
		} else if (liRun > 20 && liRun <= 40) {
			jiangJin = 10 * 0.1 + 10 * 0.075 + (liRun - 20) * 0.05;
		}
		
		System.out.println(jiangJin);
	}

	//使用循环打印100-200之间所有的素数（只能被1和自己整除的数叫素数）
	@Test
	public void test11() {
		for (int i = 100; i <= 200; i++) {// 135
			boolean isSuShu = true;//初始认为是素数
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {//不是素数
					isSuShu = false;
					break;
				}
			}
			if (isSuShu == true) {
				System.out.println(i + "是素数");
			}
		}
	}
}
