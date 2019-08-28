package com.revature.producerconsuming;

public class Basket {

	private int contents;
	private boolean isAvaible =  false;
	
	/*
	 * 
	 * -if there is something in the basket already we 
	 * want to return the contents
	 * 
	 * - if there's not something avaible 
	 * we want to wait
	 */
	
	public synchronized int get() {
		
		return 0;
	}
	
	/*
	 * If there is somethingin the basket the producer want to wait until the contensts have been onsumed
	 *
	 */
	
	public synchronized void put(int value) {
		
		while(! isAvaible) {
			try {
			System.out.println("\t\t\t"+Thread.currentThread().getName()+"is waiting");
			wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" got: "+contents);
			isAvaiable = false; 
			notify(); 
			return contents;
		}
		
	}
	
}
