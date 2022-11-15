package com.example.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.FoodItem;

public interface FoodItemDao extends JpaRepository<FoodItem, String>{

	Optional<FoodItem> findById(Integer itemId);

	
}
