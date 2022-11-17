package com.example.fooditemsmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.fooditemsmanagement.model.FoodItem;
import com.example.fooditemsmanagement.service.FoodItemService;

@RestController
public class FoodItemController {
	 
	@Autowired
	FoodItemService foodItemService;
	
	@GetMapping("/homepage")
	public ModelAndView homepage() {
		ModelAndView mv = new ModelAndView("homepage");
        mv.addObject("foodList",foodItemService.showAllItems());
		return mv;
		
	}
	
	@GetMapping("/deleteitem")
	public ModelAndView deleteItem(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("redirect:/homepage");
		foodItemService.deleteItem(id);
		return mv;	
	}

	@GetMapping("/additem")
    public ModelAndView addDetails(Model model) {
		ModelAndView mv = new ModelAndView("additem");
		 mv.addObject("fooditems", new FoodItem());
		return mv;	
    }
    
	
	@PostMapping("/addingitem")
	public ModelAndView display(@ModelAttribute("fooditems") FoodItem foodList) {
		
		ModelAndView mv = new ModelAndView("redirect:/homepage");

	    foodItemService.saveItem(foodList);
		return mv;
	}
	
	


}
