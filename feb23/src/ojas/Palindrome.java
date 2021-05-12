package ojas;

public class Palindrome {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		
		int temp = num%10;
		int sum = num/100;
		System.out.println(temp==sum);
		}

}
