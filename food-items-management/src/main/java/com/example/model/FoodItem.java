package com.example.model;

import javax.persistence.*;

@Entity
@Table(name="fooditem")
public class FoodItem {
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="item_number")
	private Integer itemNumber;
	
	@Column(name="item_name")
	private String itemName;
	
	private String cuisine;
	private Double price;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAvailabity() {
		return availabity;
	}

	public void setAvailabity(String availabity) {
		this.availabity = availabity;
	}

}
