package com.multithreadingproduct.main;

import com.multithreadingproduct.resource.godown;
import com.multithreadingproduct.thread.customer;
import com.multithreadingproduct.thread.supplier;


public class godownMain {
public static void main(String[] args) {
	godown godown=new godown(100);
	customer customer1=new customer(godown, 30);
	customer customer2=new customer(godown, 70);
	supplier supplier=new supplier(godown, 30);
	customer1.start();
	customer2.start();
	supplier.start();
	
}
}
