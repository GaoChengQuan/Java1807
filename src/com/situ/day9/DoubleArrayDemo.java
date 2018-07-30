package com.situ.day9;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class DoubleArrayDemo {
	@Test
	public void test1() {
		int[] arr1 = new int[3];
		arr1[0] = 3;
		int[] arr2 = { 12, 2, 4 };
		// 定义两行三列的二维数组
		int[][] array1 = new int[2][3];
		array1[0][0] = 3;
		int[][] array2 = { { 2, 4, 5 }, { 2, 4, 7 } };
	}

	@Test
	public void test2() {
		int[][] array = { { 42, 14, 5 }, { 2, 4, 7 } };
		// 定位行（外层循环控制行数）
		for (int i = 0; i < array.length; i++) {
			// 定位每行的元素
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Test
	public void test3() {
		int[][] array = new int[3][];// 定义一个三行的二维数组
		array[0] = new int[2];// 位第一行分配两列
		array[1] = new int[3];// 位第二行分配三列
		array[2] = new int[4];// 位第三行分配四列
		array[0][0] = 1;// 第一行第一列赋值为1
		array[1][1] = 2;// 第二行第二列赋值为2
		array[2][3] = 3;// 第三行第四列赋值为3
		System.out.println(array[0][0]);
		System.out.println(array[1][1]);
		System.out.println(array[2][3]);
	}
	
	@Test
	public void test44() {
		// second mill(千分之一)
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		int[] array = {3, 5, 1, 57, 23, 11, 45};
		//外层循环控制比较多少趟（只需要数一下array.length-1）
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		long endStime = System.currentTimeMillis();
		System.out.println(endStime);
		System.out.println("time: " + (endStime - startTime));
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
