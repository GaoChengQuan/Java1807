package com.situ.day9.homework.person;

public class Student extends Person{
	private String school;
	private String no;
	
	public Student() {
		super();
	}

	public Student(String name, String gender, int age, String country, String school, String no) {
		super(name, gender, age, country);//调用父类对应参数构造方法
		this.school = school;
		this.no = no;
	}

	@Override
	public void work() {
		System.out.println("学生的工作是学习");
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	

}
