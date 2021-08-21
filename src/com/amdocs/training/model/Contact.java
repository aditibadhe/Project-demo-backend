package com.amdocs.training.model;

public class Contact {

	private double id;
	private String username;
	private String email;
	private double phone;
	private String message;
	

	public Contact() {
	}

	public Contact(double id, String username,String email, double phone,String message) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.phone=phone;
		this.message=message;
		
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
