package com.techelevator.model;

public class Ingredient
{
	private int recipeId;
	private int ingredientId;
	private String ingredientName;
	private int categoryId;
	
	public Ingredient()
	{
		
	}
	
	public Ingredient(int recipeId, int ingredientId, String ingredientName, int categoryId)
	{
		this.recipeId = recipeId;
		this.ingredientId = ingredientId;
		this.ingredientName = ingredientName;
		this.categoryId = categoryId;
	} 
	
	public int getrecipeId() 
	{
		return recipeId;
	}
	
	public void setRecipeId(int recipeId)
	{
		this.recipeId = recipeId;
	}
	
	public int getIngredientId()
	{
		return ingredientId;
	}
	
	public void setIngredientId(int ingredientId)
	{
		this.ingredientId = ingredientId;
	}
	
	public String getIngredientName()
	{
		return ingredientName;
	}
	
	public void setIngredientName(String ingredientName)
	{
		this.ingredientName = ingredientName;
	}
	
	public int getCategoryId()
	{
		return categoryId;
	}
	
	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}
	
	@Override
	public String toString()
	{
		return "Ingredient{" +
							"recipeId = " + recipeId +
							"ingredientId = " + ingredientId +
							"ingredientName = " + ingredientName +
							" categoryId = " + categoryId +
							"}";
	}
	
}
