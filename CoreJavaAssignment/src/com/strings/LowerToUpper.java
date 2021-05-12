package com.strings;

public class LowerToUpper {

	public static void main(String[] args) {
			String str = "I Am From vijayawada";
			StringBuilder newStr = new StringBuilder(str);
			for (int i = 0; i < str.length(); i++) {
				if (Character.isLowerCase(str.charAt(i))) {
					newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
				} else if (Character.isUpperCase(str.charAt(i))) {
					newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				}
			}
			System.out.println("After converting :" + newStr);
		}

	}

