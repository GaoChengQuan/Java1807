package com.situ.day1.homework;

import static org.hamcrest.CoreMatchers.endsWith;

import java.util.Scanner;

import org.junit.Test;

public class Work {

	// ����ĳ���ǲ������꣺
	// 1���ܱ�4���������ǲ��ܱ�100���� &&
	// ||
	// 2���ܱ�400����
	// () || ()
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = scanner.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}
	}

	// ��ҵ��
	// 1����дһ������̨�տ����if
	// ��������----���ۡ����������
	// �������----Ӧ�ս�����
	// ʹ��double���ͱ���
	//
	// 2�����ܼ�>=500ʱ������
	//
	// 3�����ǳ�������쳣��������磺�տ���С��Ӧ�ս��
	// ���տ�����ڵ���Ӧ�ս��������������
	// ���տ���С��Ӧ�ս����������Ϣ��
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뵥��:");
		double unitPrice = scanner.nextDouble();
		System.out.println("������������");
		double count  = scanner.nextDouble();
		System.out.println("�������û���");
		double price =  scanner.nextDouble();
		
		//Ӧ�ս��
		double  totalPrice = unitPrice *count;
		if (totalPrice >= 500) {
			totalPrice = totalPrice *0.8;
			//totalPrice *= 0.8;
		}
		//����
		double returnPrice = price - totalPrice;
		if (returnPrice >= 0) {
			System.out.println("Ӧ�ս��" + totalPrice);
			System.out.println("���㣺 " + returnPrice);
		} else {
			System.out.println("�������");
		}
	}
	
	
	
	
	
	
	
	
	

}
