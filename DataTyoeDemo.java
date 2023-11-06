package com.java.demo.intro;

public class DataTyoeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ia = 0;
       String Age = "Hello";
       System.out.println(ia);
       
       int a = 60;	//60 = 0011 1100 
	      int b = 13;	// 13 = 0000 1101 
	      int c = 0;

	      c = a & b;        // 12 = 0000 1100 
	      System.out.println("a & b = " + c );

	      c = a | b;        // 61 = 0011 1101 
	      System.out.println("a | b = " + c );

	      c = a ^ b;        // 49 = 0011 0001 
	      System.out.println("a ^ b = " + c );
	      c = a << 2;       // 240 = 1111 0000
	      System.out.println("a << 2 = " + c );

	      c = a >> 2;       // 15 = 1111 
	      System.out.println("a >> 2  = " + c );

	      c = a >>> 2;      // 15 = 0000 1111 
	      System.out.println("a >> 2 = " + c );
	      
	      int iMin = (a < b)? a:b;
	      System.out.println(iMin);
	      
	      int Marks = 90;
	      
	      if(Marks > 100)
	      {
	    	  System.out.println("Distinction");
	      }
	      else if(Marks > 80)
	      {
	    	  System.out.println("First Class");
	      }
	      else
	      {
	    	  System.out.println("Fail");
	      }
	      
	    char std = 'C';
	    
	    switch(std)
	    {
	    case 'A':
	    	 System.out.println("Your exam time is at 7 O Clock");
	    	 break;
	    case 'B':
	    	 System.out.println("Your exam time is at 8 O Clock");
	    	 break;
	    case 'C':
	    	 System.out.println("Your exam time is at 9 O Clock");  
	    	 break;
	    default:
	   
	    	 System.out.println("Invalid input");
	      }
	    
	    for(int i = 0; i <= 10;i++)
	    {
	  
	    	 System.out.println(i);
	    }
	    
	    int cin = 13;
	    
	    System.out.println(++cin); 
	    System.out.println(cin++);
	    System.out.println(--cin);
	    System.out.println(cin--);
	    
	}

}
