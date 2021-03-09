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
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
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
	
	public int getServingSize()
	{
		return servingSize;
	}
	
	public void setServingSize(int servingSize)
	{
		this.servingSize = servingSize;
	}
	
//	public int getRecipeCategoryId()
//	{
//		return recipeCategoryId;
//	}
//	
//	public void setRecipeCategoryId(int recipeCategoryId)
//	{
//		this.recipeCategoryId = recipeCategoryId;
//	}
//	
//	public int getRestrictionId()
//	{
//		return dietRestrictId;
//	}
//	
//	public void setRestrictionId(int dietRestrictId)
//	{
//		this.dietRestrictId = dietRestrictId;
//	}
	
	@Override
	public String toString()
	{
		return "Recipe{" +
						"id = " + id +
						", recipeName = " + recipeName +
						", directions = " + directions +
						", servingSize = " + servingSize +
//						", recipeCategoryId = " + recipeCategoryId +
//						", dietRestrictId = " + dietRestrictId +
						"}";
	}
	
}
