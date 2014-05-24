package com.sxc.java7concurrency.threadExecutors.executorPeriodic;

import java.util.Date;

public class Task implements Runnable {
	
	private String name;
	
	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run()  {
		System.out.printf("%s: Starting at : %s\n",name, new Date());
	}

}
