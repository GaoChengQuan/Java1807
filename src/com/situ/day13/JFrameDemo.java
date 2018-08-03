package com.situ.day13;

import javax.swing.JFrame;

public class JFrameDemo {
	public static void main(String[] args) {
		//JFrame frame = new JFrame("Hello Swing");
		JFrame frame = new JFrame();
		//给窗口设置标题
		frame.setTitle("Hello JFrame");
		//设置大小
		//width: the new width of this component in pixels
		frame.setSize(500, 400);
		//设置初始位置
		frame.setLocation(500, 200);
		//关闭Frame(设置frame默认关闭时候的操作，就是当关闭时候退出)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//默认是不显示
		frame.setVisible(true);
	}
}
