package com.sxc.java7concurrency.threadManagement.waitingForFinalization;

import java.util.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader, "DataSourceThread");

		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader, "NetworkConnectionLoader");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Main: Configuration has been loaded: %s\n",new Date());
	}

}
