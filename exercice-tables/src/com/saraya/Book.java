package com.saraya;

public class Book {
	private String title;
	private int noOfCopie;
	
	public Book(String title, int noOfCopie) {
		this.title = title;
		this.noOfCopie = noOfCopie; 
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopie() {
		return noOfCopie;
	}
	public void setNoOfCopie(int noOfCopie) {
		this.noOfCopie = noOfCopie;
	}
	public String toString() {
		return ("Title of book : " +title +" ," +"Number of copie: " +noOfCopie);
	}
}	
