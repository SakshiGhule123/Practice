package com.java.demo.intro;

public class Constructor {
	public Constructor()  // no-argconstructor 
	{
		System.out.println("default");
	}
	// parameterize constructor
	public Constructor(int a,int b) //parameters list
	{
		System.out.println(a+b);
	}
	public Constructor(int m,int z,int k)
	{
		System.out.println(m+z+k);
	}
	public Constructor(int m)
	{
		System.out.println(m*m);
	}
	public Constructor(int m,float z,int k)
	{
		System.out.println(m*z*k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cd=new Constructor(3,4); //arguments list
	}

}
