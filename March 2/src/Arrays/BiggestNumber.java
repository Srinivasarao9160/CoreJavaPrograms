package Arrays;

import java.util.Scanner;

public class BiggestNumber {
	static int biggNum(int num[]) {
		int bigg = num[0];
		for(int i=1;i<num.length;i++) {
			
			if(num[i]>bigg) {
				bigg = num[i];
			}
		}return bigg;
	}
	
	public static void main(String[] args) {
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array 5 elements");
	for(int i=0;i<num.length;i++) {
		 num[i] = sc.nextInt();
	}
	System.out.println("the Biggest Number is" +biggNum(num));
	}
}

		
	


