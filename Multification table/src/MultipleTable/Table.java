package MultipleTable;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {

	Scanner sc  = new Scanner(System.in);
		System.out.println("enter start number");
		System.out.println("enter end number");

		int start = sc.nextInt();
		int end = sc.nextInt();

		String res = " ";
		
		for (int num=start; num<=end;num++) {
			
		for(int i=1;i<=10;i++) {
			res += num + "*" + i +"="+(num*i)+"\n";
		}
		System.out.println(res);
		
		
	}

}
}
