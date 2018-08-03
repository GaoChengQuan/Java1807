package com.situ.day10.homework;

import org.junit.Test;

public class Work {
	@Test
	public void test1() {
		// String str = "---java Android---";
		// String str = "---java Android";
		// String str = "java Android---";
		String str = "---";
		String trimStr = trim(str);
		System.out.println(trimStr);
	}

	public String trim(String str) {
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		while ((beginIndex <= endIndex) && (str.charAt(beginIndex) == '-')) {
			beginIndex++;
		}
		while ((beginIndex <= endIndex) && (str.charAt(endIndex) == '-')) {
			endIndex--;
		}

		return str.substring(beginIndex, endIndex + 1);
	}

	@Test
	public void test2() {
		String str = "I Love Java！";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

	//2、实现把“I Love Java！”的字符全部转换为小写并输出到控制台。
	@Test
	public void test10() {
		String str = "I LOVE JAVA!";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] + 32);
			}
		}
		String s = new String(arr);
		System.out.println(s);
		for (char c : arr) {
			System.out.print(c);
		}
	}

	// 3、使用String类中的split()函数，统计出“this is my homework! I must finish it!”中单词的个数。
	// （注意：单词之间用一个空格来分隔。）
	@Test
	public void test3() {
		String str = "this is my homework! I must finish it!";
		String[] array = str.split(" ");
		System.out.println(array.length);
		
		int count = 0;
		for (String string : array) {
			count++;
		}
		System.out.println(count);
	}
	
}
