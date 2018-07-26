package com.situ.day7.inter;

public class GeZi extends AbstractBird implements IFly{

	@Override
	public void fly() {
		System.out.println("GeZi.fly()");
	}

	@Override
	public void egg() {
		System.out.println("GeZi.egg()");
	}
	
	//这个功能是鸽子所特有的
	public void message() {
		System.out.println("GeZi.message()");
	}
}
