package com.example.fooditemsmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fooditemsmanagement.model.FoodItem;

public interface FoodItemDao extends JpaRepository<FoodItem, Integer>{


	
}
