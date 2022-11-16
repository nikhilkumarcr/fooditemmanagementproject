package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.FoodItem;
import com.example.repository.FoodItemDao;


@Service
public class FoodItemService {
	
	@Autowired
	FoodItemDao foodItemDao;
	
	
	public void saveItem(FoodItem foodItem) {
		
		foodItemDao.save(foodItem);
	}
	
	public List<FoodItem> showAllItems(){
		
		List<FoodItem> foodItem = (List<FoodItem>)foodItemDao.findAll();
		return foodItem;	
	}
	
	 public void deleteItem(Integer itemNumber){
	     foodItemDao.deleteById(itemNumber);
	    }

	   public void findItem(Integer itemNumber){
	     foodItemDao.getReferenceById(itemNumber);
	    }
	
	
}
