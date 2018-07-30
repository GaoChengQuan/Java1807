package com.situ.day9.homework;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;
import org.junit.experimental.theories.FromDataPoints;

public class Work {
	// 编写一个程序，计算一维数组中的最大值、最小值。
	public static void main(String[] args) {
		int[] array = new int[] { 2, 45, 1, 67, 89, 12, 56 };
		int max = array[0];// 假设array[0]是最大值
		int min = array[0];// 假设array[0]是最小值
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {// 遍历时候找到比当前max更大值，更新max值
				max = array[i];
			}
			if (array[i] < min) {// 遍历时候找到比当前min更小值，更新min值
				min = array[i];
			}
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	}

	// 2．将一个数组中的数逆序重新存放。
	@Test
	public void test1() {
		int[] array = new int[] { 2, 45, 1, 67, 89, 12, 56 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int front = 0;
		int rear = array.length - 1;
		// 不管数组元素是奇数还是偶数个，比较次数都是< array.length / 2
		for (int i = 0; i < array.length / 2; i++) {
			// 将front下标和rear下标对应的数组元素交换
			int temp = array[front];
			array[front] = array[rear];
			array[rear] = temp;

			front += 1;
			rear -= 1;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	@Test
	public void test2() {
		int[] sum = new int[] { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < sum.length / 2; i++) {
			int temp = sum[sum.length - 1 - i];
			sum[sum.length - 1 - i] = sum[i];
			sum[i] = temp;
		}
		for (int i : sum) {
			System.out.println(i);
		}
	}
}
