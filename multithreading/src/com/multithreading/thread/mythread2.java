package com.multithreading.thread;

public class mythread2 extends Thread{
@Override
public void run() {
	for(int i=1;i<=5;i++)
	{
		System.out.println("mytheread2 is running");
	}
	System.out.println(Thread.currentThread().getName());
}
}
