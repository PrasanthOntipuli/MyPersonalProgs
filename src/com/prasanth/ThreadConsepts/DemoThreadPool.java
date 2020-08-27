package com.prasanth.ThreadConsepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoThreadPool {

	public static void main(String[] args) {
	
		ExecutorService ex=Executors.newFixedThreadPool(0);
		
		try {
			ex.awaitTermination(85,TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyDemoCallable implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
