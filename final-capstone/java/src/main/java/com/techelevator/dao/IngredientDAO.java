package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Ingredient;

public interface IngredientDAO
{
	List<Ingredient> getAll();
	Ingredient getById(int id);
	Ingredient create(Ingredient ingredient);
}
