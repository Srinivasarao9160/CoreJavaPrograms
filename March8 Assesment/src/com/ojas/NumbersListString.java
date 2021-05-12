package com.ojas;

import java.util.Scanner;

public class NumbersListString {
	static String getNumberList(String str2)
	{
		String res = "";
		for(int i=0;i<str2.length()-1;i++)
		{
			
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number String:");
		String str = sc.next();
		String str2 = str.replaceAll("-",",");
		System.out.println(str2);
	}
	
	

}
