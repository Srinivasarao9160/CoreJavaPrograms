package com.ojas.abstractstudent;

public abstract class Student {
	public String studentname;
	public String studentclass;
	protected static int totalNoOfStudents;
	
	public Student() {
		super();
	}

	public Student(String studentname, String studentclass) {
		super();
		this.studentname = studentname;
		this.studentclass = studentclass;
	}
	
	abstract  void getPersent();
	
	static void getTotalNoOfstudents() {
		
	}

}
