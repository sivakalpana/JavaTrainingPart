package com.threadss;

public class ThreadDemo extends Thread {
public static void main(String[] args) {

	  ThreadDemo thread = new ThreadDemo();
	  thread.start();
	  System.out.println("the code is outside of the thread");
}

	 public void run() {
		 System.out.println("this code is running in a Thread");
	 }

}
