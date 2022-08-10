package com.hexaware.java8Collection;

import java.util.ArrayList;
import java.util.Scanner;
public class SellerMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Seller> li = new ArrayList<>();
		System.out.println("1 for add seller");
		System.out.println("2 for display all seller ");
		System.out.println("3 for search seller by id");
		System.out.println("4 for update seller by id");
		System.out.println("5 for display all seller whose location is chennai");
		
		int ch;
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter your choice");
			ch = scan.nextInt();
			switch (ch) {
				case 1:SellerOperation.addSeller(li);
					break;
				case 2:SellerOperation.displayAllSeller(li);
					break;
				case 3:SellerOperation.searchSellerById(li);
					break;
				case 4:SellerOperation.updateSeller(li);
					break;
				case 5:SellerOperation.displayChennai(li);
					break;
				default :
					System.out.println("entered wrong choice");
			}
			System.out.println("to continue press yes esle press no");
			choice = scan.next();
			}
		scan.close();
		}
	
	
	
}
