package com.example.fooditemsmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.FoodItem;
import com.example.service.FoodItemService;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan
@SpringBootApplication
public class FoodItemsManagementApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(FoodItemsManagementApplication.class,
				args);
		
		FoodItem foodItem = new FoodItem();
		
		foodItem.setItemName("MUTTON-BIRIYANI");
		foodItem.setCuisine("INDIAN");
		foodItem.setPrice(200.00);
		foodItem.setAvailabity("YES");
		
		FoodItemService foodItemService = applicationContext.getBean("foodItemService",FoodItemService.class);
		
		foodItemService.saveFoodItem(foodItem);
		
		applicationContext.close();
		
	}

}
