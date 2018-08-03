package com.situ.day11.thread;

public class NumberThread extends Thread{
	private int start;
	
	public NumberThread(String name, int start) {
		super(name);
		this.start = start;
	}

	@Override
	public void run() {
		for (int i = start; i <= 100; i += 2) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
