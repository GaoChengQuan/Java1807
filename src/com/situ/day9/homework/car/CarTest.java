package com.situ.day9.homework.car;

public class CarTest {
	public static void main(String[] args) {
		SubCar subCar1 = new SubCar(50, 80, "奥迪");
//		System.out.println("本车品牌是 " + subCar1.getMark());
//		System.out.println(subCar1.getMark() + "的价格是" + subCar1.getPrice());
//		System.out.println(subCar1.getMark() + "车原来速度是" + subCar1.getSpeed());
//		subCar1.drive();
//		subCar1.speedChange(120);
//		System.out.println(subCar1.getMark() + "车现在速度是" + subCar1.getSpeed());
		subCar1.show();
		System.out.println();
		
		SubCar subCar2 = new SubCar(100, 90, "奔驰");
		subCar2.show();
	}
}
