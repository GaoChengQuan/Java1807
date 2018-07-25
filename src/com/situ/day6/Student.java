package com.situ.day6;

public class Student extends Person{
	private String className;

	public Student() {
		//super();//调用父类无参数构造方法
		System.out.println("Student.Student()");
	}

	public Student(int id, String name, String className) {
		//The field Person.id is not visible
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
	public Student(int id, String name, int age, String className) {
		super(id, name, age);//调用父类有参数构造方法
		this.className = className;
	}
	
	@Override
	public void show() {
		//super.show();//super代表父类对象
		System.out.println("Student.show()");
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override //重写（在父类里面已经有了这个方法，重写就是在当前类重新定义这个方法）
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", className=" + className + "]";
	}
}
