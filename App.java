package com.anudip.hiber.utildemo;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.hiber.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = HiberUtil.getSessionFactory().openSession();
    	Transaction tx=session.beginTransaction();
    	
    	Employee emp=new Employee();
    	//emp.setEmpid(1);
    	
    	//emp.setEmpName("Sakshi");
    	//emp.setEmpId(121);
    	emp.setSurname("Padmaja");
    	emp.setEmpName("Kapoor");
    	emp.setAddress("US");
    	emp.setDesignation("Manager");
    	//emp.setPhone("043455");
    	
    	session.save(emp);
    	tx.commit();
    	session.close();
    	
    	System.out.println("Employee add hua");
    }
}
