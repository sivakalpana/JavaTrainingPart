package com.threadss;
//implementing Runnable interface
public class Runnable1 implements Runnable{

	public static void main(String[] args) {
		Runnable1 obj = new Runnable1();
		Thread thread = new Thread(obj);
		//Thread thread1 = new Thread(obj);
		thread.start();
		//thread1.start();
		//System.out.println("The code is outside of the thread");
	}
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getId()+ "value:" +i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//System.out.println("This code is running in  thread");
	
	}
	
	}

