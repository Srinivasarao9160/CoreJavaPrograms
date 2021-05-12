package com.ojas.student;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		DaysColler ds = new DaysColler(10,"srinivas",300,200);
		System.out.println(ds.displayDetails());
		System.out.println(ds.payfee(500));
		
		Hosteller hs = new Hosteller(10,"srinivas",300,200);
		System.out.println(hs.displayDetails());
		System.out.println(hs.payfee(500));



		
	}

}
