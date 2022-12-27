package com.notifymultithreading.main;

import com.notifymultithreading.resource.pizza;
import com.notifymultithreading.thread.cafe;
import com.notifymultithreading.thread.friends;

public class pizzamain {
public static void main(String[] args) {
	pizza pizza=new pizza(70);
	cafe cafe=new cafe(pizza);
	friends friends=new friends(pizza,35);
	friends.start();
	cafe.start();
	
}
}
