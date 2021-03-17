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

import com.techelevator.dao.RecipeDAO;
import com.techelevator.model.Recipe;

@CrossOrigin
@RestController
@RequestMapping("/recipeList")
@PreAuthorize("isAuthenticated()")
public class RecipeController
{
	@Autowired
	private RecipeDAO recipeDAO;
	
	public RecipeController(RecipeDAO recipeDAO)
	{
		this.recipeDAO = recipeDAO;
	}
	
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List <Recipe> listRecipes()
	{
		List <Recipe> recipes = recipeDAO.getAll();
		return recipes;
	}
	
	@RequestMapping(path = "/recipeDetail/{recipe_id}", method = RequestMethod.GET)
	public Recipe getRecipeById(@PathVariable int recipe_id)
	{
		return recipeDAO.getById(recipe_id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Recipe createRecipe(@RequestBody Recipe recipe)
	{
		return recipeDAO.create(recipe);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "/recipeDetail/{recipe_id}", method = RequestMethod.PUT)
	public void updateRecipe(@RequestBody Recipe recipe, @PathVariable int recipe_id)
	{
		recipeDAO.update(recipe, recipe_id);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(path = "/recipeDetail/{recipe_id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int recipe_id)
	{
		recipeDAO.delete(recipe_id);
	}
	
}
