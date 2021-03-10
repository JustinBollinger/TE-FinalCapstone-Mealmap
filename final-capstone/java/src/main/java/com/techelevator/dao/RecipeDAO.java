package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Recipe;

public interface RecipeDAO
{
	List<Recipe> getAll();
	
	Recipe create(Recipe recipe);

}
