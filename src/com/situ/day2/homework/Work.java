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

	//����1-100�������������ĺ��Լ�����ż���ĺͣ��ֱ��ӡ������
	@Test
	public void test3() {
		int oddSum = 0;//odd ����
		int evenSum = 0;//even ż��
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {//ż��
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("������" + oddSum);
		System.out.println("ż����" + evenSum);
	}
	
	//��forѭ�����1��1000֮���ܱ�5������������ÿ�����3��
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
	
	
	//����9�Ľ׳�
	@Test
	public void test9() {
		// 9!=9*8*7*6...*2*1
		int sum = 1;
		for (int i = 9; i >= 1; i--){
			sum = sum * i;
		}
		System.out.println(sum);
	}
	
//	6����Ŀ����ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ��
//	�������10%���������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�
//	����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣�
//	�����5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ��
//	����60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
//	�Ӽ������뵱��������Ӧ���Ž���������
	@Test
	public void test10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
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

	//ʹ��ѭ����ӡ100-200֮�����е�������ֻ�ܱ�1���Լ�����������������
	@Test
	public void test11() {
		for (int i = 100; i <= 200; i++) {// 135
			boolean isSuShu = true;//��ʼ��Ϊ������
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {//��������
					isSuShu = false;
					break;
				}
			}
			if (isSuShu == true) {
				System.out.println(i + "������");
			}
		}
	}
}
