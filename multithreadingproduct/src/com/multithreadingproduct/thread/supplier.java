package com.multithreadingproduct.thread;

import com.multithreadingproduct.resource.godown;

public class supplier extends Thread {
	godown godown;
	int restoreproduct;
	public supplier(godown godown,int restoreproduct) {
		super();
		this.godown=godown;
		this.restoreproduct = restoreproduct;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		godown.restoreproduct(restoreproduct);
	}
	

}
