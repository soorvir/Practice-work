package com.hexaware.java8Collection;

import java.util.Scanner;
import java.util.ArrayList;

public class SellerOperation {
	static Scanner scan = new Scanner(System.in);
	public static void addSeller(ArrayList<Seller> li) {
		
		System.out.println("Enter seller name");
		String name = scan.next();
		System.out.println("Enter seller location");
		String location = scan.next();
		System.out.println("Enter seller email");
		String email = scan.next();
		System.out.println("Enter seller id");
		String sellerId = scan.next();
		
		li.add(new Seller(sellerId,location,name,email));
		
	}
	
	public static void displayAllSeller(ArrayList<Seller> li) {
		
		li.stream().forEach(streamValue -> System.out.println(streamValue));
	}
	
	public static void searchSellerById(ArrayList<Seller> li) {
		System.out.println("Enter seller id");
		String id = scan.next();
		li.stream().filter(sellerId -> id.equals(sellerId.getSellerId())).
		forEach(streamValue -> System.out.println(streamValue));
	}
	
	public static void updateSeller(ArrayList<Seller> li) {
		System.out.println("Enter seller id");
		String id = scan.next();
		System.out.println("Enter seller name");
		String name = scan.next();
		System.out.println("Enter seller location");
		String location = scan.next();
		System.out.println("Enter seller email");
		String email = scan.next();
		System.out.println("Enter seller new id");
		String sellerId = scan.next();
		
		
		li.stream().filter(sId -> id.equals(sId.getSellerId())).forEach(s -> {
		    s.setName(name); s.setLocation(location);s.setEmail(email);s.setSellerId(sellerId);
		});

	}
	
	public static void displayChennai(ArrayList<Seller> li) {
		li.stream().filter(location -> "chennai".equalsIgnoreCase(location.getLocation())).
				forEach(streamValue -> System.out.println(streamValue));
	}
}
