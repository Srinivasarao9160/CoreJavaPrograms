//4.Write a program to find polyndrome numbers in  Fibonacci Sequence with in the given range.
package Olci2;

import java.util.Scanner;

public class Pelandrom {

	private static void fibonacciNumbers(int start, int end) {
		int n1 = 0, n2 = 1, n3 = 0;
		while (true) {
			if (n1 >= start && n3 == 0) {
				System.out.println("Palindrome: " + n1);
			}

			if (n2 >= start&& n3 == 0) {
				System.out.println("Palindrome: " + n2);
			}

			if (start> end) {
				break;
			}

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			if (n3 >= start) {
				if (n3 > end) {
					break;
				}
				if (palindrome(n3)) {
					System.out.println("Palindrome: " + n3);
				}

			}
		}
	}

	private static boolean palindrome(int n3) {
		int rem, sum = 0;
		int num = n3;
		while (n3 != 0) {
			rem = n3 % 10;
			sum = sum * 10 + rem;
			n3 = n3 / 10;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		fibonacciNumbers(sc.nextInt(), sc.nextInt());
	}
}
