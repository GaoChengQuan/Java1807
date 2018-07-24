package com.situ.day5;

import java.util.Scanner;

import org.omg.DynamicAny.NameDynAnyPairSeqHelper;

public class StudentManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量： ");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
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
		
		System.out.println("学生信息列表");
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println(student);
		}
		
		//for(;;){}
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
			case 1://根据id查找    Magic Number
				System.out.println("id");
				break;
			case 2: 
				System.out.println("请输入要查询的学生姓名: ");
				String nameSearch = scanner.next();
				//boolean flag = false;
				boolean isSearchByNameFind = false;//false表示没有找到
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					String name = student.getName();
					if (nameSearch.equals(name)) {
						System.out.println(student);
						isSearchByNameFind = true;
					}
				}
				if (isSearchByNameFind == false) {//遍历完一次也没有找到
					System.out.println("没有该姓名的学生");
				}
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
}
