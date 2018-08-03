package com.situ.day11.homework;

import java.util.ArrayList;

import org.junit.Test;

public class Work {
	//1、实现函数public String[] toArray(List<String> list)，
	//其中参数list中元素类型为String字符串。
	@Test
	public void test1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		String[] array  = toArray(list);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private String[] toArray(ArrayList<String> list) {
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		return array;
	}
	
	//2、（有一定难度）获取一个字符串在另一个字符串中出现的次数。
	//  "abkkcdkkefkkskk"   "kk"
	// public static int getSubCount(String str, String key) ;
	public static void main(String[] args) {
		String str = "abkkcdkkefkkskk";
		String key = "kk";
		int count = getSubCount(str, key);
		System.out.println(key + "出现的次数: " + count);
	}

	public static int getSubCount1(String str, String key) {
		int index = 0;
		int count = 0;
		index = str.indexOf(key, index);
		System.out.println(index);//2
		
		index = index + key.length();
		index = str.indexOf(key, index);
		System.out.println(index);//6
		
		index = index + key.length();
		index = str.indexOf(key, index);
		System.out.println(index);//10
		
		index = index + key.length();
		index = str.indexOf(key, index);
		System.out.println(index);//13
		
		index = index + key.length();
		index = str.indexOf(key, index);
		System.out.println(index);//-1
		
		return count;
	}
	
	public static int getSubCount(String str, String key) {
		int index = 0;
		int count = 0;
		//index = index + key.length();
		//index = str.indexOf(key, index);
		//System.out.println(index);//13
		
		while ((index = str.indexOf(key, index)) != -1) {
			count++;
			index = index + key.length();
		}
		
		return count;
	}
	
}
