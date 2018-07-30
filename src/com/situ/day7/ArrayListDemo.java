package com.situ.day7;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.situ.day6.Student;

public class ArrayListDemo {
	@Test
	public void test1() {
		Student[] students = new Student[3];
		Student student1 = new Student(1, "张三1", "Java1");
		Student student2 = new Student(2, "张三2", "Java2");
		Student student3 = new Student(3, "张三3", "Java3");
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;

		// Object[] objects = new Object[3];
		ArrayList list1 = new ArrayList();
		list1.add(student1);
		list1.add(student2);
		list1.add(student3);
		list1.add(1);
		list1.add("Hello");

		// <Student>泛型指定只能放Student
		ArrayList<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		// list2.add(1);

		// 1、数组方式遍历
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			System.out.println(student);
		}
		System.out.println("---------------");
		// 2、foreach
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("---------------");
		// 3、迭代器遍历
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {//有没有下一个
			Student student = iterator.next();//移动到下一个并取出改对象
			System.out.println(student);
		}
	}
}
