package Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		String res = " ";
		
	 int flag = 0; int i=2;
	 while (i<num/2) {
		 if (num%i==0) {
			 flag++;
			 break;
		 }
		 i++;
	 }
	 
	 if(flag==0) {
		 res += num +"is prime";
	 }else {
		 res +=num+"is not prime";
	 }
	 System.out.println(res);
			 
	 }		 
			 
			 
		 
		
	}
		
		
	


