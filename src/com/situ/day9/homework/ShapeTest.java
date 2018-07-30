package com.situ.day9.homework;

public class ShapeTest {
	public static void main(String[] args) {
		IShape shape = new Square(2);
		double area = shape.area();
		System.out.println(area);
	}
}
