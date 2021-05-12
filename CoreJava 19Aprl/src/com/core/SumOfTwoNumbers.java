package com.core;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp = num % 10;
		int temp1 = num / 10;
		
		System.out.println("SumofDigits:" +(temp + temp1));

	}

}
