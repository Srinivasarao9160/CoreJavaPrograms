package Numbers;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter start number");
		Integer start = sc.nextInt();
		System.out.println("enter end number");
		Integer end = sc.nextInt();
		
		
		for(int i=start; i<=end;i++) {
			System.out.println(i);
		}
		
		

		
	}

}
