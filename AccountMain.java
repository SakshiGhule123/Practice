package com.anudip.tarining.threaddemo;

class Account extends Thread
{
	static int balance = 1000;
	
	public void run()
	{
		synchronized(Account.class)
		{
		
		
		if(balance >= 800)
		{
			System.out.println(Thread.currentThread().getName() 
					+ " : " + "Your balance is " + balance + " so you can withdraw the amount");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		balance = 200 ;
		System.out.println(Thread.currentThread().getName() 
				+ " : " + " after withdawl your balance is " + balance );
	}
	
	else
	{
		System.out.println(Thread.currentThread().getName() 
				+ " : " + " your balance is " + balance +" so you can not withdrawl");
	}
	}
	}
}

public class AccountMain {

	public static void main(String[] args) {
		
     Account ac1 =  new Account();
     ac1.setName("Sakshi");
     
     Account ac2 =  new Account();
     ac2.setName("Punam");
     
     ac1.start();
     ac2.start();
     
	}

}
