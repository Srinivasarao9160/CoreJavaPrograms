package com.ojas;

public class Student {

	public int studentid;
	public String studentname;
	private int marks;
	private char grade;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Student() {
		super();
	}

	public Student(int studentid, String studentname, int marks) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.marks = marks;
	    this.grade = grade;
		calculateGrade();
	}

	public String displayDetails()

	{

		return "Student [name=" + studentname + " ,studentId=" + studentid + " , marks=" + marks + ", grade= " + grade
				+ "]";

	}

	private void calculateGrade()

	{

		if (marks > 90)

		{

			grade = 'A';

		}

		else if (marks > 80 && marks <= 90)

		{

			grade = 'B';

		}

		else if (marks > 70 && marks <= 80)

		{

			grade = 'C';

		}

		else if (marks > 60 && marks <= 70)

		{

			grade = 'D';

		}

		else

		{

			grade = 'E';

		}

	}

	public static void main(String[] args) {

		Student s = new Student(20,"srinivas",80);
				System.out.println(s.displayDetails());
	}

}
