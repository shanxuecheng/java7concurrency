package com.sxc.java7concurrency.threadManagement.uncontrolledException;

public class Task implements Runnable {

	@Override
	public void run() {
		Integer.parseInt("TTT");
	}

}
