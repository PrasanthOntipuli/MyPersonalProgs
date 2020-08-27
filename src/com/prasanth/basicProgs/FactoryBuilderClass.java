package com.prasanth.basicProgs;



public class FactoryBuilderClass {

	private volatile Integer data=1;
public void getTheInput()
{
	synchronized (this) {
		
		
		while(data<50)
		{
		if(data%5==0){	
		notify();
		try {
			wait();
			System.out.println("Thead is in wait");
		}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else
		{
			data++;
		}
		}
	}
	
}
	
public static void main(String[] args) {
	final FactoryBuilderClass ru=new FactoryBuilderClass();
	
Runnable r1=new Runnable() {
	
	@Override
	public void run() {
		
		System.out.println("r1 is running");
		ru.getTheInput();
	}
};
Runnable r2=new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("R2 is running");
		ru.getTheInput();
	}
};	

Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t2.start();
}
}