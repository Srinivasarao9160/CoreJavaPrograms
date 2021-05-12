package Numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		Integer num = sc.nextInt();
		int factorial = 1;
		
		if (num>0) {
		for(int i= 1;i<=num;i++) {
			factorial *= i;
		}
		System.out.println(factorial);
		
		}else {
			System.out.println("error");
		}
		
	}
}


