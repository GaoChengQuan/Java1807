package com.situ.day1;

import static org.junit.Assert.assertThat;

import javax.swing.plaf.ViewportUI;

import org.junit.Test;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		int num;
		num = 3;
		num = 4;
		// int ���ͣ�num���������͵�һ������
		int num2 = 4;
		String name = "zhansgan";
		name = "lisi";
		double d = 3.14;
		//num = 3.0;
		
		char ch1 = '��';
		System.out.println(ch1);
		char ch2 = 'a';
		System.out.println(ch2);
		
	}
	
	@Test
	public void ttt() {
		System.out.println("HelloWorld.ttt()");
	}
	
	@Test
	public void test1() {
		int sum  = 1;
		int i = 1;
		while (i <= 100) {
			sum = sum * i;
			i++;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
	
	@Test
public void test4() {
	char ch = 'a'; // 97
	System.out.println(ch);
	System.out.println(ch + 1);// 97+1=98��С�����Զ�����ת��
	System.out.println(ch + 2);// 97+2=99��С�����Զ�����ת��
	System.out.println((char)(ch + 1));// b �Ӵ�С��Ҫǿ������ת��
	System.out.println((char)(ch + 2));// c �Ӵ�С��Ҫǿ������ת��
	char ch2 = '��';
	System.out.println(ch2);//��
}
	
}
