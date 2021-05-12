package com.core;

public class LeastNumber {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		if (num1 < num2) {
			System.out.println(num1 + " Is small");
		} else if (num1 < num2) {
			System.out.println(num2 + " Is small");
		} else {
			System.out.println("Both Are Same");
		}

	}

}
