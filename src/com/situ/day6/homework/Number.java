package com.situ.day6.homework;

public class Number {
	private int num1;
	private int num2;

	public Number() {
		super();
	}

	public Number(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add() {
		return num1 + num2;
	}
	
	public int add1() {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}
	
	public int sub() {
		return num1 - num2;
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public int div() {
		return num1 / num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Number [num1=" + num1 + ", num2=" + num2 + "]";
	}

}
