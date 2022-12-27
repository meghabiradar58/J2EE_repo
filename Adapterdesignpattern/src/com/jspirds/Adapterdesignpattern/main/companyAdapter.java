package com.jspirds.Adapterdesignpattern.main;

import com.jspirds.Adapterdesignpattern.Interface.companyEvent;
import com.jspirds.Adapterdesignpattern.object.Employee;

public class companyAdapter extends Employee implements companyEvent {
public static void main(String[] args) {
	companyAdapter adapter=new companyAdapter();
	adapter.setId(1);
	adapter.setName("megha");
	adapter.setEmail("megha128@gmail.com");
	System.out.println("the manager of all event is "+adapter.getName());
}
}
