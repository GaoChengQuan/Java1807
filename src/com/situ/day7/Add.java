package com.situ.day7;
//The type Add must implement the inherited abstract method Cal.getResult()
public class Add extends AbstractCal{

	public Add() {
		super();
	}

	public Add(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int getResult() {
		return num1 + num2;
	}
}
