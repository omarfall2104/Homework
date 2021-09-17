package com.saraya;

public class Student {
	private int id;
	private String name;
	private double marks;
	private int yearOfEngineering;
	private String statusResident;
	
	public Student(String name, int id, double marks, int yearOfEngineering, String statusResident) {
		this.id= id;
		this.name = name;
		this.marks = marks;
		this.statusResident = statusResident;
		this.yearOfEngineering= yearOfEngineering;
		
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
	public void setName (String name) {
	this.name = name;
	}
	public double getmarks() {
		return marks;
	}
	public void serLevel(double marks) {
		this.marks = marks;
	}
	public int getYearOfEngineering() {
		return yearOfEngineering;
	}
	public void setYearOfEngineering(int yearOfEngineering) {
		this.yearOfEngineering= yearOfEngineering;
	
	}
	public String getStatuResident() {
		return statusResident;
	}
	public void setStatuResident(String statuResident) {
		this.statusResident = statuResident;
	}
	public String toString() {
		return ( "Student Name : " +name +" \n" +"Student Id : " +"" +id +"\n " +"Qualifying marks : "+ marks +" \n" +"Year of Engineering :" + yearOfEngineering +" \n" +"Residential status : " + statusResident);
	}
}
