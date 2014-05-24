package com.sxc.java7concurrency.threadManagement.uncontrolledException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task task=new Task();
		Thread thread=new Thread(task);
		thread.setUncaughtExceptionHandler(new ExceptionHandler());
		thread.start();
	}

}
