package com.situ.day13;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginDemo {
	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new GridLayout(3, 1));
		// 创建组件
		// namePanel
		JPanel namePanel = new JPanel();
		JLabel nameLabel = new JLabel("用户名：");
		JTextField nameTextFiled = new JTextField(10);
		namePanel.add(nameLabel);
		namePanel.add(nameTextFiled);
		panel.add(namePanel);
		// passwordPanel
		JPanel passwordPanel = new JPanel();
		JLabel passwordLabel = new JLabel("密码：");
		JTextField passwordTextFiled = new JTextField(10);
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordTextFiled);
		panel.add(passwordPanel);
		// loginPanel
		JPanel loginPanel = new JPanel();
		JButton loginButton = new JButton("登录");
		JButton cancelButton = new JButton("取消");
		loginPanel.add(loginButton);
		loginPanel.add(cancelButton);
		panel.add(loginPanel);
		// 设置JFrame属性
		// 禁止用户改变窗口大小 resize able 能够
		//frame.setResizable(false);
		frame.setSize(300, 150);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
