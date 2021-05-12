package Methods;

import java.util.Scanner;

public class StrongNum {
	
	static int strongNum(int number) {
		int rem=0;int sum=0;int temp = number;
		while(number>0){
			int fact = 1;
			rem = number%10;
			for(int i=rem; i>=1;i--) {
				fact = fact*i;
			}
			sum = sum+fact;
			number=number/10;
			}
		if(sum==temp) {
			System.out.println("Given number is strong  "+sum);
		}
		else {
			System.out.println(" Given number is not strong number");
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number =sc.nextInt();
		strongNum(number);
		
	}

}
