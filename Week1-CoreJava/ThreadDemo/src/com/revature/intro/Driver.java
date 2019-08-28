package com.revature.intro;

public class Driver {

	public static void main(String[] args) {
		
		Thread t = new TestThread();
		System.out.println("Thread state:" + t.getState()+", is alive? "+t.isAlive());
		//t.run();
		t.start();
		
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread state:" + t.getState()+", is alive? "+t.isAlive());
	}

}
