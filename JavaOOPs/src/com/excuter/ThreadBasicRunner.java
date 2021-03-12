package com.excuter;



	class Task1 extends Thread{
		public void run() {
			System.out.println("\nTask1 Started");
			for(int i=101; i<=199;i++) 
				System.out.print(i + " ");
				
				System.out.print("\n Task1 Down");
			
		}
	}
	class Task2 implements Runnable {

		@Override
		public void run() {
			System.out.print("\nTask2 Started");
			for(int i=201;i<=299;i++) 
				System.out.print(i + " ");
				
				System.out.print("\n Task2 Down");
		}
		}
		public class ThreadBasicRunner {
			public static void main(String[] args) {
				
				System.out.print("\nTask1 Kiked Off");
				Task1 task1= new Task1();
				task1.start();
				
				System.out.print("\nTask2 Kicked Off");
                     Task2 task2= new Task2();
                     Thread task2Thread= new Thread(task2);
                     task2Thread.start();
                   
                    
			}
		}
	
	
