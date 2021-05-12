package com.ojas;

public class Employee {
	private int eno;
	private String ename;
	private double esal;
	
	public Employee(int eno, String ename, double esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	

}
