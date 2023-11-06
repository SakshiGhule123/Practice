package com.anudip.Training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyFirstPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
   
		// register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// established a connection
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb ", "root" ,"Sbg@240901");
		
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO emp VALUES(?,?,?,?,?)");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the employee ID");
		int id = sc.nextInt();
		
		System.out.println("Enter the employee Name");
		String name = sc.next();
		
		System.out.println("Enter the employee Designation");
		String desig = sc.next();
		
		System.out.println("Enter the employee Department");
		String dept = sc.next();
		
		System.out.println("Enter the employee Salary");
		int sal = sc.nextInt();
		
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		// executing the statement
		int i =pstmt.executeUpdate();
		
		con.close();
		System.out.println(i +" employee record added");
	}

}
