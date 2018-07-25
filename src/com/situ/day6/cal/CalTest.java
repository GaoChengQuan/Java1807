package com.situ.day6.cal;

import org.junit.Test;

public class CalTest {
	public static void main(String[] args) {
		Add add = new Add(3, 5);
		int addResult = add.add();
		System.out.println(addResult);
		
		Div div = new Div(8, 4);
		int divResult = div.div();
		System.out.println(divResult);
	}
	
	@Test
	public void test3() {
		//声明成父类类型，new子类
		Cal cal = new Add(3, 5);
		int result1 = cal.getResult();
		System.out.println(result1);
		cal = new Sub(8, 4);//所有new出来的子类对象都可以赋给父类
		int result2 = cal.getResult();
		System.out.println(result2);
	}
	
	@Test
	public void test1() {
		cal(new Add(3, 5));
		cal(new Sub(3, 5));
		cal(new Div(8, 4));
	}

	private void cal(Add cal) {
		//Cal cal = new Add(3, 5);
		int result = cal.getResult();
		System.out.println(result);
	}
	
	
	
}
