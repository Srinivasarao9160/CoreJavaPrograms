package com.ojas;

public class Account {
	 double balance;
	 int accountno;
	 float interestrate;
	customer customer;

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getAccountno() {
		return accountno;
	}


	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}


	public float getInterestrate() {
		return interestrate;
	}


	public void setInterestrate(float interestrate) {
		this.interestrate = interestrate;
	}
	public Account(double balance, int accountno, float interestrate) {
		super();
		this.balance = balance;
		this.accountno = accountno;
		this.interestrate = interestrate;
	}
	public double deposit(int amount) {
		return amount+balance;
	}
	public double withdra(int amount) {
		if(balance>amount) {
			
		}
		return amount;
	}

}
