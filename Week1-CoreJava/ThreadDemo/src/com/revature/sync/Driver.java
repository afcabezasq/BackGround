package com.revature.sync;

public class Driver {
	public static void main(String[] args) {
		
		StringBuilder sbuild = new StringBuilder();
		StringBuffer sbuffer = new StringBuffer();
		Runnable job = new StringTestRunnable(sbuild,sbuffer);
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		
		
	}

}
