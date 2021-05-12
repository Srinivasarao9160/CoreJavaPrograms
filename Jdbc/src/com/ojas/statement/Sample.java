package com.ojas.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200", "root", "root");
			System.out.println("connected sucessfully");
			System.out.println(con);

			Scanner sc = new Scanner(System.in);
			Statement st = con.createStatement();

			 //update details
			System.out.println("Enter number,name,marks");
			int num = sc.nextInt();
			String name = sc.next();
			int marks = sc.nextInt();
			int res = st.executeUpdate("update student set sname="+"'"+name+"',marks="+marks+" where sno ="+num);
			System.out.println(res + "update sucessfully");

			// Delete
//			System.out.println("enter num");
//			int num = sc.nextInt();
//			int res = st.executeUpdate("delete from student where sno ="+num);
//			System.out.println(res+"deleted susfully");
//			
			//insert
			// System.out.println("Enter number,name,marks");
//			int num = sc.nextInt();
//			String name = sc.next();
//			int marks = sc.nextInt();
//			int res = st.executeUpdate("insert into student values("+num+",'"+name+"',"+marks+")");
//			System.out.println(res+"insert sucessfully");

			// create
			// st.executeUpdate("create table student(sno int,sname varchar(20),marks
			// int)");
			// System.out.println("create sucesfully");

			// insert
//			st.executeUpdate("insert into student values(1,'srinivas',10)");
//			System.out.println("insert sucesfully");

			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
