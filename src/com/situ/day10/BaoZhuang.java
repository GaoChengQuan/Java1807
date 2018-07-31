package com.situ.day10;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class BaoZhuang {
	@Test
	public void test1() {
		int[] array = new int[3];
		//ArrayList<int> list = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		//list.add(3.14);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
		//int类型最大值
		System.out.println(Integer.MAX_VALUE);
		
		//自动拆箱和装箱
		//Integer integer = new Integer(4);
		Integer integer = 4;//自动装箱，等价于上面操作
		int i = integer.intValue();
		integer = integer + 2;//自动拆箱, integer.intValue()+2 ，
		//得到的int类型的6又赋值给Integer类型，自动装箱
		System.out.println(integer);
	}
	
	@Test
	public void test22() {
		//包装类.toString(基本数据类型的值)
		String str1 = Integer.toString(3);
		String str2 = Double.toString(3.14);
		
		String string = "4";
		int i = Integer.parseInt(string);
		Integer integer1 = new Integer(4);
		Integer integer2 = new Integer("4");
	}
	
	
	
}
