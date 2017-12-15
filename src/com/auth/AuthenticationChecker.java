package com.auth;
import com.fm.login.Authentication;

public abstract class AuthenticationChecker {
	private Authentication authentication = new Authentication();
	private String threadName;
	public static boolean running = true;

	public AuthenticationChecker(String threadName) {
		super();
		this.threadName = threadName;
	}

	public boolean check(String password) {
		if (authentication.login(threadName, password)) {
			System.out.println("username : " + threadName + " password : " + password);
			AuthenticationChecker.running = false;
			return true;
		} else if (!running) {
			return true;
		}
		return false;
	}
}
