package com.amdocs.training.model;

public class Course {

	private String courseName;
	private double courseFee;
	private String description;
	private String resources;

	public Course() {
	}

	public Course(String courseName, double courseFee, String description, String resources) {
		super();
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.description = description;
		this.resources = resources;
	}

	

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

}
