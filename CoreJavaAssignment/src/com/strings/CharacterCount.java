package com.strings;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "ojas";
		int count = 0;
		for(int i = 0; i<str.length();i++) {
		System.out.println(str.charAt(i));
		count++;
		}
		System.out.println("Character count in string is : "+count);

}
}
