package com.prasanth.ThreadConsepts;


public class DeadLockOccuranceLog {

	public void checkDeadLock() {

		synchronized (this) {
			try {
				System.out.println("Thread relsesed resorses");
				this.wait();
				System.out.println("Thread notified Sheduler resorese free state");
				this.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("exit");
	}

	public static void main(String[] args) {

		DeadLockOccuranceLog dl = new DeadLockOccuranceLog();
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				dl.checkDeadLock();
			}
		};
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				dl.checkDeadLock();
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		System.out.println("T1 is started");
		t2.start();
		System.out.println("T2 is started");
	}
}
