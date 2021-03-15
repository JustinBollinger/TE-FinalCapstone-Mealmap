package com.techelevator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.MealPlanDAO;

@CrossOrigin
@RestController
//@RequestMapping("/")
@PreAuthorize("isAuthenticated()")
public class MealPlanController
{
	@Autowired
	private MealPlanDAO mealPlanDAO;
	
	public MealPlanController(MealPlanDAO mealPlanDAO)
	{
		this.mealPlanDAO = mealPlanDAO;
	}
	
	// methods go below

}
