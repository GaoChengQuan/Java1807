package com.situ.day13;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo {
	public static void main(String[] args) {
		//创建JFrame
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		//FlowLayout默认是居中显示的，可以设置向左或者向右对齐
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		//创建组件
		JButton button1 = new JButton("张三");
		JButton button2 = new JButton("李四");
		JButton button3 = new JButton("王五");
		JButton button4 = new JButton("赵六");
		JButton button5 = new JButton("小李");
		JButton button6 = new JButton("小强");
		//添加组件
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		
		//设置JFrame属性
		frame.setSize(300, 400);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
