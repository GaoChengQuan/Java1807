package com.situ.day13;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegisterDemo {

	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new GridLayout(3, 1));
		// 创建组件
		// sportPanel
		JPanel sportPanel = new JPanel();
		JLabel sportLabel = new JLabel("你喜欢的运动：");
		JCheckBox checkBox1 = new JCheckBox("足球");
		JCheckBox checkBox2 = new JCheckBox("篮球");
		JCheckBox checkBox3 = new JCheckBox("网球");
		sportPanel.add(sportLabel);
		sportPanel.add(checkBox1);
		sportPanel.add(checkBox2);
		sportPanel.add(checkBox3);
		panel.add(sportPanel);
		// genderPanel
		JPanel genderPanel = new JPanel();
		JLabel genderLabel = new JLabel("你的性别：");
		JRadioButton maleRadioButton = new JRadioButton("男");
		JRadioButton femaleRadioButton = new JRadioButton("女");
		genderPanel.add(genderLabel);
		//一定要把JRadioButton放到一个ButtonGroup
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(maleRadioButton);
		buttonGroup.add(femaleRadioButton);
		genderPanel.add(maleRadioButton);
		genderPanel.add(femaleRadioButton);
		panel.add(genderPanel);
		// loginPanel
		JPanel loginPanel = new JPanel();
		JButton loginButton = new JButton("登录");
		JButton cancelButton = new JButton("取消");
		loginPanel.add(loginButton);
		loginPanel.add(cancelButton);
		panel.add(loginPanel);
		// 设置JFrame属性
		// 禁止用户改变窗口大小 resize able 能够
		// frame.setResizable(false);
		frame.setSize(400, 200);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
