package com.jspider.builderpattern.object;

public class Mobile {
private String brand;
private String model;
private String color;
private String os;
private double price;
private int ram;
private int memory;
private int f_cam;
private int r_cam;
private int disp_size;
public Mobile(String brand, String model, String color, String os, double price, int ram, int memory, int f_cam,
		int r_cam, int disp_size) {
	super();
	this.brand = brand;
	this.model = model;
	this.color = color;
	this.os = os;
	this.price = price;
	this.ram = ram;
	this.memory = memory;
	this.f_cam = f_cam;
	this.r_cam = r_cam;
	this.disp_size = disp_size;
}

@Override
public String toString() {
	return "Mobile [brand=" + brand + ", model=" + model + ", color=" + color + ", os=" + os + ", price=" + price
			+ ", ram=" + ram + ", memory=" + memory + ", f_cam=" + f_cam + ", r_cam=" + r_cam + ", disp_size="
			+ disp_size + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}



}
