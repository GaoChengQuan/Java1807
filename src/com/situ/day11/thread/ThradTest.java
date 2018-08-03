package com.situ.day11.thread;

import org.junit.Test;

public class ThradTest {
	public static void main(String[] args) {
		//MyThread myThread = new MyThread();
		//这不是启动线程，这是调对象里面一个普通方法run()方法
		//myThread.run();
		//真正启动一个线程调用start()方法，执行的就是run()方法里面内容
		//myThread.start();
		
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable, "线程名字");
		thread.start();
		
		
//		JiShuThread jiShuThread = new JiShuThread();
//		jiShuThread.start();
//		OuShuThread ouShuThread = new OuShuThread();
//		ouShuThread.start();
		
		NumberThread jiShuThread = new NumberThread("奇数线程", 1);
		jiShuThread.start();
		NumberThread ouShuThread = new NumberThread("偶数线程",2);
		ouShuThread.start();
	}
	
}
