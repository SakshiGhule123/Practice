package com.anudip.tarining.threaddemo;

class Customer 
{
	int amount = 10000;
	

	
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw the amount");
		
		if(this.amount < amount )
		{
			System.out.println("less balance ... waiting for deposite");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount = this.amount - amount;
			System.out.println("withdraw complete");
		}
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposite");
		
		
		this.amount = this.amount + amount;
		System.out.println("Deposite  complete");
		notify();
	}
}
public class WaitNotify {

	public static void main(String[] args) {
		
		final Customer c = new Customer();
		
		 new Thread()
	      {  
	        public void run()
	         {
	        	c.withdraw(15000);
	         }
	      }.start();  
	     
	     new Thread()
	      {  
	        public void run()
	         {
	        	c.deposit(10000);
	        }  
	      }.start();  
	}

}
