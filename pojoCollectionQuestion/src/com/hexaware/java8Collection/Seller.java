package com.hexaware.java8Collection;

public class Seller {
	
	private String sellerId;
	private String location;
	private String name;
	private String email;
	
	public Seller() {
		
	}

	public Seller(String sellerId, String location, String name, String email) {
		super();
		this.sellerId = sellerId;
		this.location = location;
		this.name = name;
		this.email = email;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", location=" + location + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
