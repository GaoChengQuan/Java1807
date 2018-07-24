package com.situ.day5;

import org.junit.Test;

public class OOPTest {
	
	@Test
	public void test1() {
		int num = 3;
		Student student = new Student();
		//student.id = 1;//The field Student.id is not visible
		student.setId(1);
		//student.name = "张三";
		student.setName("张三");
		//student.age = 23;
		student.setAge(23);
		//student.className = "Java1807";
		student.setClassName("Java1807");
		student.study();
		
		Student stu = new Student(2, "李四", 23, "UI");
		stu.study();
		//直接打印对象stu，打印的就是toString返回的字符串
		System.out.println(stu);
		//上面直接打印stu对象其实和下面stu.toString()效果是一样的
		System.out.println(stu.toString());
		//stu.name = "XXX";
		//通过setName(String name)设置name的值
		stu.setName("XXX");
		//通过getName()得到Student的name属性值
		String name = stu.getName();
		System.out.println(name);
		System.out.println(stu);
	}
}
