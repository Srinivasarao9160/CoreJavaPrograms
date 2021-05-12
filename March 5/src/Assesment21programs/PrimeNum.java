//3)Prime Number logic using recursion?

package Assesment21programs;

import java.util.Scanner;

public class PrimeNum {
	

	static boolean recuPrim(int number) {
		int i=number/2;
			if(number%i==0) {
				
				return false;
				}i++;
			return true;
		}
		
		

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println(recuPrim(number));
	}

}
