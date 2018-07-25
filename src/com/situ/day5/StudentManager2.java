package com.situ.day5;

import java.util.Scanner;


public class StudentManager2 {
	public static void main(String[] args) {
		//在开放中主方法中代码尽量是方法的调用
		//最终达到看一下main方法调用的这些方法你就知道这个程序的执行逻辑
		//不要把所有的代码都看完才知道整个程序的逻辑。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量： ");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		//输入学生信息到学生数组里面
		inputStudents(students);
		//打印数组中学生信息
		printStudents(students);
		//根据条件查询
		searchByCondition(students);
	}
	
	/**
	 * 根据条件查询学生信息
	 * @param students
	 */
	public static void searchByCondition(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		// for(;;){}
		while (true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("根据条件查询学生信息");
			System.out.println("根据id查找：	1");
			System.out.println("根据名字查找：	2");
			System.out.println("根据年龄查找：	3");
			System.out.println("根据班级查找：	4");
			System.out.println("退出程序： 	0");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("退出程序");
				return;
			}

			switch (type) {
			case 1:// 根据id查找 Magic Number
				System.out.println("请输入要查询的学生id：");
				int id = scanner.nextInt();
				searchById(students, id);
				break;
			case 2:
				System.out.println("请输入要查询的学生姓名: ");
				String name = scanner.next();
				searchByName(students, name);
				break;
			case 3:
				System.out.println("age");
				break;
			case 4:
				System.out.println("className");
				break;
			default:
				break;
			}
		}
	}
	
	/**
	 * 根据id查找学生信息
	 * @param id
	 */
	public static void searchById(Student[] students, int idSearch) {
		boolean isSearchByIdFind = false;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			int id = student.getId();
			if (idSearch == id) {
				System.out.println(student);
				isSearchByIdFind = true;
			}
		}
		if (isSearchByIdFind == false) {
			System.out.println("没有该id的学生");
		}
	}
	
	/**
	 * 根据名字搜索
	 * @param students
	 * @param nameSearch
	 */
	public static void searchByName(Student[] students, String nameSearch) {
		// boolean flag = false;
		boolean isSearchByNameFind = false;// false表示没有找到
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			String name = student.getName();
			if (nameSearch.equals(name)) {
				System.out.println(student);
				isSearchByNameFind = true;
			}
		}
		if (isSearchByNameFind == false) {// 遍历完一次也没有找到
			System.out.println("没有该姓名的学生");
		}
	}
	
	/**
	 * 传入Student[],读取学生信息封装成Studnet对象放到数组里面
	 * @param students
	 */
	public static void inputStudents(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("请输入学生id：");
			int id = scanner.nextInt();
			System.out.println("请输入学生的名字： ");
			String name = scanner.next();
			System.out.println("请输入学生的年龄： ");
			int age = scanner.nextInt();
			System.out.println("请输入学生的班级： ");
			String className = scanner.next();
			Student student = new Student(id, name, age, className);
			students[i] = student;
		}
	}
	
	/**
	 * 打印数组信息
	 * @param students
	 */
	public static void printStudents(Student[] students) {
		System.out.println("学生信息列表");
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println(student);
		}
	}
}
