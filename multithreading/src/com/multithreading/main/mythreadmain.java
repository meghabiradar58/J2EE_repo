package com.multithreading.main;

import com.multithreading.thread.mythread1;
import com.multithreading.thread.mythread2;

public class mythreadmain {
	public static void main(String[] args) {
		mythread1 mythread1 = new mythread1();
		mythread1.setName("thread1");
		// System.out.println(mythread1.getName());
		mythread1.setPriority(6);
		mythread2 mythread2 = new mythread2();
		Thread Thread = new Thread(mythread2);
		Thread.setName("thread2");
		// System.out.println(mythread2.getName());
		mythread1.setPriority(8);
		Thread.start();
		mythread1.start();

	}
}
