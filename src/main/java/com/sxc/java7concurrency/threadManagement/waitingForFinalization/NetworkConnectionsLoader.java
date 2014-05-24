package com.sxc.java7concurrency.threadManagement.waitingForFinalization;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionsLoader implements Runnable {

	@Override
	public void run() {

		System.out.printf("Network connection loading: %s\n", new Date());
		try {
			TimeUnit.SECONDS.sleep(8);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Network connection loading has finished: %s\n", new Date());

	}

}
