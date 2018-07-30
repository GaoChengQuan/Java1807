package com.situ.day9.homework;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.awt.image.BandCombineOp;
import java.util.Scanner;

import org.omg.CORBA.ORBPackage.InconsistentTypeCode;

public class AccountAdmin {
	// 账号（account）、储户姓名(name)、地址(address)、存款余额(balance)、最小余额(minBalance)
	// 账号
	private String account;
	// 储户姓名
	private String name;
	// 地址
	private String address;
	// 存款余额
	private double balance;
	// 最小余额
	private double minBalance;
	
	private Scanner scanner = new Scanner(System.in);

	public AccountAdmin() {
		super();
	}

	public AccountAdmin(String account, String name, String address, double balance, double minBalance) {
		super();
		this.account = account;
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.minBalance = minBalance;
	}

	// 主程序调用这个方法，启动账户管理程序
	public void work() {
		while (true) {
			System.out.println(name + "您好，请选择操作");
			System.out.println("1.查询");
			System.out.println("2.存款");
			System.out.println("3.取款");
			System.out.println("4.退卡");
			int type = scanner.nextInt();
			if (type == 4) {
				System.out.println("退卡");
				break;
			}
			
			switch (type) {
			case 1:// 查询 Magic Number
				System.out.println("---------------------");
				query();
				System.out.println("---------------------");
				break;
			case 2:
				System.out.println("---------------------");
				deposit();
				System.out.println("---------------------");
				break;
			case 3:
				System.out.println("---------------------");
				withdraw();
				System.out.println("---------------------");
				break;
			default:
				break;
			}
		}
	}
	

	/*
	 * 取款
	 */
	private void withdraw() {
		System.out.println("请输入取款金额");
		double num = scanner.nextDouble();
		if (getBalance() - num >= getMinBalance()) {
			System.out.println("当前账户余额： " + balance);
			this.balance  = this.balance - num;
			System.out.println("取款成功");
			System.out.println("取出金额： " + num);
			System.out.println("账户余额为： " + this.balance);
		} else {
			System.out.println("取款失败！当前账户余额为:" + this.balance);
			System.out.println("至少要保留" + this.minBalance + "元");
		}
	}

	/*
	 * 存款
	 */
	private void deposit() {
		System.out.println("请输入存款金额： ");
		double input = scanner.nextDouble();
		System.out.println("存入金额： " + input);
		balance = balance + input;
		System.out.println("当前账户余额： " + balance);
	}

	/*
	 * 查询
	 */
	private void query() {
		System.out.println("账户余额：  " + balance);
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
}
