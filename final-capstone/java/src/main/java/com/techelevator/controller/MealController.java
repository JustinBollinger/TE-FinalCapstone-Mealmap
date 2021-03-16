package com.techelevator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.MealDAO;

@CrossOrigin
@RestController
//@RequestMapping("/mealPlanDetail") // confirm path
@PreAuthorize("isAuthenticated()")
public class MealController
{
//	@Autowired
//	private MealDAO mealDAO;
	
//	public MealController(MealDAO mealDAO)
//	{
//		this.mealDAO = mealDAO;
//	}
	
	// CRUD API calls go here
	
}
