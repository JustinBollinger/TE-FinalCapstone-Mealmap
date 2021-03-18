package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.techelevator.dao.MealDAO;
import com.techelevator.model.Meal;

@CrossOrigin
@RestController
@RequestMapping("/mealDetail") // confirm path
@PreAuthorize("isAuthenticated()")
public class MealController
{
	@Autowired
	private MealDAO mealDAO;

	public MealController(MealDAO mealDAO)
	{
		this.mealDAO = mealDAO;
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public List<Meal> listMeals()
	{
		List<Meal> meals = mealDAO.getAll();
		return meals;
	}

	// change path later
	@RequestMapping(path = "/{mealPlanId}", method = RequestMethod.GET)
	public List<Meal> getMealsById(@PathVariable int mealPlanId)
	{
		return mealDAO.getById(mealPlanId);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Meal addMealToPlan(@RequestBody Meal meal)
	{
		return mealDAO.add(meal);
	}

}
