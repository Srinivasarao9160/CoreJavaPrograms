package com.strings;

import java.util.Scanner;

public class VowelsToZero {
	

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String which contains vowels");
			String str = sc.nextLine();
			char[] c = str.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'i' || c[i] == 'u'
						|| c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
					c[i] = '0';
				}
			}
			for (int i = 0; i < c.length; i++) {
				System.out.print("Result is : " + c[i]);
			}
		}

	}


