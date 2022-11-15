package com.example.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.FoodItem;
import com.example.repository.FoodItemDao;

@RestController
public class FoodItemController {

	private static FoodItemDao foodItemDao;

	@GetMapping("/manage_fooditems")
	public String showFoodItems(Map<String, Iterable<FoodItem>> map) {
		Iterable<FoodItem> foodItem = foodItemDao.findAll();
		map.put("foodItem_display", foodItem);
		return "foodItem_display";

	}

}
