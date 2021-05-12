package com.ojas;

public class CharacterCount {
	static int characterCount(String input,char tofind ) {
		
		int count = 0;
		if(input ==" ") {
			return -1;
		}
		for(int i=0; i<input.length();i++) {
			if((input.charAt(i)== tofind)) {
				count++;
			}
		}return count;
	}

	public static void main(String[] args) {

		System.out.println(characterCount("hello world",'l'));
		
	}

}
