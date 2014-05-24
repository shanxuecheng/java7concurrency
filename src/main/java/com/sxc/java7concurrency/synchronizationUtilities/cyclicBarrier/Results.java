package com.sxc.java7concurrency.synchronizationUtilities.cyclicBarrier;

public class Results {

	private int[] data;

	public Results(int size) {
		data = new int[size];
	}

	public void setData(int position, int value) {
		data[position] = value;
	}

	public int[] getData() {
		return data;
	}
}
