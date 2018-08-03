package com.situ.day11;

public class Student {
	private Integer id;
	private String name;
	private GenderEnum genderEnum;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, GenderEnum genderEnum) {
		super();
		this.id = id;
		this.name = name;
		this.genderEnum = genderEnum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenderEnum getGenderEnum() {
		return genderEnum;
	}

	public void setGenderEnum(GenderEnum genderEnum) {
		this.genderEnum = genderEnum;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", genderEnum=" + genderEnum.getValue() + "]";
	}

}
