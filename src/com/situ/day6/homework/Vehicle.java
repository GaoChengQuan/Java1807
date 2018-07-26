package com.situ.day6.homework;

public class Vehicle {
	private double speed;
	private double size;

	public Vehicle() {
		super();
	}

	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	
	public void move() {
		System.out.println("speed: " + speed);
	}
	
	public void speedUp(double up) {
		speed = speed + up;
	}
	
	public void speedDown(double down) {
		speed = speed - down;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", size=" + size + "]";
	}
}
