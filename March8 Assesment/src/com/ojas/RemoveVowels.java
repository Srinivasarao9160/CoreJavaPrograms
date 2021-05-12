package com.ojas;

import java.util.Scanner;

public class RemoveVowels {
	static String removeVowels(String str) {
		return str.replaceAll("[aeiouAEIOU]","");
		}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		System.out.println(removeVowels(str));
	}

}
