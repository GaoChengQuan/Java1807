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
		// System.out.println(array[0]);
		// System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {
			// System.out.println(i);
			System.out.println(array[i]);
		}
		System.out.println("----------");
		// 逆序输出
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
		System.out.println("数组累加和：" + result);
		// int maxValue = max(array);
		// System.out.println("数组里面最大值: " + maxValue);
	}

	public int max(int[] array) {
		int maxValue = array[0];// 先假定第一个数是最大的
		for (int i = 1; i < array.length; i++) {
			// 数组后面元素和maxValue比较，如果比maxValue大，
			// 就更新maxValue值为当前元素
			if (maxValue < array[i]) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	/**
	 * 返回数组的累加和
	 * 
	 * @param array
	 *            传入数组
	 * @return 累加和
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
			System.out.println(array[i]);// array[4]
		}
	}

	@Test
	public void countNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("情输入：");
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

		System.out.println("字符的个数： " + characterCount);
		System.out.println("空格的个数： " + blankCount);
		System.out.println("数字的个数： " + digitalCount);
		System.out.println("其他的个数： " + otherCount);
	}

}
