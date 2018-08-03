package com.situ.day12;

import static org.hamcrest.CoreMatchers.instanceOf;

import javax.net.ssl.SSLSessionBindingEvent;

import org.junit.Test;

public class TTT {
	static long a[] = new long[10];

	public static void main(String args[]) {
		System.out.println(a[6]);
	}

	@Test
	public void test1() {
		StringBuffer buffer = new StringBuffer("abc");
		buffer.reverse().append("ggg");
		System.out.println(buffer);
		if (true) {
			int i = 0;
		}
		i = 3;
	}
}
