package com.anudip.tarining.threaddemo;

public class JoiningThreadDemo extends Thread
{

	public void run()
	{
		for(int i = 1 ; i <=3 ;i++)
		{
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		JoiningThreadDemo t1 = new JoiningThreadDemo();
		JoiningThreadDemo t2 = new JoiningThreadDemo();
		JoiningThreadDemo t3 = new JoiningThreadDemo();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t2.join();
		
		
		t3.start();
	}

}
