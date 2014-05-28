package com.sxc.java7concurrency.synchronizationUtilities.cyclicBarrier2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Participant implements Runnable {

	private String name;
	
	private final CyclicBarrier barrier;

	public Participant(CyclicBarrier barrier, String name) {
		this.barrier = barrier;
		this.name = name;
	}

	@Override
	public void run() {
		long duration = (long) (Math.random() * 10);
		try {
			TimeUnit.SECONDS.sleep(duration);
			arrive(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void arrive(String name) {
		System.out.printf("%s has arrived.\n", name);
		try {
			barrier.await();
//			Blocked
			System.out.printf("VideoConference: Arrived %d participants.\n", barrier.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	

}
