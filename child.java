package com.java.demo.intro;

class Parent
{
	String name;
	
	
}
public class child extends Parent{
String name;
public void Display()
{
	super.name = "parent";
	name = "child";
	System.out.println(super.name+" and "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  child obj = new child();
  obj.Display();
	}

}
