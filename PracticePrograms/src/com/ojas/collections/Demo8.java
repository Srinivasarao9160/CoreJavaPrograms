package com.ojas.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	
}
public class Demo8 {

	public static void main(String[] args) {
  TreeSet<String> t = new TreeSet<String>(new MyComparator());
  t.add("orange");
  t.add("apple");
  t.add("banana");
  t.add("mango");
  
  t.forEach(x->System.out.println(x));

		
	}

}
