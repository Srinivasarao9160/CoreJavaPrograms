package com.strings;

public class CountString {

	public static void main(String[] args) {
		
		String s = "The java is best Technology";
		int count = 0;
		
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) != ' ') 
			
				count++;
		}
		System.out.println("the number of characters of given string"+ count);

	}

}
