package com.java.demo.intro;

class Constructor1
{
	int iAmount ;
	public  Constructor1(int iValue)
	{
		 iAmount = iValue;
		System.out.println("The Parameterised Base Constructor value is : "+iAmount);
	}
}

class Constructor2 extends Constructor1
{
	public  Constructor2()
	{
       super(11);
		System.out.println("In the derived constructor ");
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 obj = new Constructor2();
	}

}
