package com.revature;

public class MySingleton {
	
	
	private static MySingleton mySingleton;
	
	int value;
	private MySingleton() {
		
		super();
	}
	
	public static MySingleton getInstance() {
		
		if(mySingleton == null) {
			
			mySingleton = new MySingleton();
		}
		return mySingleton;
	}
	
	
	public Object clone() throws CloneNotSupportedException{
		
		throw new CloneNotSupportedException();
		
	}

}
