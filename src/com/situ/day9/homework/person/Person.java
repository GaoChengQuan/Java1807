package com.situ.day9.homework.person;

public class Person {
	// 包括属性：姓名、性别、年龄、国籍；包括方法：吃饭、睡觉，工作。
	private String name;
	private String gender;
	private int age;
	private String country;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender, int age, String country) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}

	public void eat() {
		System.out.println("Person.eat()");
	}

	public void sleep() {
		System.out.println("Person.sleep()");
	}

	public void work() {
		System.out.println("Person.enclosing_method()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
