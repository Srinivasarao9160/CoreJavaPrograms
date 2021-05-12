package com.ojas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(60);
		list.add(50);
		list.add(90);
		list.add(450);
		
		Collections.sort(list,Collections.reverseOrder());
		list.forEach(System.out::println);

		
		Set<Integer> set = new HashSet<Integer>(list);
		set.forEach(System.out::println);

		
		
		
		
			
		
	}

}
