package com.example.fooditems.model;

import javax.persistence.*;

@Entity
@Table(name="foodmenu")
public class FoodItem {
    
	@Id
	private Integer itemNumber;
	private String itemName;
	private String cuisine;
	private String price;
	private String availabity;

	public Integer getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAvailabity() {
		return availabity;
	}

	public void setAvailabity(String availabity) {
		this.availabity = availabity;
	}

	@Override
	public String toString() {
		return "FoodItem [itemNumber=" + itemNumber + ", itemName=" + itemName + ", cuisine=" + cuisine + ", price="
				+ price + ", availabity=" + availabity + "]";
	}
    
	
}
