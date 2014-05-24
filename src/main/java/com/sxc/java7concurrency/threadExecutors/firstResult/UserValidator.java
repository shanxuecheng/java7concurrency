package com.sxc.java7concurrency.threadExecutors.firstResult;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UserValidator {
	private String name;
	
	public UserValidator(String name) {
		this.name = name;
	}
	
	public boolean validate(String name, String password) {
		Random random=new Random();
		try {
			long duration=(long)(Math.random()*10);
			System.out.printf("Validator %s: Validating a user during %d seconds\n",this.name,duration);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			System.out.println("Interrupted " + this.name);
			return false;
		}
//		return random.nextBoolean();
		return true;
	}
	
	public String getName(){
		return name;
	}
}
