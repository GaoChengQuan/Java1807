package com.situ.day13;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public void init() {
		setSize(300, 150);
		setLocation(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		myFrame.init();
	}
}
