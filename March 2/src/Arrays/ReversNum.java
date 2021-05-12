package Arrays;

import java.util.Scanner;

public class ReversNum {
	
	static int[] reversNum(int numbers[]) {
		int rev[] = new int[numbers.length];
		int k=0;
		for(int i=numbers.length-1;i>=0;i--) {
			 rev[k] = numbers[i];
			k++;
		}
		return rev;
		}
	public static void main(String[] args) {

		int numbers[] = new int[10];
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter 10 elements");
		for(int i = 0;i<numbers.length;i++) {
			numbers[i]= sc.nextInt();
		}
		for(int x : reversNum(numbers)) {

		System.out.println(x);
	}
	

}
}
