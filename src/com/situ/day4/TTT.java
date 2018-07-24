package com.situ.day4;

import org.junit.Test;

public class TTT {
	static char ch;
	public static void main(String[] args) {
		System.out.println('\u0000' == '\0');
		System.out.println(ch == '\u0000');
		if (ch == 0) {
			System.out.println("sss");
		}
		char[] array = new char[2];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
