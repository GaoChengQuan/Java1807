package com.situ.day2;

import org.junit.Test;

public class For {
//	1��ѭ�������ĳ�ʼ��
//	2��ѭ�������Ŀ���
//	3��ѭ�������ĸı䣨������ѭ�������Ľ�����
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
	
	// ����1-100����7�ı����ĸ���
	@Test
	public void test3() {
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {//������7�ı���
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
		for(int i = 1; i <= 3; i++) { //���ѭ����������
			for(int j = 1; j <= 4; j++) {//�ڲ�ѭ������ÿһ�д�ӡ������
				System.out.print("*");//��ӡĳһ�е����ݲ���Ҫ����
			}
			System.out.println();//��ӡ��һ��֮��Ҫ���д�ӡ��һ��
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
		for(int i = 1; i <= 5; i++) {//���ѭ������������ֻҪ��һ�¾Ϳ���
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();//��ӡ��һ��֮��Ҫ����
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
