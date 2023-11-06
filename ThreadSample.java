package com.anudip.tarining.threaddemo;


// Application is program which is design to perform some specific task

// Process : Process is an executing instance of an application by double clicking

// Thread : smallest executable unit of the process

// Multitasking
/* Process Based multitasking :  multiprocessing
 * Multiple process are executed simultaneously
 * 
 **  ThreadBased Multitasking :
 *      multiple threads are in process are executed simultanesously
*/

/*
 * Thread Life Cycle
 * 
 * States :
 *      When the thread is born - new
 *      thread is ready   - runnable
 *      thread is ready with resources and memory  - running
 *      pause - waiting / blocked
 *      not alive - dead
 */

/*
 * Two ways to create a thread
 * 1 - by extending the thread
 * 2 -  Implementing Runnable interface
 */
public class ThreadSample extends Thread{

	@Override
	public void run()
	{
		System.out.println("ye vala code execute hoga");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for(int i = 10 ; i<=100 ; i++)
		{
			System.out.println(i + "From Main");
		}
		*/
		
		ThreadSample thread1 = new ThreadSample();  // newly created thread
		thread1.start();
		
		
	}

}
