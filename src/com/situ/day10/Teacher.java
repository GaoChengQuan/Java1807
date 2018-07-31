package com.situ.day10;

public class Teacher {
	private String name;
	private int age;
	public static String country = "CN";
	
	//静态代码块
	static {
		System.out.println("Teacher static");
	}
	
	public Teacher() {
		System.out.println("Teacher.Teacher()");
	}
}
