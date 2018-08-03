package com.situ.day12;

public class Person {
	String name, department;
	int age;

	public Person(String n) {
		name = n;
	}

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public Person(String n, String d, int a) {
		// doing the same as two arguments version if constructer
		Person(n, a);
	}
}
