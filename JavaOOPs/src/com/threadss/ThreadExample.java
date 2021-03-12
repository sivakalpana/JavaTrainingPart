package com.threadss;

class MyThread extends Thread {
	//public static int amount=0;
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
}
}
	
public class ThreadExample{
	
	public static void main(String[] args) {
	
	 MyThread thread = new MyThread();
	 thread.start();
	 
	 MyThread thread1 = new MyThread();
	 thread1.start();
	 
	/* while(thread.isAlive()) {
		 System.out.println("waiting....");
	 }
	 System.out.println(amount);
	 amount++;
	 System.out.println(amount);
	
	}
	public void ru() {
		amount++;
	}*/
	
	}	

}
