package com.uca.capas.domain;

public class Student {
	private String name;
	private String lastName;
	private String bDate;
	private String career;
	private String experience;
	
	public Student() {}
	
	public Student(String name, String lastName, String bDate, String career, String experience) {
		this.name = name;
		this.lastName = lastName;
		this.bDate = bDate;
		this.career = career;
		this.experience = experience;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getbDate() {
		return bDate;
	}

	public String getCareer() {
		return career;
	}

	public String getExperience() {
		return experience;
	}
	
	
	
	
}
