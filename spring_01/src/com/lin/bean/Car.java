package com.lin.bean;
/*
*@author linone
*/
public class Car {

	private String band;
	public  int price;
	public void setBand(String band) {
		this.band = band;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "car [band=" + band + ", price=" + price + "]";
	}
	public Car(String band, int price) {
		super();
		this.band = band;
		this.price = price;
	}
	public Car() {
		super();
		
	}
	
}
