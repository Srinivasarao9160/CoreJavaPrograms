//5)WAP GCD of 3 numbers?

package Assesment21programs;

import java.util.Scanner;

public class Gcdof3 {
	
	static int gcdofNum(int num1,int num2,int num3) {
		int gcd = 1;
		for(int i=1;i<=num1 && i<=num2 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0 && num3%i==0) {
				gcd =i;
			}
		}
		return gcd;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(gcdofNum(num1,num2,num3));
		
	}

}
