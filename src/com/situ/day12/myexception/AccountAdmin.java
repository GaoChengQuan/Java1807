package com.situ.day12.myexception;

import java.awt.image.BandCombineOp;

public class AccountAdmin {
	// 余额
	private double balance;
	// 账号
	private int number;

	public AccountAdmin(int number) {
		this.number = number;
	}

	// 存钱
	public void deposit(double amount) {
		balance = balance + amount;
	}

	// 取钱 
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			double need = amount - balance;
			throw new InsufficientFundsException(need);
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
