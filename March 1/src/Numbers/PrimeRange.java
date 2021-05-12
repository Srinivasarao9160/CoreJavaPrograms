package Numbers;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter start value");
		int start = sc.nextInt();
        System.out.println("enter end value");
		int end = sc.nextInt();
		String res = "";
		for(int num=start; num<=end;num++) {
		int i=2;int flag = 0;
		while (i<num/2) {
			if (num%i==0) {
				flag++;
				break;
			}
			i++;
		}
		if (flag==0) {
		
			res += num+",";
}

	}
		System.out.println(res.substring(0,res.length()-1));

	}
}
