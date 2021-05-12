package Arrays;

import java.util.Scanner;

public class EvenNumbers {
	
	static String evenNumbers(int numbers[]) {
		String res = "";
		//int even = 0;
		
		for (int i=0;i<numbers.length;i++) {
			
			if(numbers[i]%2==0) {
				res += numbers[i] + " ";
			
				}
			} return res;
				 
           }

	public static void main(String[] args) {

		int numbers[] = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 values");
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("even numbers is "+ evenNumbers(numbers));
	}

}
