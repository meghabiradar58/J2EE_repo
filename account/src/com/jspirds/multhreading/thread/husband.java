package com.jspirds.multhreading.thread;

import com.jspirds.multhreading.resource.Account;

public class husband extends Thread {
	Account account;

	public husband(Account account) {
		
		this.account = account;
	}
	@Override
	public void run() {
		account.deposite(1500);
		account.withdrow(1000);
	}

}
