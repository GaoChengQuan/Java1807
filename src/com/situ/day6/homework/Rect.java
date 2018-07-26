package com.situ.day6.homework;

/**
 * 长方形 Rect
 */
public class Rect {
	private int length;
	private int width;
	
	public Rect() {
		this.length = 1;
		this.width = 1;
	}
	
	public Rect(int length) {
		this.length = length;
		this.width = length;
	}
	
	public Rect(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public int zhouChang() {
		return (length + width) * 2;
	}
	
	public int mianJi() {
		return width * length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rect [length=" + length + ", width=" + width + "]";
	}

}
