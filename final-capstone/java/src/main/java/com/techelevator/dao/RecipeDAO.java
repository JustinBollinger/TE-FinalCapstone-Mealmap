package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Recipe;

public interface RecipeDAO
{
	List<Recipe> getAll();
	Recipe getById(int id);
	Recipe create(Recipe recipe);
//	void updateDirections(int recipeId, String directions);
//	void updateCookingTime(int recipeId, int cooking_time);
	
}
