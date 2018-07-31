package com.situ.day10;

/*
 * 对数组操作的工具类
 */
public class ArrayUtil {
	//Don't let anyone instantiate this class. init
	//私有化构造方法，保证类的外部不能实例化这个类
	private ArrayUtil() {}
	
	/**
	 * 返回整数类型数组的最大值
	 * @param array 整数类型数组
	 * @return 返回最大值
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	/**
	 * 返回整数类型数组的最小值
	 * @param array 整数类型数组
	 * @return 返回最小值
	 */
	public static int min(int[] array) {
		
		return 0;
	}
	
	/**
	 * 冒泡排序
	 * @param array
	 */
	public static void bubbleSort(int[] array) {
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					//int temp = array[j];
					//array[j] = array[j + 1];
					//array[j + 1] = temp;
					swap(array, j, j + 1);
				}
			}
		}
	}

	/*
	 * 交换数组中任意两个下标对应的值
	 */
	public static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
