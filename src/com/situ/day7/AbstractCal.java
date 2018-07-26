package com.situ.day7;

public abstract class AbstractCal{
	protected int num1;
	protected int num2;
	
	public AbstractCal() {
	}

	public AbstractCal(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
//	public int getResult() {
//		return 0;
//	}
	
	public abstract int getResult();
}
