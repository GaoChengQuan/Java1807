package com.situ.day4;

public class Student {
	//属性
	int id;
	String name;
	int age;
	String className;
	
	//无参构造方法
	public Student() {
		System.out.println("Student.Student()");
	}
	//有参数构造方法
	public Student(int id, String name, int age, String className) {
		//The assignment to variable id has no effect
		System.out.println("Student.Student()");
		this.id = id;
		this.name = name;
		this.age = age;
		this.className = className;
	}
	
	//方法（功能）
	void study() {
		System.out.println(className + "班的" + name + "正在学习");
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", className=" + className + "]";
	}
	
	
	
}
