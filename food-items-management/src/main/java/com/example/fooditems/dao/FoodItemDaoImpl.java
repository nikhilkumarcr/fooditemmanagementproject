package com.example.fooditems.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fooditems.model.FoodItem;

@Service
public class FoodItemDaoImpl implements FoodItemDao {

	private FoodRepository foodRepository;

	@Autowired
	public FoodItemDaoImpl(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}
	
	
	@Override
	public Integer getItemNumber() {
	   Integer id;
	   if(foodRepository.getItemId() == null)
           id=101;
		else
			id=foodRepository.getItemId()+1;
	   return id;   
	}
	
	
	@Override
	public List<FoodItem> showAllItems() {
		return foodRepository.findAll();
	}

	@Override
	public void saveItem(FoodItem foodList) {
		foodRepository.save(foodList);
	}

	@Override
	public void deleteItem(Integer id) {
		foodRepository.deleteById(id);

	}

	@Override
	public FoodItem getDetails(Integer id) {
		return foodRepository.findById(id).get();
	}

	
}
