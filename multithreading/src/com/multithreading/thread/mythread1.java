package com.multithreading.thread;

public class mythread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("mytheread 1 is running");
		}
		System.out.println(mythread1.currentThread().getName());
	}
}
