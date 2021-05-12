package com.ojas.student;

public class DaysColler extends Student {
	
	 double Transportfee;
	public DaysColler() {
		this.Transportfee=0;
	}

	public DaysColler(int sid, String sname, double examfee, double transportfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.examfee = examfee;
		Transportfee = transportfee;
	}
	
	public String displayDetails() {
		return "Student [sid=" + sid + ", sname=" + sname + ", examfee=" + examfee + "]" + "DaysColler [Transportfee=" + Transportfee + "]";
		}

	public double payfee(double amount) {
		if(examfee+Transportfee==amount) {
			System.out.println("no painding fee");
		}
		System.out.println("total fee");
		return examfee+Transportfee-amount;
	}

	
}
