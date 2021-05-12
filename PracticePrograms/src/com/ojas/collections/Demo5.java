package com.ojas.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

class Employee{
	int eno;
	String ename;
	public Employee(int eno, String ename) {
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
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
}
 class Student{
	 int sno;
	 String sname;
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	  
 }
public class Demo5 {
	public static void main(String[] args) {
		
	ArrayList list = new ArrayList();
	list.add(new Employee(1, "sriniavs"));
	list.add(new Employee(2, "venu"));
	list.add(new Employee(3, "akshya"));
	
	list.add(new Student(1, "ramu"));
	list.add(new Student(1, "balu"));
	list.add(new Student(1, "ajay"));
	
	list.add("phani");
	
	Object b[] = list.toArray();
	
	for (Object x : b) {
		if(x instanceof Employee) {
			Employee e = (Employee) x;
			System.out.println(e.eno +"-"+ e.ename);
		}
		if(x instanceof Student) {
			Student s = (Student) x;
			System.out.println(s.sno +"-"+ s.sname);
		}
		if(x instanceof)
		
		
	}
	



		
		
		
	}

}
