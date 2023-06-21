package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {
Scanner scan=new Scanner (System.in);
/**key ->product id &value ->product object*/
Map<Integer,Product> db=new LinkedHashMap<Integer, Product>();

double totalBill = 0;

void addProduct() {

	db.put(1,new Product("Chocolates",20,5));
	db.put(2,new Product("Biscuit",30,15));
	db.put(3,new Product("ice cream",10,45));
	
}

void displayProduct() {

	Set<Integer> keys=db.keySet();//1 2 3
	for(int key:keys) {
		Product p= db.get(key);//getting product based on key
		System.out.println("Enter "+key+"to order "+p.getName());
		System.out.println("Avaliable Quantity: "+p.getQuantity());
		System.out.println("Cost: Rs."+p.getCost());
		System.out.println("------------------------------");
		
	}
	
}


void buyProduct (){
	System.out.println("Enter choice:");//choice => key
	int choice =scan.nextInt();//1
	
	Product p = db.get(choice);//Product p= Chocolate Object;
	if(p !=null) {
		System.out.println("Enter Quantity:");
		int quantity =scan.nextInt();//2
		
		if(quantity <=p.getQuantity()) {//2<=15
			// 1. calculating current product cost
			double  productCost =quantity * p.getCost();
			
			//2.Updating new quantity
			p.setQuantity(p.getQuantity()-quantity);
			
			//3.Adding current product cost to the total bill
			totalBill = totalBill + productCost;
			
			System.out.println("purchased "+quantity+" "+p.getName());
			System.out.println("Current Product Cost is Rs."+productCost);
			System.out.println("Total Bill as of now :Rs."+totalBill);
			
		}
		else {
			
			System.out.println("Insufficient Quantity");
			System.out.println("Available Quantity is "+p.getQuantity());
			
		}
	}
	else {
		System.out.println("invalid choice,Kindly enter valid choice");
	}
}

void checkout (){
	System.out.println("Thank you for Shopping");
	System.out.println("Your Total Bill is Rs." + totalBill);
	
}

}
