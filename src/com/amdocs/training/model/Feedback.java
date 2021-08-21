package com.amdocs.training.model;

public class Feedback {

	private double id;
	private String username;
	private String email;
	private String fdback;
	

	public Feedback() {
	}

	public Feedback(double id, String username,String email,String fdback) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.fdback=fdback;
		
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

	
	public String getFdback() {
		return fdback;
	}

	public void setFdback(String fdback) {
		this.fdback = fdback;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
