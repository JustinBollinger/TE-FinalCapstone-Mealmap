package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.MealDAO;
import com.techelevator.model.Meal;

@CrossOrigin
@RestController
//@RequestMapping("/mealPlanDetail") // confirm path
@PreAuthorize("isAuthenticated()")
public class MealController
{
	@Autowired
	private MealDAO mealDAO;
	
	public MealController(MealDAO mealDAO)
	{
		this.mealDAO = mealDAO;
	}
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<Meal> listMeals()
	{
		List<Meal> meals = mealDAO.getAll();
		return meals;
	}
	
	// change path later
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public Meal getMealById(@PathVariable int meal_id)
	{
		return mealDAO.getById(meal_id);
	}
	
}
