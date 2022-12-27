package com.jspirds.multhreading.thread;

import com.jspirds.multhreading.resource.Account;

public class wife extends Thread {
Account account;

public wife(Account account) {
	
	this.account = account;
}
@Override
public void run() {
	account.deposite(1500);
	account.withdrow(1000);
}


}
