package com.situ.day2;

import java.util.Scanner;

import org.junit.Test;

public class While {
	@Test
	public void test1() {
		//1��ѭ�������ĳ�ʼ��
		 int i = 1;
		//2��ѭ�������Ŀ���
		 while (i <= 5) {
			System.out.println("HelloWorld!");
			//3��ѭ�������ĸı䣨������ѭ�������Ľ�����
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
		//1��ѭ�������ĳ�ʼ��
		int i = 1;
		//2��ѭ�������Ŀ���
		
		while (i <= 9) {
			System.out.print(i + "*9=" + (i * 9) + "\t");
			//3��ѭ�������ĸı䣨������ѭ�������Ľ�����
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
		System.out.println("�°ɣ�");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num != random) {//û�в¶Ծͼ���ִ��whileѭ��
			if (num > random) {
				System.out.println("̫����");
			} else if (num < random) {
				System.out.println("̫С��");
			}
			
			System.out.println("�°ɣ�");
			num = scanner.nextInt();
		}
		//�¶���
		System.out.println("��ϲ�㣬�¶���");
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
		while (true) {// ����ѭ��
			System.out.println("�°ɣ�");
			int num = scanner.nextInt();
			if (num > random) {
				System.out.println("̫����");
			} else if (num < random) {
				System.out.println("̫С��");
			} else {// num == random
				System.out.println("��ϲ�㣬�¶���");
				break;//������ǰѭ����ֻ�ܵ���һ��ѭ��
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
		System.out.println("���������룺");
		pwd = scanner.nextInt();
	} while (123 != pwd);
}
	
}
