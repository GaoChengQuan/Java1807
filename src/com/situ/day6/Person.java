package com.situ.day6;

public class Person /*extends Object*/{//默认继承Object
	protected int id;
	protected String name;
	protected int age;

	public Person() {
		//super();
		System.out.println("Person.Person()");
	}

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("Person.show()");
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
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
