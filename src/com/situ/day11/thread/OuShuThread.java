package com.situ.day11.thread;

public class OuShuThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
	}
}
