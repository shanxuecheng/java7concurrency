package com.sxc.java7concurrency.synchronizationUtilities.cyclicBarrier2;

import java.util.concurrent.CyclicBarrier;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Videoconference conference = new Videoconference();
		CyclicBarrier barrier = new CyclicBarrier(10, conference);
		System.out.printf("VideoConference: Initialization: %d participants.\n", barrier.getParties());
		for (int i = 0; i < 10; i++) {
			Participant p = new Participant(barrier, "Participant " + i);
			Thread t = new Thread(p);
			t.start();
		}
	}

}
