package com.situ.day5;

import java.security.AlgorithmParameterGenerator;

//实体类
public class Student {
	private int id;
	private String name;
	private int age;
	private String className;
	
	//无参构造方法
	public Student() {
	}
	
	public Student(int id, String name, int age, String className) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.className = className;
	}
	
	public Student(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
		//对非法的年龄进行控制
		if (age > 0 && age < 120) {
			this.age = age;
		}
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void study() {
		System.out.println(className + "班的" + name + "正在学习");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", className=" + className + "]";
	}
}
