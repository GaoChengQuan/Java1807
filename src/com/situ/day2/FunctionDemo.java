package com.situ.day2;

import static org.hamcrest.CoreMatchers.instanceOf;

public class FunctionDemo {
	public static void main(String[] args) {
		int num1 = 13;
		int num2 = 5;
		int max;
		if (num1 >= num2) {
			max = num1;
		}else {
			max = num2;
		}
		System.out.println(max);
		System.out.println("----------");
		int maxValue = max(num1, num2);
		System.out.println("maxValue: " + maxValue);
	}
	
	/**
	 * �������������ֵ
	 * @param num1 �������ֵ1
	 * @param num2 �������ֵ2
	 * @return �������ֵ
	 */
	public static int max(int num1, int num2) {
		int max;
		if (num1 >= num2) {
			max = num1;
		}else {
			max = num2;
		}
		return max;
	}
	
	public static int max1(int num1, int num2) {
		//return num1 >= num2 ? num1 : num2;
		int max = num1 >= num2 ? num1 : num2;
		return max;
	}
}
