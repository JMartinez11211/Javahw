package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Laptop {

	private String name;
	private double price;
	private String os;
	
	@Autowired
	private PcInfo pcinfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public PcInfo getPcInfo() {
		return pcinfo;
	}

	@Autowired
	public void setPcInfo(PcInfo pcinfo) {
		this.pcinfo = pcinfo;
	}
	
	public void display() {
		System.out.println();
		System.out.println(name);
		System.out.println(os + " OS.");
		System.out.println("Price: $"+price);
		
	}


	
}
