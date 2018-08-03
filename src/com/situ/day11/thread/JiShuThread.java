package com.situ.day11.thread;

public class JiShuThread extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
	}
}
