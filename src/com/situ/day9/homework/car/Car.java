package com.situ.day9.homework.car;

public abstract class Car {
	// 属性：品牌(mark)——String类型
	// 功能：驾驶（void drive( )）
	protected String mark;

	public abstract void drive();

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
