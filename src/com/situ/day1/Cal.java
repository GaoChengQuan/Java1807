package com.situ.day1;

import org.junit.Test;

public class Cal {
	
	@Test
	public void test1() {
		// "="������ȵ���˼���Ǹ�ֵ����˼
		// "=="���ж��ǲ������
		int num1 = 3;
		int num2 = 5;
		int result = num1 + num2;
		System.out.println(result);
		System.out.println(num1 + num2);
		System.out.println(8 / 2);//��  4
		System.out.println(8 % 2);//���� 0
		System.out.println(8 / 3);//��  2
		System.out.println(8 % 3);//���� 2
		System.out.println(2 / 7);//��  0
		System.out.println(2 % 7);//���� 2
	}
	
	@Test
	public void test2() {
		System.out.println(3 >= 5);// false
		System.out.println(5 <= 10);// true
	}
	
	@Test
	public void test3() {
		int num1 = 3;
		int num2 = 5;
		num1 = num1 + 1;
		num1++;
		System.out.println(num2++);//��ʹ��num2��ֵ��������
		System.out.println(2 + num2++);// 8
		System.out.println(num2);//7
	}
	
	@Test
	public void test4() {
		int num1 = 3;
		int num2 = 5;
		num1 = num1 + 1;
		num1++;
		System.out.println(--num2);
	}
	
	@Test
	public void test5() {
		int num1 = 3;
		int num2 = 5;
		// &&��·
		System.out.println(num1 < 0 && num1++ < num2);//false
		System.out.println(num1);// 3
		System.out.println(num2);// 5
		// || ��·
		System.out.println(num1 > 0 || num1++ < num2);
		System.out.println(num1);// 3
		System.out.println(num2);// 5
	}
	
	@Test
	public void test6() {
		int num1 = 3;
		int num2 = 5;
		// �﷨��boolean ? ��1 �� ��2
		int max = num1 > num2 ? num1 : num2;
		System.out.println(max);
	}
	
	@Test
	public void test7() {
		int age = 22;
		// �ҵ�������22
		System.out.println("�ҵ�������" + age);
		//��20����     �����Ӽ�
		System.out.println("��" + age + "����");
		System.out.println(10 + 20 + "" + 30);// 3030
		System.out.println("" + 10 + 20 + 30);// 102030
	}
	
	@Test
	public void test8() {
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		System.out.println(!(3 > 5));
		
	}
	
	@Test
	public void test9() {
		int num1 = 3;
		int num2 = 5;
		System.out.println("before num1: " + num1);
		System.out.println("before num2: " + num2);
		
		int temp = num1;//����һ��num1��ֵ
		num1 = num2;
		num2 = temp;
		
		System.out.println("after num1: " + num1);
		System.out.println("after num2: " + num2);
	}

}
