package com.example.fooditems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.fooditems.model.FoodItem;

@Repository
public interface FoodRepository extends JpaRepository<FoodItem, Integer>{
	
	@Query(value="select max(item_number) from foodmenu", nativeQuery = true)
	public Integer getItemId();

}
