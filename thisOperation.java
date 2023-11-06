package com.java.demo.intro;

class thisX
{
	int iValue;
	
	void Display(int iValue)
	{
		this.iValue = iValue;
		System.out.println("the value is :"+this.iValue);
	}
}


public class thisOperation {

	int a;
	int b;
	
	thisOperation()
	{
		a=5;
		b=10;
	}
	void Display(thisOperation obj)
	{
		System.out.println("a = "+ a+ "  b = "+b);
	}
	
	void get()
	{
		Display(this);
	}
	public static void main(String[] args) {
		thisX obj = new thisX();
		obj.Display(10);
		
		thisOperation obj1 =  new thisOperation();
		obj1.get();
		
	}

}
