package com.core;

public class GreastNumber {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		if(num1 > num2) {
			System.out.println("num1 is Greatest Number:"+num1);	
		}
		else if(num1==num2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("num2 is Greatest Number:"+num2);
		}

	}

}
