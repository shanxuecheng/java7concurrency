package com.sxc.java7concurrency.synchronizationUtilities.cyclicBarrier2;


public class Videoconference implements Runnable {

	public Videoconference() {
	}

	@Override
	public void run() {
		System.out.printf("VideoConference: All the participants have come\n");
		System.out.printf("VideoConference: Let's start...\n");
	}
}
