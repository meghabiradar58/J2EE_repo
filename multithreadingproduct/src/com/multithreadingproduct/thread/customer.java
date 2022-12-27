package com.multithreadingproduct.thread;

import com.multithreadingproduct.resource.godown;

public class customer extends Thread {
	godown godown;
	int orderproduct;
	public customer(godown godown, int orderproduct) {
		super();
		this.godown=godown;
		this.orderproduct = orderproduct;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	godown.orderproduct(orderproduct);
}
}
