package com.ojas;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String empname;
	private static String cname;
	
	
	public Employee() {
		super();
	}
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.cname="ojas";
	}
	public String display() {
		return this.empid+","+this.empname+","+this.cname;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size Of Employees");
		int size = sc.nextInt();
		Employee emp[] = new Employee[size];
		System.out.println("Enter"+emp.length+"employee Info");
		
		for(int i = 0;i<emp.length;i++) {
			System.out.println("Enter employeeId and employeeName");
			emp[i] = new Employee(sc.nextInt(),sc.next());
		}
		System.out.println("Employee Info as follows");
		
		for(Employee x : emp) {
			System.out.println(x.display());
		}
	}
	

}
