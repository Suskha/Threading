package com.main;


import com.thread.*;

public class TestThread {

	private static ThreadBuilder threadBuilder = new ThreadBuilder();

	public static void main(String args[]) {
		threadBuilder.startThread();
	}
}