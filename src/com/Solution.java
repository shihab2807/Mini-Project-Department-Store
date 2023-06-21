package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Welcome to XYZ Departmental Store");
		System.out.println("---------------------------------");
		
		Scanner scan=new Scanner(System.in);
		
		DepartmentalStore d=new DepartmentalStore();
		d.addProduct();//1.adding products into db
		int choice =1;
		while (choice== 1) {
			d.displayProduct();//2.displaying product from Db
			d.buyProduct();//3.buying products
			System.out.println("Enter 1 to continue or any other number to checkout");
			choice = scan.nextInt();
			System.out.println("----------------------");
		}
		d.checkout();//4.checking out from store
		
		
		

	}

}
