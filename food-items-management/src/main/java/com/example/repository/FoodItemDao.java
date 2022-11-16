package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.FoodItem;

public interface FoodItemDao extends JpaRepository<FoodItem, Integer>{


	
}
