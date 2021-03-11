package com.techelevator.model;

public class Recipe
{
	private int userId;
	private int recipeId;
	private String recipeName;
	private String directions;
	private int numberOfServings;
	private int recipeCategoryId;
	private int dietRestrictId;
	private int cookingTime;
	private String difficulty;
	
	public Recipe()
	{
		
	}
	
	public Recipe(int userId, int recipeId, String recipeName, String directions, int numServings, int categoryId, int restrictionId, int cookingTime, String difficulty)
	{
		this.userId = userId;
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.directions = directions;
		this.numberOfServings = numServings;
		this.recipeCategoryId = categoryId;
		this.dietRestrictId = restrictionId;
		this.cookingTime = cookingTime;
		this.difficulty = difficulty;
	}
	
	public int getUserId()
	{
		return userId;
	}
	
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	
	public int getRecipeId()
	{
		return recipeId;
	}
	
	public void setRecipeId(int recipeId)
	{
		this.recipeId = recipeId;
	}
	
	public String getRecipeName()
	{
		return recipeName;
	}
	
	public void setRecipeName(String recipeName)
	{
		this.recipeName = recipeName;
	}
	
	public String getDirections()
	{
		return directions;
	}
	
	public void setDirections(String directions)
	{
		this.directions = directions;
	}
	
	public int getNumberOfServings()
	{
		return numberOfServings;
	}
	
	public void setNumberOfServings(int numServings)
	{
		this.numberOfServings = numServings;
	}
	
	public int getRecipeCategoryId()
	{
		return recipeCategoryId;
	}
	
	public void setRecipeCategoryId(int recipeCategoryId)
	{
		this.recipeCategoryId = recipeCategoryId;
	}
	
	public int getRestrictionId()
	{
		return dietRestrictId;
	}
	
	public void setRestrictionId(int dietRestrictId)
	{
		this.dietRestrictId = dietRestrictId;
	}
	
	public int getCookingTime()
	{
		return cookingTime;
	}
	
	public void setCookingTime(int cookingTime)
	{
		this.cookingTime = cookingTime;
	}
	
	public String getDifficulty()
	{
		return difficulty;
	}
	
	public void setDifficulty(String difficulty)
	{
		this.difficulty = difficulty;
	}
	
	@Override
	public String toString()
	{
		return "Recipe{" +
						"userId = " + userId +
						", recipeId = " + recipeId +
						", recipeName = " + recipeName +
						", directions = " + directions +
						", number_of_servings = " + numberOfServings +
						", recipeCategoryId = " + recipeCategoryId +
						", dietRestrictId = " + dietRestrictId +
						", cookingTime = " + cookingTime +
						", difficulty = " + difficulty +
						"}";
	}
	
}
