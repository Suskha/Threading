package com.thread;

public class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;
	private int inputNumber;
	
	//private long start;
	//private long end;
	private ThreadFactory threadFactor = new ThreadFactory();
	
	RunnableDemo(String name, int newIinputNumber) {
		threadName = name;
		inputNumber = newIinputNumber;
		//System.out.println("Creating " + threadName);
	}


	public void start() {
		//System.out.println("Starting " + threadName);
	//	start = System.currentTimeMillis();
		if (t == null) {
			String threadActualName = threadName + Integer.toString(inputNumber);
			t = new Thread(this, threadActualName);
			t.start();
		}
	}


	@Override
	public void run() {
		//System.out.println("Running " + threadName );
		threadFactor.threadFactory(threadName, inputNumber);
		//end = System.currentTimeMillis();
		//System.out.println(end-start);
		//System.out.println("Thread " + threadName + " exiting.");
	}
}
