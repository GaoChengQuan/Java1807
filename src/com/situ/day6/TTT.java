package com.situ.day6;

import org.junit.Test;

public class TTT {
	public static void main(String[] args) {
		Student student = new Student();
		student.show();
	}
	
	@Test
	public void test1() {
		JavaStudent javaStudent = new JavaStudent();
		javaStudent.show();
	}
}
