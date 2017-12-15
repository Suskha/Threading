package com.auth;
import java.text.DecimalFormat;

public class PhoneNumberFormatter extends AuthenticationChecker {

	public PhoneNumberFormatter(String threadName) {
		super(threadName);
	}

	public boolean numberFormatter(int number, String startingDigit) {
		DecimalFormat myFormatter = new DecimalFormat("000000");
		String password = startingDigit + myFormatter.format(number);
		return check(password);
	}
}
