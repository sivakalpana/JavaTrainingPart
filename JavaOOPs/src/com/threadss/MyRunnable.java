package com.threadss;

public class MyRunnable {

	public static void main(String[] args) {
		Thread t1= new Thread (new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
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
			
		});
		t1.start();

	}

}
