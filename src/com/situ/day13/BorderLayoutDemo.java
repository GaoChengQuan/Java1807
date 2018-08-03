package com.situ.day13;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo {
	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new BorderLayout());
		// 创建组件
		JButton northButton = new JButton("北部");
		//设置Button的宽高
		northButton.setPreferredSize(new Dimension(200, 200));
		JButton southButton = new JButton("南部");
		JButton westButton = new JButton("西部");
		JButton eastButton = new JButton("东部");
		JButton centerButton = new JButton("中部");
		// 添加组件
		panel.add(northButton, BorderLayout.NORTH);
		panel.add(southButton, BorderLayout.SOUTH);
		panel.add(westButton, BorderLayout.WEST);
		panel.add(eastButton, BorderLayout.EAST);
		panel.add(centerButton, BorderLayout.CENTER);

		// 设置JFrame属性
		//禁止用户改变窗口大小  resize able 能够
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
