package com.example.fooditemsmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fooditemsmanagement.model.FoodItem;
import com.example.fooditemsmanagement.repository.FoodItemDao;


@Service
public class FoodItemService {
	
	@Autowired
	FoodItemDao foodItemDao;
	
	
	public void saveItem(FoodItem foodItem) {
		
		foodItemDao.save(foodItem);
	}
	
	public List<FoodItem> showAllItems(){
		
		
		return foodItemDao.findAll();	
	}
	
	 public void deleteItem(Integer itemNumber){
	     foodItemDao.deleteById(itemNumber);
	    }

	
}
