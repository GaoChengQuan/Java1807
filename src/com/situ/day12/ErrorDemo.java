package com.situ.day12;

public class ErrorDemo {
	
	public static void main(String[] args) {
		fun();
	}

	private static void fun() {
		System.out.println("ErrorDemo.fun() start");
		fun();
		System.out.println("ErrorDemo.fun() end");
	}
}
