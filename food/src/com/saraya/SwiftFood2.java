
package com.saraya;

public class SwiftFood2 {
	  private String foodName;
      private String cuisine;
      private String foodType;
      private int quantity;
      private double unitPrice;
	
	
	public SwiftFood2(String foodName, String cuisine, String foodType, int quantity, double unitPrice) {
		this.foodName = foodName;
		this.cuisine = cuisine;
		this.foodType = foodType;
		this.quantity = quantity;
		this.unitPrice =unitPrice;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	
	public double totalOrdered() {
		double totalOrdered;
		return totalOrdered = unitPrice * quantity;
	}
	public String toString() {
		return ("foodName : " +foodName +"\n"+ "cuisine : " +cuisine +"\n"+ " "+"foodType :" +foodType +"\n"+" "+"Number of Unite = " +quantity +"\n"+" " +"Price of Unite = " +unitPrice +"\n"+" " +"totalOrdered = " +totalOrdered());
	}
	
	

}
