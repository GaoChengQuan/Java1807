package com.situ.day7.inter;

public class TTT {
	public static void main(String[] args) {
		// 从鸽子这个角度去看new出来的这个鸽子对象
		GeZi geZi = new GeZi();
		geZi.egg();
		// 从鸽子角度能看到鸽子所特有的message()送信这个功能
		geZi.message();

		// 从抽象的鸟的角度去看new出来的这个鸽子对象
		AbstractBird bird = new GeZi();
		// 从抽象的鸟的角度只能看到所有鸟都具有的egg()下蛋这个功能
		bird.egg();

		// 从能不能非IFly这个角度去看new出来这个鸽子对象
		IFly fly = new GeZi();
		// 从能不能非IFly这个角度只能看到fly()这个功能
		fly.fly();
	}
}
