package Numbers;

import java.util.Scanner;

public class Amstrong {
	
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		int temp=num;
		
		while(num !=0) {
			rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
			}
		
		
      if (temp==sum) {
			System.out.println(sum+"is amstrong");
		}
		else {
			System.out.println(sum+"is not amstrong");
		}
    
		
}
}


