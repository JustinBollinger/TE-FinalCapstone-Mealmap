package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

}
