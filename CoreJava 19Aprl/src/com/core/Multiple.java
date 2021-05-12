package com.core;

public class Multiple {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double d = ((Math.ceil(num / 100)) * 100) + 100;
		System.out.println(d);

	}
}
