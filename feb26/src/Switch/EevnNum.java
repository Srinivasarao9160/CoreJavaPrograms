package Switch;

import java.util.Scanner;

public class EevnNum {

	public static void main(String[] args) {
		while(true) {
        String res = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		switch (num%2) {
		case 1:
			res += num+ "is not even";
			break;
		case 0:	
			res += num+ "is  even";
         break;

		default:
			res += num + " is invalid";
			break;
		}
		System.out.println(res);
	}

}
}