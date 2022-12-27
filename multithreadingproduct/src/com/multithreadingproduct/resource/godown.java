package com.multithreadingproduct.resource;

public class godown {
	int availableproduct;

	public godown(int availableproduct) {
		
		this.availableproduct = availableproduct;
		System.out.println(availableproduct + "  are avaliable ");
	}

	public synchronized void orderproduct(int noOfproduct) {
		if (noOfproduct>availableproduct) {

			try {
				System.out.println(noOfproduct + "  are not avaliable please wait");
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Now"+ availableproduct + "  are avaliable ");
		System.out.println(noOfproduct + "  successfull delivered product");
		availableproduct -= noOfproduct;
		System.out.println("after delivery"+ availableproduct + "  are remaning ");
		System.out.println(noOfproduct + "  product avaliable");
	}

	public synchronized void restoreproduct(int noOfproduct) {
		this.availableproduct += noOfproduct;
		System.out.println(noOfproduct + "  product avaliable");
		this.notify();

	}

}
