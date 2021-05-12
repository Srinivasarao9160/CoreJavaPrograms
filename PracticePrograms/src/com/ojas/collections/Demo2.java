package com.ojas.collections;

import java.util.Scanner;
import java.util.Stack;

public class Demo2 {
	
	

	public static void main(String[] args) {
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		Stack stack = new Stack();
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		while(!stack.isEmpty()) {
			reverse= reverse+stack.pop();
		}
		if(str.equals(reverse)) {
			System.out.println("palandrom");
		}else {
			System.out.println("not palandram");
		}
		

		
		
	}

}
