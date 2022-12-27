package com.jspider.builderpattern;

import com.jspider.builderpattern.object.Mobile;

public class Mobilebuilder {
	
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
		
		public Mobilebuilder brand(String brand)
		{
			this.brand=brand;
			return this;
			
		}
		public Mobilebuilder model(String model)
		{
			this.model=model;
			return this;
			
		}
		public Mobilebuilder color(String color)
		{
			this.color=color;
			return this;
			
		}
		public Mobilebuilder price(double price)
		{
			this.price=price;
			return this;
			
		}
		public Mobilebuilder os(String os)
		{
			this.os=os;
			return this;
			
		}
		public Mobilebuilder ram(int ram)
		{
			this.ram=ram;
			return this;
			
		}
		public Mobilebuilder memory(int memory)
		{
			this.memory=memory;
			return this;
			
		}
		public Mobilebuilder f_cam(int f_cam)
		{
			this.f_cam=f_cam;
			return this;
			
		}
		public Mobilebuilder r_cam(int r_cam)
		{
			this.r_cam=r_cam;
			return this;
			
		}
		public Mobilebuilder disp_size(int disp_size)
		{
			this.disp_size=disp_size;
			return this;
		
		}
		public Mobile getMobile() {
			Mobile mobile=new Mobile(this.brand,this.model,this.color,this.os,this.price,this.ram,this.ram,this.f_cam,this.r_cam,this.disp_size);
			return mobile;
			
		}

	}



