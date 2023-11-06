package com.anudip.tarining.threaddemo;

class ThreadOne implements Runnable
{

	@Override
	public void run() {
		
		for(int i = 0 ; i <=100 ;i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);

		}

	}
	
}

class ThreadTwo implements Runnable
{

	@Override
	public void run() {
		
		for(int i = 0 ; i <=100 ;i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);

		}

	}
	
}
public class ThreadInInterface {

	public static void main(String[] args) {
		
		ThreadOne tOne = new ThreadOne();
		Thread t1 = new Thread(tOne);
		t1.setName("Thread 1");
		t1.start();

		ThreadTwo tTwo= new ThreadTwo();
		Thread t2 = new Thread(tTwo);
		t2.setName("Thread 2");
		t2.start();

	}

}