package com.ojas.student;

public class Student {
	 int sid;
	 String sname;
	 double examfee;
	
	public Student() {
		this.sid = 0;
		this.sname = null;
		this.examfee = 0;
	}
	public Student(int sid, String sname, double examfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.examfee = examfee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", examfee=" + examfee + "]";
	}
	
	public String displayDetails() {
		return "Student [sid=" + sid + ", sname=" + sname + ", examfee=" + examfee + "]";
		}
	public double payfee() {
		return 0;
	}
	
	

}
