package com.situ.day10;

import org.junit.Test;

public class StaticDemo {
	private static int num1 = 2;
	private int num2 = 3;
	
	public static void main(String[] args) {
		Student.show();
		Student.country = "US";
		//Student.age = 3;
		Student student1 = new Student("zhangsan", 23, "CN");
		System.out.println(student1.country);
		System.out.println(Student.country);
		//Student student2 = new Student("lisi", 20, "CN");
	}
	
	@Test
	public void test1() {
		//Teacher teacher;
		System.out.println(Teacher.country);
		System.out.println(Teacher.country);
		System.out.println(Teacher.country);
		//Teacher teacher1 = new Teacher();
		//Teacher teacher2 = new Teacher();
	}
	
	@Test
	public void test2() {
		Math.max(1, 3);
		Math.min(3, 5);
		Math.log(22);
		int[] array = { 3, 44, 5, 65, 167, 79 };
		int max = ArrayUtil.max(array);
		System.out.println(max);
		ArrayUtil.bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		ArrayUtil arrayUtil = new ArrayUtil();
		arrayUtil.bubbleSort(array);
	}
	
	@Test
	public void test454() {
		Stu stu = new Stu();//没有给id赋值默认0
		System.out.println(stu.getName());
		System.out.println(stu.getId());
		stu.setName("");
		stu.setId(0);//你的id就是0
		System.out.println(stu.getName());
		System.out.println(stu.getId());
	}
	
}
