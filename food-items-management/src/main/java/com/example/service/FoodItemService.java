package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.FoodItem;
import com.example.repository.FoodItemDao;


@Service
public class FoodItemService {
	
	private FoodItemDao foodItemDao;
	
	
	@Autowired
	public FoodItemService(FoodItemDao foodItemDao) {
		this.foodItemDao=foodItemDao;
	}
	
	public void saveFoodItem(FoodItem foodItem) {
		
		foodItemDao.save(foodItem);
		
		System.out.println("Adddd!!!!");
	}
	

}
