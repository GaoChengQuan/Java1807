package com.situ.day10;

import java.awt.print.Printable;
import java.security.AlgorithmParameterGenerator;

public class Student {
	private String name;
	public int age;
	//静态变量 所有的实例都共享这个变量
	public static String country = "CN";
	
	public void print() {
		//实例方法是可以访问静态方法的
		show();
	}
	
	public static void show() {
		//静态的方法只能访问静态的方法和静态的属性（因为当前对象的实例可以没有创建，
		//所以静态的方法是没办法调用非静态的方法和属性的）
		country = "US";
		age = 45;
		print();
	}

	public Student() {
		super();
	}
	
	public Student(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
