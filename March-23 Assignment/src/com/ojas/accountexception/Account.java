package com.ojas.accountexception;

public class Account {
	
	private int accountno;
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int accountno, double balance) {
		super();
		this.accountno = accountno;
		this.balance = balance;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
