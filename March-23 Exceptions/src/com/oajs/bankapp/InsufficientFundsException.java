package com.oajs.bankapp;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String string) {
		super(string);
	}


	private double balance;
	
	
	public double getAmount() {
		return balance;
	
		
		
	}

	
}
