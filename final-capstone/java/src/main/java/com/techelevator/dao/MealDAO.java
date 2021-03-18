package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Meal;

public interface MealDAO
{
	List<Meal> getAll();
    List<Meal> getById(int mealPlanId);
	Meal add(Meal meal);
}
