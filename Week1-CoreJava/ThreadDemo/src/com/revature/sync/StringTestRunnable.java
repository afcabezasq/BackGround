package com.revature.sync;

public class StringTestRunnable implements Runnable{
	
	StringBuilder sbuild =  new StringBuilder();
	StringBuffer sbuffer = new StringBuffer();
	
	
	public StringTestRunnable() {
		super();
		
	}
	
	public StringTestRunnable(StringBuilder sbuild, StringBuffer sbuffer) {
		super();
		this.sbuild = sbuild;
		this.sbuffer = sbuffer;
	}

	@Override
	public void run() {
		
		for(int i = 0;i<50;i++) {
			
			sbuild = sbuild.append("o");
			sbuffer = sbuffer.append("o");
			
		}
		
	}

}
