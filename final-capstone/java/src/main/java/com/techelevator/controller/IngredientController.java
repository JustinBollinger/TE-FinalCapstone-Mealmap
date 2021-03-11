package com.techelevator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.IngredientDAO;

@CrossOrigin
@RestController
@PreAuthorize("isAuthenticated()")
public class IngredientController
{

	@Autowired
	private IngredientDAO ingredientDAO;
	
	public IngredientController(IngredientDAO ingredientDAO)
	{
		this.ingredientDAO = ingredientDAO;
	}
	
	// API call functions go below
	
	
}
