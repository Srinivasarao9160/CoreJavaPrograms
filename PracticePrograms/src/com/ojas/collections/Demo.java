package com.ojas.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Stream;

public class Demo {

	public Vector<Integer> dispEvenNo(int start, int end) {
		Vector<Integer> v = new Vector<Integer>();

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				v.addElement(i);
			}

		}

		return v;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values");
		int s = sc.nextInt();
		int e = sc.nextInt();

		Demo obj = new Demo();
		Vector<Integer> v = obj.dispEvenNo(s, e);
		v.forEach(x -> System.out.println(x));
		
		
		// enumaration
		Enumeration<Integer> e1 = v.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
			
		}

		
		
		
		
		
		
		
		
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(10);
//		list.add(20);
//		list.add(50);
//		list.add(60);
//		list.add(50);
//		list.add(90);
//		list.add(450);
//
//		list.stream().distinct().forEach(System.out::println);
		
//	arrays to llist 	
//		List<String> list = Arrays.asList("anu","banu","sri");
//		Stream<T>

//		Integer num[] = new Integer[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 5 values");
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//		}
//		Stream<Integer> inStrem = Stream.of(num);
//		inStrem = inStrem.sorted();
//		inStrem.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
