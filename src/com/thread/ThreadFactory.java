package com.thread;

import com.auth.*;

public class ThreadFactory {

	public void threadFactory(String threadName, int inputNumber) {
		PhoneNumberFormatter numberFormat = new PhoneNumberFormatter(threadName);

		for (int i = (inputNumber * (111111)); i >= ((inputNumber - 1) * (111111)); i--) {
			// System.out.print(threadName + " " + i);
			
			
			if (numberFormat.numberFormatter(i, "9848") 
			|| numberFormat.numberFormatter(i, "9849")
			|| numberFormat.numberFormatter(i, "9841")) 
			{
				break;
			}
		}
	}

}