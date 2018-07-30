package com.situ.day9.homework.car;

public class SubCar extends Car {
	// 属性：价格（price）、速度（speed）——int型
	// 功能：变速（void speedChange(int newSpeed)），把新速度赋给speed
	private int price;
	private int speed;

	public SubCar() {
		super();
	}

	public SubCar(int price, int speed, String mark) {
		super();
		this.mark = mark;
		this.price = price;
		this.speed = speed;
	}

	@Override
	public void drive() {
		System.out.println("本车正在驾驶");
	}

	public void speedChange(int newSpeed) {
		this.speed = newSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void show() {
		System.out.println("本车品牌是" + getMark());
		System.out.println(getMark() + "的价格是" + getPrice());
		System.out.println(getMark() + "车原来速度是" + getSpeed());
		drive();
		speedChange(120);
		System.out.println(getMark() + "车现在速度是" + getSpeed());
	}
}
