package com.situ.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.situ.day5.Student;

public class CollectionDemo {
	@Test
	public void test1() {
		List<Student> list = new ArrayList<>();
		//ArrayList<Student> list = new ArrayList<>();
		Student student1 = new Student(1, "zhangsan1", "Java1");
		Student student2 = new Student(2, "zhangsan2", "Java2");
		Student student3 = new Student(3, "zhangsan3", "Java3");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student1);
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("==================");
		Set<Student> set = new HashSet<>();
		//HashSet<Student> set = new HashSet<>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student1);
		for (Student student : set) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test2() {
		// CN  中华人民共和国   US  美利坚和中国
		// key  value
		HashMap<String, String> map = new HashMap<>();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚和中国");
		
		//根据key，找出这个key对应的值value
		String value1 = map.get("CN");
		System.out.println(value1);
		
		//Map遍历
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key);
			System.out.println("value: " + value);
		}
		System.out.println("-------------");
		// keySet将map里面所有的key放到Set集合
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key: " + key);
			String value = map.get(key);
			System.out.println("value: " + value);
		}
		
	}
	
	
	@Test
	public void test3() {
		ArrayList<Student> list = new ArrayList<>();
		Student student1 = new Student(1, "zhangsan1", "Java1");
		Student student2 = new Student(2, "zhangsan2", "Java2");
		Student student3 = new Student(3, "zhangsan3", "Java3");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		//List里面的toArray()这个方法将集合转换成数组
		Student[] array =  list.toArray(new Student[0]);
		//Object[] array =  list.toArray();
		//Student[] array =  (Student[])list.toArray();//类型转换异常
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("------------");
		HashSet<Student> set = new HashSet<>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		//Object[] setArray = set.toArray();
		Student[] setArray = set.toArray(new Student[0]);
		for (Student student : setArray) {//数组也可以使用foreach
			System.out.println(student);
		}
		
		System.out.println("-----------");
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		//数组转换成List集合
		List<Student> stuList = Arrays.asList(students);
		for (Student student : stuList) {
			System.out.println(student);
		}
	}
}
