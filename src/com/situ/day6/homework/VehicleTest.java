package com.situ.day6.homework;

import java.beans.IntrospectionException;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(100);
		vehicle.setSize(10);
		double speed = vehicle.getSpeed();
		System.out.println(speed);
		vehicle.speedDown(10);
		System.out.println(vehicle.getSpeed());
	}
}
