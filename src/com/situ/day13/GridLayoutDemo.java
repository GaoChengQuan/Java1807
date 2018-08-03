package com.situ.day13;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutDemo {
	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new GridLayout(3, 3));
		// 创建组件
		JButton[] buttons = new JButton[9];//[null,null,null]
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton((i + 1) + "");
		}
		// 添加组件
		for (int i = 0; i < buttons.length; i++) {
			panel.add(buttons[i]);
		}
		// 设置JFrame属性
		// 禁止用户改变窗口大小 resize able 能够
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
