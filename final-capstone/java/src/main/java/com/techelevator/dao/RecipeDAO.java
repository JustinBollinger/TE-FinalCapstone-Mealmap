package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Recipe;

public interface RecipeDAO
{
	List<Recipe> getAll();
	Recipe getById(int id);
	Recipe create(Recipe recipe);
//	void update(String recipeName, int numberOfServings, int cookingTime, String difficulty, String directions);
	void delete(int recipeId);
}
