package com.situ.day7.inter;

public abstract class AbstractBird {

	//鸟具有下蛋功能，但是不知道具体的哪种鸟不知道下哪种蛋，
	//就没法去实现这个功能，所以变成抽象方法，让子类这些
	//具体的鸟去实现下什么样的蛋。
	public abstract void egg();
}
