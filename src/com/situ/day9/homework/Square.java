package com.situ.day9.homework;

public class Square implements IShape {
	private double a;

	public Square() {
		super();
	}

	public Square(double a) {
		super();
		this.a = a;
	}

	@Override
	public double area() {
		return a * a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
}
