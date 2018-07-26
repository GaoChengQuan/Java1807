package com.situ.day7;

public class AbstractCalTest {
	
	public static void main(String[] args) {
		Add add = new Add(3, 4);
		int result = add.getResult();
		System.out.println(result);
		
		AbstractCal cal = new Add(3, 4);
		int result2 = cal.getResult();
		System.out.println(result2);
		
		//Cannot instantiate the type Cal
		AbstractCal cal2 = new AbstractCal();
	}
}
