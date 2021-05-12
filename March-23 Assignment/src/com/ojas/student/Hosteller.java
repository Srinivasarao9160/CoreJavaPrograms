package com.ojas.student;

public class Hosteller extends Student {
	private double hostelfee;
	
	public Hosteller() {
		
	}

	@Override
	public String toString() {
		return "Hosteller [hostelfee=" + hostelfee + "]";
	}

	public Hosteller(int sid, String sname, double examfee, double hostelfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.examfee = examfee;
		this.hostelfee = hostelfee;
	}
	public String displayDetails() {
		return "Student [sid=" + sid + ", sname=" + sname + ", examfee=" + examfee + "]"+"Hosteller [hostelfee=" + hostelfee + "]";
		
	}
	public double payfee(int amount) {
		if(examfee+hostelfee==amount) {
			System.out.println("no panding fee");
		}
		System.out.println("Total fee");
		return examfee+hostelfee-amount;
	}

}
