package com.situ.day4;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Scanner;

import org.junit.Test;
import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

public class OOPTest {
	public static void main(String[] args) {
		String str1 = "jjj";
		String str2 = new String("Jaav");
		int num = 3;

		Student student = new Student();
		student.id = 001;
		student.name = "张三";
		student.age = 20;
		student.className = "Java1807";
		student.study();

		Teacher teacher = new Teacher();
		teacher.id = 002;
		teacher.name = "李四";
		teacher.age = 30;
		teacher.salary = 10000;
		teacher.teach();

		Teacher teacher2 = new Teacher();
		teacher2.id = 003;
		teacher2.name = "王五";
		teacher2.age = 32;
		teacher2.salary = 13000;
		teacher2.teach();
	}
	
	@Test
	public void test1() {
		System.out.println("请输入学生的数量：");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("请输入学生id：");
			student.id = scanner.nextInt();
			System.out.println("请输入学生的姓名：");
			student.name = scanner.next();
			System.out.println("请输入学生的年龄:");
			student.age = scanner.nextInt();
			System.out.println("请输入学生的班级： ");
			student.className = scanner.next();
			//将学生对象放到数组里面
			students[i] = student;
		}
		
		for (int i = 0; i < students.length; i++) {
			Student stu = students[i];
			System.out.println("id: " + stu.id);
			System.out.println("name: " + stu.name);
			System.out.println("age: " + stu.age);
			System.out.println("className: " + stu.className);
		}
	}
	
	@Test
	public void test44() {
		//调用无参数构造方法构造对象
		Student student1 = new Student();
		student1.id = 1;
		student1.name = "张三";
		student1.age = 23;
		student1.className = "Java1807";
		//调用有参数构造方法构造对象
		Student student2 = new Student(11, "张三1", 231, "Java1807");
		System.out.println(student2);
	}
	
	
	
	
}
