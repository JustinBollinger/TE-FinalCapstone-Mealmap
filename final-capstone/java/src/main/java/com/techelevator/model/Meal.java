package com.techelevator.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Meal
{
	private int mealPlanId;
	private int recipeId;
	private List<Recipe> recipes;
	private String mealCategory;
	private String dayOfWeek;
	private LocalDate mealDate;
	
	public Meal()
	{
		this.recipes = new ArrayList<>();
	}
	
	public Meal(int mealplanId, int recipeId, List<Recipe> recipes, String mealCategory, String dayOfWeek, LocalDate mealDate)
	{
		this.mealPlanId = mealplanId;
		this.recipeId = recipeId;
		this.recipes = recipes;
		this.mealCategory = mealCategory;
		this.dayOfWeek = dayOfWeek;
		this.mealDate = mealDate;
	}
	
	public int getMealPlanId()
	{
		return mealPlanId;
	}
	
	public void setMealPlanId(int mealPlanId)
	{
		this.mealPlanId = mealPlanId;
	}

	public int getRecipeId()
	{
		return recipeId;
	}
	
	public void setRecipeId(int recipeId)
	{
		this.recipeId = recipeId;
	}
	
	public List<Recipe> getRecipes()
	{
		return recipes;
	}
	
	public void setRecipes(List<Recipe> recipes)
	{
		this.recipes = recipes;
	}
	
	public String getMealCategory()
	{
		return mealCategory;
	}
	
	public void setMealCategory(String mealCategory)
	{
		this.mealCategory = mealCategory;
	}
	
	public String getDayOfWeek()
	{
		return dayOfWeek;
	}
	
	public void setDayOfWeek(String dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}

	public LocalDate getMealDate()
	{
		return mealDate;
	}

	public void setMealDate(LocalDate mealDate)
	{
		this.mealDate = mealDate;
	}

	@Override
	public String toString()
	{
		return "Meal{" +
				"mealPlanId = " + mealPlanId +
				"recipeId" + recipeId +
				"recipes" + recipes +
				"mealCategory" + mealCategory +
				"dayOfWeek" + dayOfWeek +
				"}";
	}
	
	
}
