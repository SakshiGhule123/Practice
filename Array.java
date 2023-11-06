package com.java.demo.intro;

import java.util.Arrays;

class UserDefine
{
	int a;
	
	public void method()
	{
		System.out.println("Inside the method");
	}
}
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDefine[]  UserDefineArray = new UserDefine[10];
		
		for(int  i =0 ; i < UserDefineArray.length;i++ )
		{
			 UserDefineArray[i] = new UserDefine();
		}
		
		UserDefineArray[1].method();
		
     int a[] = {3,5,7,2,7};
     
     int b[]=Arrays.copyOf(a, a.length);
     //int b[]= a.clone();
     //int b[] = a; 
     
     
     for(int i =0 ; i< a.length ;i++)
     {
    	 System.out.println(b[i]);
     }
     
     a[3] = 4;
     System.out.println(b[3]);
	}

}
