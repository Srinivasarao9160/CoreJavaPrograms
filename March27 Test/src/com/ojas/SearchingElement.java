package com.ojas;

import java.util.Scanner;

public class SearchingElement {
	
	public static void getCount(int[] array,int num) {
		int count = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==num) {
				count++;
			}
			
		}
		System.out.println(count);
	
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int array[]= new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter Searching Element");
		int num = sc.nextInt();
		
		getCount(array, num);
	}

}
