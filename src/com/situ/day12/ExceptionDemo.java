package com.situ.day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class ExceptionDemo {
	@Test
	public void test1() {
		int num = 10;
		//
		System.out.println(2 / num);
		
		try {
			FileInputStream file = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 1;
		System.out.println("----start---");
		try {
			//需要检测的代码(可能会抛出异常，也可能不会抛出异常)
			int result = num1 / num2;
			int[] array = new int[2];
			array[2] = 3;
		} catch (ArithmeticException e) {
			// 捕获异常后处理异常
			System.out.println("catch ArithmeticException");
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (Exception e) {
			//应该捕获具体的异常，除非实在找不出这个问题，可以用catch(Exception)
			//保证程序先别崩溃，后面再找原因。
			System.out.println("Exception");
			e.printStackTrace();
		}finally {
			// 一定会被执行的代码(不管异常抛不抛出都会执行，例如数据库释放连接)
			System.out.println("---finally----");
		}
		System.out.println("----end----");
	}
	
	public static void main1(String[] args) {
		int num1 = 3;
		int num2 = 0;
		System.out.println("----start---");
		try {
			//需要检测的代码(可能会抛出异常，也可能不会抛出异常)
			int result = num1 / num2;
			int[] array = new int[2];
			array[2] = 3;
		} catch(Exception e) {//尽量不要用所有异常的父类来处理所有情况，
			//应该捕获具体的异常，除非实在找不出这个问题，可以用catch(Exception)
			//保证程序先别崩溃，后面再找原因。
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			// 一定会被执行的代码(不管异常抛不抛出都会执行，例如数据库释放连接)
			System.out.println("---finally----");
		}
		System.out.println("----end----");
		
	}
	
	@Test
	public void test22() {
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		FileInputStream file = new FileInputStream("b.txt");
	}
	
	@Test
	public void test222() {
		try {
			fun();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public void fun() throws IllegalAccessException {
		System.out.println("ExceptionDemo.fun()");
		//....
		//这里做了非法访问，认为是一个严重的错误，我主动抛出异常。
		throw new IllegalAccessException("非法访问");
	}
	
	public void fun1() {
		System.out.println("ExceptionDemo.fun()");
		//....
		//这里做了非法访问，认为是一个严重的错误，我主动抛出异常。
		try {
			throw new IllegalAccessException("非法访问");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void ttt() {
		func();
	}

	private void func() throws  NullPointerException{
		throw new NullPointerException();
	}
	
	
}
