package com.situ.day3;

import java.util.Scanner;

import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Switch {
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		switch (month) {
		case 1:
			System.out.println("31天");
			break;
		case 2:
			System.err.println("28天");
			break;
		case 3:
			System.out.println("31天");
			break;
		case 4:
			break;
		case 5:
			System.out.println("31天");
			break;
		case 6:
			break;
		case 7:
			break;
		case 12:
			System.out.println("31天");
			break;
		}
	}

	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		if (month <0 || month > 12) {
			System.out.println("非法的输入");
			return;
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.err.println("30天");
			break;
		case 2:
			// 让 用户输入年份，根据是不是闰年判读多少天
			//if (() || ()) {
			//	
			//}
		default:
			System.out.println("您输入的非法");
			System.out.println("default");
			break;
		}
	}
	
	//计算学生成绩的登记，使用switch
	@Test
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生成绩:");
		int score = scanner.nextInt();
		if (score < 0 || score >100) {
			System.out.println("非法的输入");
			return;
		}
		
		switch (score / 10) {
		case 6:// [60-69]
			System.out.println("及格");
			break;
		case 7:
			System.out.println("一般");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 9:
		case 10:
			System.out.println("优秀");
			break;
		default:
			System.out.println("不及格");
			break;
		}
	}
}
