package com.situ.day7.alarm;

public class MyDianTi extends AbstractDianTi implements IAlarm {

	@Override
	public void alarm() {
		System.out.println("MyDianTi.alarm()");
	}

	@Override
	public void up() {
		System.out.println("MyDianTi.up()");
	}

	@Override
	public void down() {
		System.out.println("MyDianTi.down()");
	}
	
}
