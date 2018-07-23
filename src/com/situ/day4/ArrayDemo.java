package com.situ.day4;

import org.junit.Test;

public class ArrayDemo {

	@Test
	public void test1() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		boolean[] boolArray = new boolean[10];
		for (int i = 0; i < boolArray.length; i++) {
			System.out.print(boolArray[i] + " ");
		}
		System.out.println();
		double[] doubleArray = new double[10];
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + " ");
		}
		System.out.println();
		String[] strArray = new String[10];
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i] + " ");
		}
	}
}
