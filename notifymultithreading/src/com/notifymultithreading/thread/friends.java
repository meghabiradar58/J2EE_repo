package com.notifymultithreading.thread;

import com.notifymultithreading.resource.pizza;

public class friends extends Thread {
	pizza pizza;
    int noOfPizza;
	public friends(pizza pizza,int noOfpizza) {
		super();
		this.pizza = pizza;
		this.noOfPizza=noOfpizza;
	}
	@Override
	public void run() {
		pizza.orderpizza(noOfPizza);
	} 

}
