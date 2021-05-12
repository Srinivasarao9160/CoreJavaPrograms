//5.Write a program to check the given N digit number is armstrong or not (N=3 digit number, 4 digit number,.......n digit number).

package Olci2;

import java.util.Scanner;

public class AmstrongNum {

	static void armstrongNumber(int num) {
		int sum =0,rem,temp;
		 temp = num;
		while(num != 0) {
		 rem = num % 10;
		 num = num/10;
		 sum = sum + (rem * rem * rem);
		 }
		 
		if (temp == sum) {
		 System.out.println(temp    +"Amstrong number");
		 }
		else {
		 System.out.println(temp    +"Not amstrong number");
		 }
		 }
		public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the number");
		int num = sc.nextInt();
		 
		 armstrongNumber(num);
		 }
		
	}


