package com.springAdvance.springJdbc.entites;

public class Student {
	private int id;
	private String name;
	private String address;
	private String city;
	private String course;

	public Student(int id, String name, String address, String city, String course) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.course = course;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", course=" + course
				+ "]";
	}

}
