package com.jspider.builderpattern.main;

import com.jspider.builderpattern.Mobilebuilder;
import com.jspider.builderpattern.object.Mobile;

public class mobileMain {
	public static void main(String[] args) {
		Mobile mobile=new Mobilebuilder().price(25000.00).brand("oppo").color("gray").getMobile();
		System.out.println(mobile);
	}

}
