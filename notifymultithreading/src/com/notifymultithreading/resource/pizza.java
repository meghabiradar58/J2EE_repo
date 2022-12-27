package com.notifymultithreading.resource;

public class pizza {
	int noOfpizza;

	public pizza(int noOfpizza) {
		System.out.println(noOfpizza + "pizza avaliable ");
		this.noOfpizza = noOfpizza;

	}

	public int checkpizza() {
		return noOfpizza;
	}

	public synchronized void orderpizza(int noOfpizza) {
		System.out.println("ordering " + noOfpizza + "  pizzas");
		if (noOfpizza >= checkpizza()) {

			try {
				System.out.println(noOfpizza + "  are not avaliable please wait");
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.noOfpizza -= noOfpizza;
		System.out.println(checkpizza() + "  pizza avaliable");
	}

	public synchronized void bakepizza(int noOfpizza) {
		this.noOfpizza += noOfpizza;
		System.out.println(checkpizza() + "  pizza avaliable");
	}
}
