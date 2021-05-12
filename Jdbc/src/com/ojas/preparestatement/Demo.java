package com.ojas.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Demo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200", "root", "root");
			System.out.println("connected sucessfully");
			System.out.println(con);

			Scanner sc = new Scanner(System.in);
			PreparedStatement pmt = con.prepareStatement("insert into student values(?,?,?)");
	
			System.out.println("Enter number,name,marks");
			int num = sc.nextInt();
			String name = sc.next();
			int marks = sc.nextInt();
			
			pmt.setInt(1, num);
			pmt.setString(2, name);
			pmt.setInt(3, marks);
			
			int res = pmt.executeUpdate();
			System.out.println("data inserted sussefully"+res);
			pmt.close();
			con.close();
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}


