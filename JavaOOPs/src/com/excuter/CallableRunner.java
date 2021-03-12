package com.excuter;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
private String name;
public CallableTask(String name) {
	this.name = name;
}
	
	
	@Override
	public String call() throws Exception {
		Thread.sleep(3000);
		return  " Hello " + name;
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		Future<String> welcomeFuture =
				executorService.submit(new CallableTask("30 minutes"));
	
	 System.out.print("\n new CollableTask Executed  ");
	String WelcomeMessage =  welcomeFuture.get();
	System.out.print(WelcomeMessage);
	
	 System.out.print("\n main completed");
	}

}
