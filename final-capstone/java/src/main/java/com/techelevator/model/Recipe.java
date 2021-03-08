package com.techelevator.model;

public class Recipe
{
	private int id;
	private String recipeName;
	private String directions;
	private int servingSize;
	private int recipeCategoryId;
	private int dietRestrictId;
	
	public Recipe()
	{
		
	}
	
	public Recipe(int id, String recipeName, String directions, int servingSize, int categoryId, int restrictionId)
	{
		this.id = id;
		this.recipeName = recipeName;
		this.directions = directions;
		this.servingSize = servingSize;
		this.recipeCategoryId = categoryId;
		this.dietRestrictId = restrictionId;
	}
	
	
}
