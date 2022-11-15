package com.example.service;

import java.util.List;
import java.util.Optional;

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
	
	public List<FoodItem> showAllItems(){
		
		List<FoodItem> foodItem = (List<FoodItem>)foodItemDao.findAll();
		return foodItem;	
	}
	
	
}
