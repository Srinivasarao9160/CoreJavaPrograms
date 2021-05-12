package com.oajs.bankapp;

public class CheekingAccount {
	
	private int accountno;
	private int accountNo=123;
	private double balance;
	
	

	public CheekingAccount(int accountno) {
 
		this.accountno = accountno;
	}

	public boolean cheekAccount(int accountno) {
		if(accountNo == accountno) {
			return true;
		}
		return false;
	}
		
	public void deposit(double amount) {
		if(cheekAccount(accountno)== true) {
			balance = balance+amount;
		}else {
			System.out.println("worng ac number");
		}
		}
		  
	public void withdra(double amount) {
	
		try {
			if(amount <=balance ) {
				System.out.println(balance=balance-amount);
				System.out.println("Remaining balance " +balance);
				
			}else
			{
				throw new InsufficientFundsException("insuffient balance");
			}
			
			
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
		public void deposit1(double amount) {
			if(cheekAccount(accountno)== true) {
				balance = balance+amount;
				System.out.println(balance);
			}else {
				System.out.println("worng ac number");
			}
			}
		
		
		}
	

