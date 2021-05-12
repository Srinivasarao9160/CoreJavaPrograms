package com.ojas.collections;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Demo3 {
	
	

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("rame");
		ts.add("anusha");
		ts.add("sriniavs");
		ts.add("dhana");
		ts.add("venu");


		ts.forEach(System.out::println);
		
		
	}

}
