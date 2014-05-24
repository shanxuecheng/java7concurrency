package com.sxc.java7concurrency.threadExecutors.exceptionGroup;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThreadGroup threadGroup=new MyThreadGroup("MyThreadGroup");
		Task task=new Task();
		for (int i=0; i<2; i++){
			Thread t=new Thread(threadGroup,task);
			t.start();
		}
	}

}
