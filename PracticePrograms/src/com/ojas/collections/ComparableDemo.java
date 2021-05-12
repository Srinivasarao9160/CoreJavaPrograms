package com.ojas.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee2 implements Comparable {
	int eno;
	String ename;

	
	public Employee2() {
		super();
	}

	public Employee2(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	

	@Override
	public String toString() {
		return "Employee2 [eno=" + eno + ", ename=" + ename + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//
//		Employee2 emp = (Employee2) o;
//		return this.eno-emp.eno;
//	}
	@Override
	public int compareTo(Employee c) {

		return ename.compareTo(c.ename);
	

}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Employee2> al = new ArrayList<Employee2>();
		Employee2 e1 = new Employee2(10, "srinivas");
		Employee2 e2 = new Employee2(1, "venu");
		Employee2 e3 = new Employee2(2, "venu");
		Employee2 e4 = new Employee2(7, "jhgy");
		Employee2 e5 = new Employee2(5, "ramu");
		Employee2 e6 = new Employee2(9, "nanui");

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		
//		System.out.println("Befor Sorting");
//      al.forEach(x -> System.out.println(x.getEno() + "" + x.getEname()));
//      
//      Collections.sort(al);
//		System.out.println("After Sorting");
//		al.forEach(x -> System.out.println(x.getEno() + "" + x.getEname()));

		
		al.stream().sorted((emp1,emp2)->e1.getEname().compareTo(e2.getEname())).forEach(System.out::println);
	}
}
}
