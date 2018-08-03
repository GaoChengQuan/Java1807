package com.situ.day11;

import org.junit.Test;

public class EnumTest {
	
	public static void main(String[] args) {
		System.out.println("EnumTest.main()");
	}
	
	@Test
	public void test1() {
		Student student1 = new Student(1, "张三1", GenderEnum.FEMALE);
		System.out.println(student1);
		
		Student student2 = new Student(2, "张三2", GenderEnum.FEMALE);
		System.out.println(student2);
		
		//枚举判断相等可以使用==也可以使用equals
		System.out.println(student1.getGenderEnum() == student2.getGenderEnum());
		System.out.println(student1.getGenderEnum().equals(student2.getGenderEnum()));
		
		//枚举可以使用在switch中
		switch (student1.getGenderEnum()) {
		case MALE:
			System.out.println("MALE");
			break;
		case FEMALE:
			System.out.println("FEMALE");
			break;
		default:
			break;
		}
	}
	
	@Test
	public void test22() {
		GenderEnum genderEnum = GenderEnum.FEMALE;
		System.out.println(genderEnum);//FEMALE
		System.out.println(genderEnum.getValue());//女
	}
	
	
}
