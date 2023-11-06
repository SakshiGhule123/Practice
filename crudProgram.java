package com.anudip.Training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class crudProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int id ;
		String name , address ,course;
		int marks;
		
		Scanner obj = new Scanner(System.in);
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		// established a connection
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb ", "root" ,"Sbg@240901");
		Statement stmt = con.createStatement();
		
		int option =0 ;
		
		System.out.println("choose option ");
		System.out.println("1 : Insert \n2 : select \n3:Prepared Statement \n4: Update \n5: Delete");
		option=obj.nextInt();
		switch(option)
		{
		case 1: 
			
			// Insert 
			
						
			 stmt.executeUpdate("INSERT INTO student VALUES(1, 'Aditi', 'sangamner', 'IT', 78)");
				
				// connection close
				System.out.println("Sussesfully store hua");
				con.close();
				
				break;
				
		case 2:
			
			// select query
			
						
			ResultSet rs =stmt.executeQuery("Select * from student");
			
			
			
			System.out.println("Student details");
			System.out.println("==========");
			
			while(rs.next())
			{
				id = rs.getInt(1);
				name = rs.getString(2);
				address =rs.getString(3);
				course = rs.getString(4);
				marks =rs.getInt(5);
				System.out.println(id+"		"+name+"	"+address+"	"+course+"	"+marks);
			}
			
			break;
			
		case 3 :
			
			//  Prepared Statement
			
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?)");
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the student  ID");
			 id = sc.nextInt();
			
			System.out.println("Enter the student Name");
			 name = sc.next();
			
			System.out.println("Enter the student Address");
			address = sc.next();
			
			System.out.println("Enter the student course");
			course = sc.next();
			
			System.out.println("Enter the student marks");
			marks = sc.nextInt();
			
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, course);
			pstmt.setInt(5, marks);
			
			// executing the statement
			int i =pstmt.executeUpdate();
			
			con.close();
			System.out.println(i +" student record added");
			
			break;
			
		case 4:
			
			// UPDATE
			
						
			String sql="update student set course ='computer' where id=1";
			
			 i=stmt.executeUpdate(sql);
			
			 rs= stmt.executeQuery("select * from student");	
			//System.out.println(rs);
			
			 name = null;
			System.out.println("student details");
			System.out.println("============");	
			while(rs.next())
			{
				id=rs.getInt(1);
				name=rs.getString(2);
				address=rs.getString(3);
				course=rs.getString(4);
				marks=rs.getInt(5);
				System.out.println(id+"  "+name+"  "+address+"  "+course+"  "+marks);
			}
			con.close();
			
			break;
		
		case 5:
			
			// delete
			
			 sql="delete from student where id=2";
			
			stmt.executeUpdate(sql);
			
	        rs= stmt.executeQuery("select * from student");	
			//System.out.println(rs);
			
			 name = null;
			
			
			System.out.println("Student details");
			System.out.println("============");	
			while(rs.next())
			{
				id=rs.getInt(1);
				name=rs.getString(2);
				address=rs.getString(3);
				course=rs.getString(4);
				marks=rs.getInt(5);
				System.out.println(id+"  "+name+"  "+address+"  "+course+"  "+marks);
			}
			con.close();
			
			break;
		}
	}

}
