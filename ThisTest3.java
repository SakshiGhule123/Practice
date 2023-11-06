package com.java.demo.intro;

public class ThisTest3 {

	void Display()
	{
		this.Show();
		System.out.println("Inside the Display function");
	}
	
	void Show()
	{
		System.out.println("Inside the Show function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest3 obj = new ThisTest3();
       obj.Display();
	}

}
