package com.amdocs.training.model;

public class User {

	private String user_name;
	private String password;
	private double phone_no;
	private String address;
	private String reg_date;
	private String upload_photo;
	private String email;

	public User() {
	}

	public User(String user_name, double phone_no_no,String email,String address,String reg_date, String password,String upload_photo ) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.reg_date=reg_date;
		this.address=address;
		this.upload_photo=upload_photo;
		this.phone_no = phone_no_no;
		this.email = email;
	}



	public String getUsername() {
		return user_name;
	}

	public void setUsername(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public double getPhone() {
		return phone_no;
	}

	public void setPhone(double phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return reg_date;
	}

	public void setDate(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getImg() {
		return upload_photo;
	}

	public void setImg(String upload_photo) {
		this.upload_photo = upload_photo;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
