package com.ojas.shirtapp;

public class Tester {

	public static void main(String[] args) {
		materials ms = materials.COTTON;


		Shirt s1 = new Shirt(30.2f,50.1f,""+ms);
		Shirt s2= new Shirt(1.2f,5.1f,""+ms);


		System.out.println(s1.displyDetails());
		System.out.println(s2.displyDetails());

	}

}
