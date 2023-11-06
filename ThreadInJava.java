package com.anudip.tarining.threaddemo;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i = 0 ; i <=100 ;i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);

		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		for(int i = 101 ; i <=200 ;i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}

public class ThreadInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread1 t1 = new Thread1();  // new State
		t1.setName("Thread 1");
		t1.setPriority(10);
		// t1.sleep(500);
		t1.start();                  // running state
		
		Thread2 t2 = new Thread2();
		t2.setName("Thread 2");
		t1.setPriority(2);
		t2.start();

	}

}
