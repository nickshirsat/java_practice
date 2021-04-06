package fundamentals;

import java.util.Scanner;

	/* Getter/Setter practice assignment
	 * Core Java Day 2
	 */

class Vehicle {
	public Vehicle() {
		System.out.println("Object initialized");
	}
	String type, brand, name;
	Long modelNo;
	Float price;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getModelNo() {
		return modelNo;
	}
	public void setModelNo(Long modelNo) {
		this.modelNo = modelNo;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
}
public class Day2 {
	
	public static void main(String [] args) {
		Vehicle vh = new Vehicle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle details");
		
		System.out.print("Brand Name : ");
		vh.setBrand(sc.next());
		
		System.out.print("Vehicle Name : ");
		vh.setName(sc.next());
		
		System.out.print("Vehicle type : ");
		vh.setType(sc.next());
		
		System.out.print("Model number : ");
		vh.setModelNo(sc.nextLong());
		
		System.out.print("Price : ");
		vh.setPrice(sc.nextFloat());
		sc.close();
		
		System.out.println("The entered details are...");
		System.out.println(
				"Brand Name : " + vh.getBrand() +
				"\nVehicle Name : " + vh.getName() +
				"\nVehicle Type : " + vh.getType() +
				"\nModel Number : " + vh.getModelNo() +
				"\nPrice : " + vh.getPrice()
				);
	}
}
