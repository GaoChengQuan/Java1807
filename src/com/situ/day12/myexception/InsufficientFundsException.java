package com.situ.day12.myexception;
//自定义异常，继承Exception
public class InsufficientFundsException extends Exception {
	// amount用来存储当出现异常(取出钱多余余额时)所缺少的钱
	private double amount; 

	public InsufficientFundsException(double amount) {
		super("余额不足还差" +  amount);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
