package com.sxc.java7concurrency.concurrentCollections.myBlockingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue {
	
	private int capacity;
	
	private Queue<Object> linkedList;
	
	private Lock lock = new ReentrantLock();
	
	private Condition notEmpty = lock.newCondition();
	
	private Condition notFull = lock.newCondition();
	
	public MyBlockingQueue(int capacity) {
		this.capacity = capacity;
		linkedList = new LinkedList<Object>();
	}
	
	public void put(Object obj) throws InterruptedException {
		lock.lock();
		try {
			while(linkedList.size() == capacity) {
				notFull.await();
			}
			linkedList.offer(obj);
			notEmpty.signalAll();
		} finally {
			lock.unlock();
		}
	}
	
	public Object take() throws InterruptedException {
		lock.lock();
		try {
			while(linkedList.size() == 0) {
				notEmpty.await();
			}
			Object obj = linkedList.poll();
			notFull.signal();
			return obj;
		} finally {
			lock.unlock();
		}
	}
	
}
