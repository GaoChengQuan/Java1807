package com.situ.day1;

import java.util.Scanner;

import org.junit.Test;

public class If {
	@Test
	public void test1() {
		//�ж�ѧ���ɼ��ĵǼ�
		//>=90   <=100   ���� 
		//>=80    <90       ����
		//>=70    <80       һ��
		//>=60    <70      ����
		//<60                    ������
		Scanner scanner = new Scanner(System.in);
		//int num = 37;
		System.out.println("������ѧ���ĳɼ���");
		int num = scanner.nextInt();
		
		if (num < 0 || num > 100) {
			System.out.println("����ĳɼ��Ƿ���");
			return;//�������return��������붼��ִ��
		}
		
		if (num >= 90) {
			System.out.println("����");
		} else if (num >= 80 && num < 90) {
			System.out.println("����");
		} else if (num >= 70 && num < 80) {
			System.out.println("һ��");
		} else if (num >= 60 && num < 70) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
	}
	
	@Test
	public void test11() {
		int num = 600;
		if ((num % 4 == 0 && num % 100 != 0) 
				|| (num % 400 == 0)) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
	}
}
