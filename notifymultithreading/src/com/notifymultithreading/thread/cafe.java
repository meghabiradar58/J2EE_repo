package com.notifymultithreading.thread;

import com.notifymultithreading.resource.pizza;

public class cafe extends Thread {
pizza pizza;
public cafe(pizza pizza)
{
  super();
  this.pizza=pizza;
 
}
@Override
	public void run() {
		// TODO Auto-generated method stub
		pizza.bakepizza(30);
	}
}
