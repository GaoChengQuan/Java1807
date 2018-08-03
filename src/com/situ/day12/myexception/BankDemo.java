package com.situ.day12.myexception;

public class BankDemo {
	public static void main(String[] args) {
		AccountAdmin accountAdmin = new AccountAdmin(001);
		System.out.println("存款 500");
		accountAdmin.deposit(500);
		System.out.println("取款100");
		try {
			accountAdmin.withdraw(100);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		System.out.println("取款600");
		try {
			accountAdmin.withdraw(600);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
	}
}
