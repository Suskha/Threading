package com.thread;


public class ThreadBuilder {

	private String[] threadNames = { "roshan", "prajwal", "sita", "ram" };

	public ThreadBuilder() {
	}

	private void runThread() {
		for (String thread : threadNames) {
			for (int j = 9; j > 0; j--) {
				RunnableDemo threadStart = new RunnableDemo(thread, j);
				threadStart.start();
			}
		}
	}


	public void startThread() {
		runThread();
	}
}
