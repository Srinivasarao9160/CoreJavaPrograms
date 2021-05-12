//4)WAP find LCM of n integers?

package Assesment21programs;

import java.util.Scanner;

public class Lcm {
	
	
	static int gcdofNum(int num1,int num2) {
		int gcd = 1;
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd =i;
			}
		}
		return gcd;
	}
	
	static int lcm(int num1,int num2) {
		return num1/gcdofNum(num1,num2) * num2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(lcm(num1,num2));
		
		
	}

}
