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

import com.techelevator.dao.IngredientDAO;
import com.techelevator.model.Ingredient;

@CrossOrigin
@RestController
@RequestMapping("/ingredientList")
@PreAuthorize("isAuthenticated()")
public class IngredientController
{
	@Autowired
	private IngredientDAO ingredientDAO;
	
	public IngredientController(IngredientDAO ingredientDAO)
	{
		this.ingredientDAO = ingredientDAO;
	}
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<Ingredient> listRecipes()
	{
		List<Ingredient> ingredients = ingredientDAO.getAll();
		return ingredients;
	}
	
	@RequestMapping(path = "/{ingredient_id}", method = RequestMethod.GET)
	public Ingredient getIngredientById(@PathVariable int ingredient_id)
	{
		return ingredientDAO.getById(ingredient_id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "", method = RequestMethod.POST)
	public Ingredient createIngredient(@RequestBody Ingredient ingredient)
	{
		return ingredientDAO.create(ingredient);
	}
}
