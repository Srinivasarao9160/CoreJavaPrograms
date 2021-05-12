
//1)Use recursion to add all of the numbers between 5 to 10.

package Assesment21programs;

import java.util.Scanner;

public class SumofNumRange {
	
	static int recuSum(int start,int end) {
		if (start == end) {
			return start;
		}
		return start+recuSum(++start,end);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start value");
		int start= sc.nextInt();
		System.out.println("enter end value");
		int end = sc.nextInt();
		System.out.println(recuSum(start, end));

		}

}
