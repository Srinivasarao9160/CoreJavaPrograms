package com.oajs.bankapp;

import java.util.Scanner;

public class BankDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Ac number");
		CheekingAccount ca = new CheekingAccount(sc.nextInt());
		System.out.println("doposit money");
		ca.deposit(sc.nextDouble());
		System.out.println("withdra money");
		ca.withdra(sc.nextDouble());
		System.out.println("one more time depost");
		ca.deposit1(sc.nextDouble());
		
	
		
	}

}
