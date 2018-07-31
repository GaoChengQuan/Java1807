package com.situ.day10;

public class Stu {
	private Integer id;
	private String name;

	public Stu() {
		super();
	}

	public Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}

}
