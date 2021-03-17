package com.techelevator.model;

public class Ingredient
{
	private int ingredientId;
	private String ingredientName;
	private int categoryId;
	
	public Ingredient()
	{
		
	}
	
	public Ingredient(int ingredientId, String ingredientName, int categoryId)
	{
		this.ingredientId = ingredientId;
		this.ingredientName = ingredientName;
		this.categoryId = categoryId;
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
							"ingredientId = " + ingredientId +
							"ingredientName = " + ingredientName +
							" categoryId = " + categoryId +
							"}";
	}
	
}
