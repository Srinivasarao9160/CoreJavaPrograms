package Olci1;

import java.util.Scanner;

public class SumOfTeen {

	public static int noTeenSum(int num1, int num2, int num3) {
	        return fixTeen(num1) + fixTeen(num2) + fixTeen(num3);
	    }
	    public static int fixTeen(int n) {
	        if ((n >= 13 && n < 15) || (n > 16 && n <= 19)) {
	            return 0;
	        } else {
	            return n;
	        }
	    }
	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Three Number");

	        System.out.println(noTeenSum(sc.nextInt(), sc.nextInt(), sc.nextInt()));

	 

	    }
	 
}
