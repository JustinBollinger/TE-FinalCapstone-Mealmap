package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.MealPlan;

public interface MealPlanDAO
{
	List<MealPlan> getAll();
	MealPlan getById(int mealPlanId);
	MealPlan add(MealPlan mealPlan);
}