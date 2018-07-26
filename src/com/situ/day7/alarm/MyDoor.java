package com.situ.day7.alarm;

public class MyDoor extends AbstractDoor implements IAlarm{

	@Override
	public void alarm() {
		System.out.println("MyDoor.alarm()");
	}

	@Override
	public void open() {
		System.out.println("MyDoor.open()");
	}

	@Override
	public void close() {
		System.out.println("MyDoor.close()");
	}
}
