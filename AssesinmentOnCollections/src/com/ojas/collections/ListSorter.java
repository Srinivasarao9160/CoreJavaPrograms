package com.ojas.collections;

import java.util.Arrays;
import java.util.List;

public class ListSorter {

	private static void sortIntList(List<Integer> inputList) {
		inputList = Arrays.asList(10, 4, 2, 6, 5, 8);
		System.out.println("Before sorting" + inputList);
		inputList.sort(null);
		System.out.println("After sorting " + inputList);
	}

	public static void main(String[] args) {
		sortIntList(null);

	}

}
