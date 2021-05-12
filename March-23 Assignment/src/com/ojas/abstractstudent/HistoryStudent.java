package com.ojas.abstractstudent;

public class HistoryStudent extends Student {
	
	public int historymarks;
	public int civicsmarks;

	
	@Override
	void getPersent() {
		
		int total = historymarks+civicsmarks;
		double percant = total/2;
		System.out.println("History Student Percant"+percant);
}


	public HistoryStudent() {
		super();
	}


	public HistoryStudent(int historymarks, int civicsmarks) {
		super();
		this.historymarks = historymarks;
		this.civicsmarks = civicsmarks;
	}

}
