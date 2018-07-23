package com.situ.day3.homework;

import java.util.Scanner;

import org.junit.Test;

public class Work {

	//1��int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
	//�������������0-9�ֱ���ֵĴ���
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
		System.out.println("0���ִ�����" + count0);
		System.out.println("1���ִ�����" + count1);
		System.out.println("2���ִ�����" + count2);
	}
	
	@Test
	public void test2() {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] countArray = new int[10];
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				countArray[0]++;//countArray[0]���0���ִ���
				break;
			case 1:
				countArray[1]++;//countArray[1]���1���ֵĴ���
				break;
			case 2:
				countArray[2]++;//countArray[2]���2���ֵĴ���
				break;
			case 3:
				countArray[3]++;//countArray[3]���3���ֵĴ���
				break;
			case 4:
				countArray[4]++;//countArray[4]���4���ֵĴ���
				break;
			case 9:
				countArray[9]++;//countArray[9]���9���ֵĴ���
				break;
			default:
				System.out.println("default: " + score[i]);
				break;
			}
		}
		//System.out.println("0���ִ�����" + countArray[0]);
		//System.out.println("1���ִ�����" +  countArray[1]);
		//System.out.println("2���ִ�����" +  countArray[2]);
		for (int i = 0; i < countArray.length; i++) {
			System.out.println(i + "���ִ�����" + countArray[i]);
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
			System.out.println("����" + i + "������" + count + "��");
			count = 0;
		}

	}

	//2��int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
	//Ҫ��������е�����������ż��������
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
		System.out.println("���������� " + jiShuCount);
		System.out.println("ż�������� " + ouShuCount);
	}
	
	//3������һ��ѧ���ĳɼ���ʹ�����飬Ȼ��������ǵ�ƽ��ֵ.
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int count = scanner.nextInt();
		int[] scores = new int[count];
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("������ѧ���ɼ��� ");
			scores[i] = scanner.nextInt();
			sum = sum + scores[i];
		}
		System.out.println("ѧ����ƽ���ɼ��� " + (sum / scores.length));
	}
	
	
	//��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	@Test
	public void test6() {
		String str = "12321";
		char[] array = str.toCharArray();
		boolean isHuiWen = true;//��ʼ��Ϊ���ǻ���
		for (int i = 0; i < array.length / 2; i++) {
			// i=0    array.length-1  
			// i=1    array.length-2
			if (array[i] != array[array.length - i -1]) {
				isHuiWen = false;//��һ��������ȵľͲ��ǻ���
				break;
			}
		}
		if (isHuiWen) {
			System.out.println("�ǻ���");
		} else {
			System.out.println("���ǻ���");
		}
	}

	//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
	@Test
	public void test66() {
		System.out.println("������һ���ַ�:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] array = str.toCharArray();
		int digital = 0;//ͳ�Ƴ������ָ���
		int character = 0;//ͳ�Ƴ����ַ�����
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
		System.out.println("���ָ����� " + digital);
		System.out.println("��ĸ������ " + character);
		System.out.println("�ո������ " + blank);
		System.out.println("���������� " + other);
	}
	
	//��Ŀ��������������x,y,z���������������С���������
	@Test
	public void test7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ�����֣�");
		int x = scanner.nextInt();
		System.out.println("����ڶ������֣�");
		int y = scanner.nextInt();
		System.out.println("������������֣�");
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
		//�����x�ֱ��y��z�Ƚϣ�x���ھ�����Сֵ
		//������ֻҪ�Ƚ�y��z�Ϳ���
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
