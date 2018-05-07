package com.cars.gc;

public class NewCar {

	private String make;
	private String model;
	private int year;
	private double price;

	public NewCar() {
		super();
	}

	public NewCar(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// return "NewCar [make=" + make + ", model=" + model + ", year=" + year + ",
		// price=" + price + "]";
		return String.format("%1$-10s %2$-10s %3$-10d $%4$,10.2f", make, model, year, price);
	}

}
