package Arrays;

import java.util.Scanner;

public class SmallestNumber {

	static int smallestNum(int num[]) {
		int small = num[0];
		for(int i=1;i<num.length;i++) {
			if (num[0]<small) {
				small = num[0];
			}
		}
		return small;
		
	}
	public static void main(String[] args) {

		int num[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 elements");
		for(int i=0;i<num.length;i++) {
			num[i]= sc.nextInt();
		}
		System.out.println(smallestNum(num));
		
	}

}
