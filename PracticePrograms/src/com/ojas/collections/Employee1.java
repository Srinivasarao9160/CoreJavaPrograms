package com.ojas.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee1 implements Serializable{
	private int eid;
	private String ename;
	private int salary;

	public Employee1() {
		super();
	}

	public Employee1(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1(3, "venu", 10000));
		list.add(new Employee1(2, "reddy", 20000));
		list.add(new Employee1(5, "gopal", 25000));
		list.add(new Employee1(1, "hello", 30000));

		// list.stream().filter(emp ->
		// emp.getSalary()>10000).forEach(System.out::println);
		// list.stream().sorted(Comparator.comparing(Employee::getEid)).forEach(System.out::println);
		// list.stream().sorted(Comparator.comparing(Employee::getEname)).forEach(System.out::println);
		list.stream().sorted((emp1, emp2) -> emp1.getEname().compareTo(emp2.getEname())).forEach(System.out::println);
	}

}
