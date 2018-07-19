package com.situ.day2;

import java.util.Scanner;

import org.junit.Test;

public class While {
	@Test
	public void test1() {
		//1、循环条件的初始化
		 int i = 1;
		//2、循环条件的控制
		 while (i <= 5) {
			System.out.println("HelloWorld!");
			//3、循环条件的改变（趋向于循环条件的结束）
			i++;
		}
		 System.out.println("end");
	}
	
	// 1+2+3+4+...+100=5050
	@Test
	public  void test2() {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			System.out.println(i);
			sum = sum + i; // sum += i;
			i++;
		}
		System.out.println("sum: " + sum);
	}
	
	// 1*9=9	2*9=18   3*9=27 ....  8*9=72   9*9=81
	@Test
	public void test3() {
		//1、循环条件的初始化
		int i = 1;
		//2、循环条件的控制
		
		while (i <= 9) {
			System.out.print(i + "*9=" + (i * 9) + "\t");
			//3、循环条件的改变（趋向于循环条件的结束）
			i++;
		}
	}
	
	@Test
	public void test4() {
		// greater than or equal to 0.0 and less than 1.0.
		// 			0.0-------------0.999999..
		// *1000	0.0-------------999.9999....
		// + 1		1.0-------------1000.999....
		// (int)	1-------------1000
		int random = (int)(Math.random() * 1000 + 1);
		System.out.println(random);
		System.out.println("猜吧！");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num != random) {//没有猜对就继续执行while循环
			if (num > random) {
				System.out.println("太大了");
			} else if (num < random) {
				System.out.println("太小了");
			}
			
			System.out.println("猜吧！");
			num = scanner.nextInt();
		}
		//猜对了
		System.out.println("恭喜你，猜对了");
	}
	
	@Test
	public void test5() {
		// greater than or equal to 0.0 and less than 1.0.
		// 			0.0-------------0.999999..
		// *1000	0.0-------------999.9999....
		// + 1		1.0-------------1000.999....
		// (int)	1-------------1000
		int random = (int)(Math.random() * 1000 + 1);
		System.out.println(random);
		Scanner scanner = new Scanner(System.in);
		while (true) {// 无线循环
			System.out.println("猜吧！");
			int num = scanner.nextInt();
			if (num > random) {
				System.out.println("太大了");
			} else if (num < random) {
				System.out.println("太小了");
			} else {// num == random
				System.out.println("恭喜你，猜对了");
				break;//调出当前循环，只能调出一层循环
			}
		}
		System.out.println("end");
	}
	
	@Test
public void test6() {
	Scanner scanner = new Scanner(System.in);
	int pwd = 0;
	// 123
	do {
		System.out.println("请输入密码：");
		pwd = scanner.nextInt();
	} while (123 != pwd);
}
	
}
