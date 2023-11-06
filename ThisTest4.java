package com.java.demo.intro;

public class ThisTest4 {
	
	int a;
	int b;
	
	ThisTest4()
	{
		a=5;
		b=10;
	}
	void Display(ThisTest4 obj)
	{
		System.out.println("a = "+ a+ "  b = "+b);
	}
	
	void get()
	{
		Display(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ThisTest4 obj = new ThisTest4();
     obj.get();
	}

}
