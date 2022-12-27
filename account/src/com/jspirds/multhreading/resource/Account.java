package com.jspirds.multhreading.resource;

public class Account {
	double accountBalance;

	public Account(double accountBalance) {
		super();
		this.accountBalance=accountBalance;
		
	}
	public void checkBalance() {
		System.out.println(accountBalance);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public synchronized void deposite(double amount) {
		accountBalance +=amount;
		checkBalance();
//		System.out.println(accountBalance);
	}
	public synchronized void withdrow(double amount) {
		if(accountBalance>=amount) {
			accountBalance -=amount;
//			System.out.println(accountBalance);
			checkBalance();
		}
		else {
			System.out.println("insufficient Balance");
		}


	}
	
	

}
