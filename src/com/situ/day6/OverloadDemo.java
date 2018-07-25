package com.situ.day6;
/*
 * 重载
 */
public class OverloadDemo {
	public static void main(String[] args) {
		 int max1 = Math.max(10, 8);
		 System.out.println(max1);
		 //double max2 = Math.max(3.4, 6.5);
		 double max = Math.max(3.4, 6.5);
	}
	
	void show(int a, char b, double c){}
	//Duplicate method show(int, char, double) in type OverloadDemo
	//void show(int x, char y, double z){}
	
	static int show(int a, double c, char b){return 0;}
	
}
