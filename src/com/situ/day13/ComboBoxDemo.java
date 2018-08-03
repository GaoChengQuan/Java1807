package com.situ.day13;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ComboBoxDemo {
	public static void main(String[] args) {
		// 创建JFrame
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new GridLayout(2, 1));
		// 创建组件
		// ComboBox
		JPanel comboBoxPanel = new JPanel();
		JLabel comboBoxLabel = new JLabel("你的籍贯：");
		String[] homes = { "北京", "青岛", "济南", "上海" };
		JComboBox comboBox = new JComboBox(homes);
		comboBoxPanel.add(comboBoxLabel);
		comboBoxPanel.add(comboBox);
		panel.add(comboBoxPanel);
		// JList
		JPanel listPanel = new JPanel();
		JLabel listLabel = new JLabel("学习语言：");
		String[] languages = { "Java", "PHP", "Python", "Android", "C", "C#" };
		JList<String> list = new JList<>(languages);
		//默认JList全部显示，添加滚动之后可以控制显示
		list.setVisibleRowCount(3);
		//使用JScrollPane包裹一下实现滚动效果
		JScrollPane scrollPane = new JScrollPane(list);
		listPanel.add(listLabel);
		//listPanel.add(list);
		listPanel.add(scrollPane);
		panel.add(listPanel);
		// 设置JFrame属性
		// 禁止用户改变窗口大小 resize able 能够
		// frame.setResizable(false);
		frame.setSize(300, 300);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
