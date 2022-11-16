package com.example.fooditemsmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.fooditemsmanagement.service.FoodItemService;

@RestController
public class FoodItemController {
	 
	@Autowired
	FoodItemService foodItemService;
	
	
	@GetMapping("/dispaly_items")
	public ModelAndView displayAll() {
		
		ModelAndView mv = new ModelAndView("display_items");
	
	    mv.addObject("items",foodItemService.showAllItems());
	    return mv;
	}
	
	
	@GetMapping("/delete_item")
	public String deleteItem(@RequestParam int id) {
		foodItemService.deleteItem(id);
		
		return "redirect:/display_items";	
	}

}
