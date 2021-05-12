package SingleTable;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		String res = " ";
		for(int i=1;i<=10;i++) {
			res += num + "*" + i +"="+(num*i)+"\n";
		}
		System.out.println(res);
		
		
	}

}
