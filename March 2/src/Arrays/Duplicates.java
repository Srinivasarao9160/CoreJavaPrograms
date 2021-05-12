package Arrays;

import java.util.Scanner;

public class Duplicates {
	
	static String duplicat(int numbers[]) {
		String res = "       ";
		for(int i =0;i<numbers.length;i++) {
			for (int j = i+1; j< numbers.length; j++)
			{
			if(numbers[i]==numbers[j]) {
				res += numbers[j] + ",";
			
				}
			}
		
		}
		return res.substring(0, res.length()-1);
		
	}
	
	public static void main(String[] args) {

		int numbers[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 10 values");
		for(int i=0;i<numbers.length;i++) {
			  numbers[i]=sc.nextInt();
		}
		System.out.println("Duplicate elements"+duplicat(numbers));
		
		
}

}

