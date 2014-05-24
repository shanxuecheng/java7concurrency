package com.sxc.java7concurrency.synchronizationUtilities.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> buffer1 = new ArrayList<String>();
		List<String> buffer2 = new ArrayList<String>();

		Exchanger<List<String>> exchanger = new Exchanger<List<String>>();

		Producer producer = new Producer(buffer1, exchanger);
		Consumer consumer = new Consumer(buffer2, exchanger);

		Thread threadProducer = new Thread(producer);
		Thread threadConsumer = new Thread(consumer);
		
		threadProducer.start();
		threadConsumer.start();
	}

}
