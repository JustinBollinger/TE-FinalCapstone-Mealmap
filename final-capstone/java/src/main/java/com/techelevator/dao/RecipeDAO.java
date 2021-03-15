package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Recipe;

public interface RecipeDAO
{
	List<Recipe> getAll();
	Recipe getById(int id);
	Recipe create(Recipe recipe);
	void update(Recipe recipe, int recipeId);
	void delete(int recipeId);
}
