package com.situ.day4;

import org.junit.Test;

public class BreakContinue {
	@Test
	public void test1() {
		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
	
	@Test
	public void test2() {
		for (int i = 0; i < 6; i++) {
			if (i == 3) {
				break;
			}
			System.out.print(i + " ");
		}
	}
	
	@Test
	public void test3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println(i + " ");
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
	}
	
	/**
	 * 返回数组的累加和
	 * @param array 传入数组
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
		char[] array = new char[2];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
