package DataStructers;

import java.util.Scanner;

public class BoubleSort {
	static void boubleSort(int num[]) {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1-i; j++) {
				if (num[j]> num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 elements");
		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();
		}
		boubleSort(num);
	}
}
