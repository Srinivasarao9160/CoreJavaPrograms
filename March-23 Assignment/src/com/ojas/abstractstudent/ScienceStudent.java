package com.ojas.abstractstudent;

public class ScienceStudent extends Student {

	public int physicsMarks;
	public int chemistryMarks;
	public int mathsMarks;
	
	public ScienceStudent() {
		super();
	}

	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	void getPersent() {

		int total = physicsMarks+chemistryMarks+mathsMarks;
		double percant= total/3;
		System.out.println("Science Student Percant"+ percant);
		
	}
}
