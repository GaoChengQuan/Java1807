package com.situ.day3;

import java.util.Scanner;

import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Switch {
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();
		switch (month) {
		case 1:
			System.out.println("31��");
			break;
		case 2:
			System.err.println("28��");
			break;
		case 3:
			System.out.println("31��");
			break;
		case 4:
			break;
		case 5:
			System.out.println("31��");
			break;
		case 6:
			break;
		case 7:
			break;
		case 12:
			System.out.println("31��");
			break;
		}
	}

	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = scanner.nextInt();
		if (month <0 || month > 12) {
			System.out.println("�Ƿ�������");
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
			System.out.println("31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.err.println("30��");
			break;
		case 2:
			// �� �û�������ݣ������ǲ��������ж�������
			//if (() || ()) {
			//	
			//}
		default:
			System.out.println("������ķǷ�");
			System.out.println("default");
			break;
		}
	}
	
	//����ѧ���ɼ��ĵǼǣ�ʹ��switch
	@Test
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�:");
		int score = scanner.nextInt();
		if (score < 0 || score >100) {
			System.out.println("�Ƿ�������");
			return;
		}
		
		switch (score / 10) {
		case 6:// [60-69]
			System.out.println("����");
			break;
		case 7:
			System.out.println("һ��");
			break;
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
			System.out.println("����");
			break;
		default:
			System.out.println("������");
			break;
		}
	}
	
	
	
}
