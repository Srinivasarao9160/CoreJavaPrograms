package com.ojas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter1 {

	public static List<Integer> sortIntList(List<Integer> inputList) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(25);
		list.add(100);
		list.add(2525);
		list.add(32);
		list.add(58);
		Collections.sort(list);
		list.forEach(System.out::println);
		return list;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		System.out.println(sortIntList(list));
	}
}
