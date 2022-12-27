package com.jspirds.multhreading.main;

import com.jspirds.multhreading.resource.Account;
import com.jspirds.multhreading.thread.husband;
import com.jspirds.multhreading.thread.wife;

public class Accountmain {
public static void main(String[] args) {
	Account account=new Account(5000);
	husband husband=new husband(account);
	wife wife=new wife(account);
	husband.start();
	wife.start();
	
}
}
