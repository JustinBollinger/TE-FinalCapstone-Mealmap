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

import com.techelevator.dao.MealPlanDAO;
import com.techelevator.model.MealPlan;

@CrossOrigin
@RestController
@RequestMapping("/mealPlan")
@PreAuthorize("isAuthenticated()")
public class MealPlanController
{
	@Autowired
	private MealPlanDAO mealPlanDAO;
	
	public MealPlanController(MealPlanDAO mealPlanDAO)
	{
		this.mealPlanDAO = mealPlanDAO;
	}
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<MealPlan> listMealPlans()
	{
		List<MealPlan> mealPlans = mealPlanDAO.getAll();
		return mealPlans;
	}
	
	// path is currently not established.
	// may need to change later
	@RequestMapping(path = "/mealPlanDetail/{meal_plan_id}", method = RequestMethod.GET)
	public MealPlan getMealPlanById(@PathVariable int meal_plan_id)
	{
		return mealPlanDAO.getById(meal_plan_id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "", method = RequestMethod.POST)
	public MealPlan createMealPlan(@RequestBody MealPlan mealPlan)
	{
		return mealPlanDAO.create(mealPlan);
	}
	
	
}
