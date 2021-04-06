package fundamentals;

import java.util.Scanner;

class Vehicle1 {
	
	String type, brand, name;
	Long modelNo;
	Float price;
	
	public Vehicle1() {
		System.out.println("\nNew obj initialized");
	}
	
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

public class Day3 {

	public static void main(String[] args) {
		Vehicle1[] vh = new Vehicle1[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<vh.length; i++) {
			vh[i] = new Vehicle1();				//why do we have to perform this step
			System.out.println("\nEnter Details of Vehicle "+ (i+1) +" : ");
			System.out.print("Enter Brand : ");
			vh[i].setBrand(sc.next());
			System.out.print("Enter Name : ");
			vh[i].setName(sc.next());
			System.out.print("Enter Type : ");
			vh[i].setType(sc.next());
			System.out.print("Enter Model No. : ");
			vh[i].setModelNo(sc.nextLong());
			System.out.print("Enter Price : ");
			vh[i].setPrice(sc.nextFloat());
		}
		sc.close();
		
		System.out.println("Entered Details are : ");
		for(int i=0; i<vh.length; i++) {
			System.out.println("\nCar number : " + (i+1));
			System.out.println(
					"Brand		: " + vh[i].getBrand() + 
					"\nName		: " + vh[i].getName() +
					"\nType		: " + vh[i].getType() +
					"\nModel No.	: " + vh[i].getModelNo() +
					"\nPrice		: " + vh[i].getPrice()
					);
		}
	}
}
