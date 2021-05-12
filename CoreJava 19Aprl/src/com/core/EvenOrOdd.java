package com.core;

public class EvenOrOdd {
	public static void main(String[] args) {
		try {
		int num  = Integer.parseInt(args[0]);
		
		if(num % 2 ==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
