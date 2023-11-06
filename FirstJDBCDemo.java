package com.anudip.Training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
 // register the drive
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// established a connection
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb ", "root" ,"Sbg@240901");
		
				//create SQL statement
		Statement stmt = con.createStatement();
		
		// execute statement

        stmt.executeUpdate("INSERT INTO emp VALUES(1, 'Aditi', 'Manager', 'IT', 10000)");
		
		// connection close
		System.out.println("Sussesfully store hua");
		con.close();
	}

}

