package com.situ.day3.homework;

import java.util.Scanner;

import org.junit.Test;

public class Work {

	//1、int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
	//求出上面数组中0-9分别出现的次数
	@Test
	public void test1() {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 0) {
				count0++;
			} else if (score[i] == 1) {
				count1++;
			} else if (score[i] == 2) {
				count2++;
			}
		}
		System.out.println("0出现次数：" + count0);
		System.out.println("1出现次数：" + count1);
		System.out.println("2出现次数：" + count2);
	}
	
	@Test
	public void test2() {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] countArray = new int[10];
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				countArray[0]++;//countArray[0]存放0出现次数
				break;
			case 1:
				countArray[1]++;//countArray[1]存放1出现的次数
				break;
			case 2:
				countArray[2]++;//countArray[2]存放2出现的次数
				break;
			case 3:
				countArray[3]++;//countArray[3]存放3出现的次数
				break;
			case 4:
				countArray[4]++;//countArray[4]存放4出现的次数
				break;
			case 9:
				countArray[9]++;//countArray[9]存放9出现的次数
				break;
			default:
				System.out.println("default: " + score[i]);
				break;
			}
		}
		//System.out.println("0出现次数：" + countArray[0]);
		//System.out.println("1出现次数：" +  countArray[1]);
		//System.out.println("2出现次数：" +  countArray[2]);
		for (int i = 0; i < countArray.length; i++) {
			System.out.println(i + "出现次数：" + countArray[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 5, 1, 0, 5, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		System.out.println(score.length);
		int count = 0;
		for (int i = 0; i <= 9; i++) {// 10
			for (int k = 0; k < score.length; k++) {// 30
				if (i == score[k]) {// 10*30=300
					count++;
				}
			}
			System.out.println("数字" + i + "出现了" + count + "次");
			count = 0;
		}

	}

	//2、int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
	//要求求出其中的奇数个数和偶数个数。
	@Test
	public void test3() {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int jiShuCount = 0;
		int	ouShuCount = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 2 == 0) {
				ouShuCount++;
			} else {
				jiShuCount++;
			}
		}
		System.out.println("奇数个数： " + jiShuCount);
		System.out.println("偶数个数： " + ouShuCount);
	}
	
	//3、输入一组学生的成绩，使用数组，然后计算他们的平均值.
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int count = scanner.nextInt();
		int[] scores = new int[count];
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入学生成绩： ");
			scores[i] = scanner.nextInt();
			sum = sum + scores[i];
		}
		System.out.println("学生的平均成绩： " + (sum / scores.length));
	}
	
	
	//题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	@Test
	public void test6() {
		String str = "12321";
		char[] array = str.toCharArray();
		boolean isHuiWen = true;//初始认为就是回文
		for (int i = 0; i < array.length / 2; i++) {
			// i=0    array.length-1  
			// i=1    array.length-2
			if (array[i] != array[array.length - i -1]) {
				isHuiWen = false;//有一个不想想等的就不是回文
				break;
			}
		}
		if (isHuiWen) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
	}

	//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
	@Test
	public void test66() {
		System.out.println("请输入一行字符:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] array = str.toCharArray();
		int digital = 0;//统计出现数字个数
		int character = 0;//统计出现字符个数
		int blank = 0;
		int other = 0;
		for (int i = 0; i < array.length; i++) {
			char ch = array[i];
			if ((ch >= 'a' && ch <= 'z') 
					|| (ch >= 'A' && ch <= 'Z') ) {
				character++;
			} else if (ch >= '0' && ch <= '9') {
				digital++;
			} else if (ch == ' ') {
				blank++;
			} else {
				other++;
			}
		}
		System.out.println("数字个数： " + digital);
		System.out.println("字母个数： " + character);
		System.out.println("空格个数： " + blank);
		System.out.println("其他个数： " + other);
	}
	
	//题目：输入三个整数x,y,z，请把这三个数由小到大输出。
	@Test
	public void test7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个数字：");
		int x = scanner.nextInt();
		System.out.println("输入第二个数字：");
		int y = scanner.nextInt();
		System.out.println("输入第三个数字：");
		int z = scanner.nextInt();
		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		if (x > z) {
			int temp = x;
			x = z;
			z = temp;
		}
		//到这里，x分别和y和z比较，x现在就是最小值
		//接下来只要比较y和z就可以
		if (y > z) {
			int temp = y;
			y = z;
			z = temp;
		}
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}
	
	
	
	
}
