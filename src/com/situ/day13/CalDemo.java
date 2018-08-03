package com.situ.day13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalDemo {

	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		// 创建组件
		//文本框1
		JTextField textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(120, 30));
		panel.add(textField1);
		// + 号
		JLabel label = new JLabel("+");
		label.setPreferredSize(new Dimension(30, 30));
		panel.add(label);
		//文本框2
		JTextField textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(120, 30));
		panel.add(textField2);
		// = button
		JButton button = new JButton("=");
		panel.add(button);
		// label 结果
		JLabel resultLabel = new JLabel();
		panel.add(resultLabel);
		
		//给button添加点击事件
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = textField1.getText();
				System.out.println(num1);
				String num2 = textField2.getText();
				System.out.println(num2);
				int result = Integer.parseInt(num1) + Integer.parseInt(num2);
				//resultLabel.setText(result + "");
				//resultLabel.setText(String.valueOf(result));
				resultLabel.setText(Integer.toString(result));
			}
		});
		
		// 设置JFrame属性
		// 禁止用户改变窗口大小 resize able 能够
		frame.setResizable(false);
		frame.setSize(500, 300);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
