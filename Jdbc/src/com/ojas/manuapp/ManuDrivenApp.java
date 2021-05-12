package com.ojas.manuapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


class student {
	int sno;
	String sname;
	int marks;

	public student() {
		super();
	}

	public student(int sno, String sname, int marks) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.marks = marks;
	}
}

class Operation {

	Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200", "root", "root");
			System.out.println("connected sucessfully" + con);

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	void menu() {
		String m = "Menu Driven Application\n";
		m += "1.AddStudent\n";
		m += "2.DeleteStudent\n";
		m += "3.UpdateStudent\n";
		m += "4.ListStudents\n";
		m += "5.Exit \n";
		System.out.println(m);

	}

	// add student
	boolean addStudent(student stud) {
		boolean b = false;
		try {
			Connection con = getConnection();
			PreparedStatement pmt = con.prepareStatement("insert into student values(?,?,?)");
			pmt.setInt(1, stud.sno);
			pmt.setString(2, stud.sname);
			pmt.setInt(3, stud.marks);

			int res = pmt.executeUpdate();
			if (res > 0) {
				b = true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

	// Update Student
	boolean updateStudent(int sno, String sname, int marks) {
		boolean b = false;
		try {
			Connection con = getConnection();
			PreparedStatement pmt = con.prepareStatement("update student set sname=?,marks=? where sno=?");
			pmt.setString(1, sname);
			pmt.setInt(2, marks);
			pmt.setInt(3, sno);

			int res = pmt.executeUpdate();
			if (res > 0) {
				b = true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

	// Delete Student
	boolean deteletStudent(int sno) {
		boolean b = false;
		try {
			Connection con = getConnection();
			PreparedStatement pmt = con.prepareStatement("delete from student where sno=?");
			pmt.setInt(1, sno);
			int res = pmt.executeUpdate();
			if (res > 0) {
				b = true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

	// list students
	void listStudent() {
		try {
			Connection con = getConnection();
			PreparedStatement pmt = con.prepareStatement("select * from student");
			ResultSet rs = pmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "" + rs.getString(2) + "" + rs.getInt(3));

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

public class ManuDrivenApp {
	public static void main(String[] args) {
		int sno,marks;
		String  sname;
		boolean res;
		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();

		while(true) {
			op.menu();
			System.out.println("enter your choice");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter student details");
				sno = sc.nextInt();
				sname = sc.next();
				marks = sc.nextInt();
				student student = new student(sno,sname,marks);
				res = op.addStudent(student);
				if(res==true) {
					System.out.println("inserted sucessfully");
				}else {
					System.out.println("not inserted");
				}
				break;

			case 2:
				System.out.println("enter student to detelet");
				sno = sc.nextInt();
				res =op.deteletStudent(sno);
				if(res==true) {
					System.out.println("delete sucessfully");
				}else {
					System.out.println("not delete");
				}
				break;

			case 3:
				System.out.println("enter student details to update");
				sno = sc.nextInt();
				sname = sc.next();
				marks = sc.nextInt();
				res = op.updateStudent(sno, sname, marks);
				if(res==true) {
					System.out.println("updated  sucessfully");
				}else {
					System.out.println("not updated ");
				}
				break;
				case 4:
					System.out.println("student list");
					op.listStudent();
					break;
					case 5:
						System.exit(0);
						default:
							System.out.println("invalid Option");
			}
		}
		
		
		

	}

}
