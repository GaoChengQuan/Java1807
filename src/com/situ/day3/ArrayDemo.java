package com.situ.day3;

import java.util.Scanner;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(str);
		String[] array = str.split(",");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	@Test
	public void test1() {
		int score1 = 34;
		int score2 = 54;
		int score3 = 74;
		double[] array1 = new double[3];
		int[] array = new int[4];
	}
	
	@Test
	public void test2() {
		int[] array = new int[4];
		array[0] = 12;
		array[1] = 34;
		array[2] = 4;
		array[3] = 56;
		//System.out.println(array[0]);
		//System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			//System.out.println(i);
			System.out.println(array[i]);
		}
		System.out.println("----------");
		//�������
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test5() {
		int[] array = new int[4];
		array[0] = 12;
		array[1] = 34;
		array[2] = 4;
		array[3] = 56;
		int result = sum(array);
		System.out.println("�����ۼӺͣ�" + result);
		//int maxValue = max(array);
		//System.out.println("�����������ֵ: " + maxValue);
	}
	
	public int max(int[] array) {
		int maxValue = array[0];//�ȼٶ���һ����������
		for (int i = 1; i < array.length; i++) {
			//�������Ԫ�غ�maxValue�Ƚϣ������maxValue��
			//�͸���maxValueֵΪ��ǰԪ��
			if (maxValue < array[i]) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	
	/**
	 * ����������ۼӺ�
	 * @param array ��������
	 * @return �ۼӺ�
	 */
	public int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	@Test
	public void test44() {
		int[] array = new int[4];
		array[0] = 12;
		array[1] = 34;
		array[2] = 4;
		array[3] = 56;
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);//array[4]
		}
	}
	
	@Test
	public void countNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����룺");
		String line = scanner.next();
		char[] charLine = line.toCharArray();
		int characterCount = 0;
		int blankCount = 0;
		int digitalCount = 0;
		int otherCount = 0;
		
		for (int i = 0; i < charLine.length; i++) {
			char ch = charLine[i];
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				characterCount++;
			} else if (ch == ' ') {
				blankCount++;
			} else if (ch >= '0' && ch <= '9') {
				digitalCount++;
			} else {
				otherCount++;
			}
		}
		
		System.out.println("�ַ��ĸ����� " + characterCount);
		System.out.println("�ո�ĸ����� " + blankCount);
		System.out.println("���ֵĸ����� " + digitalCount);
		System.out.println("�����ĸ����� " + otherCount);
	}
	
	
	
	
	
	
	
	
	
}
