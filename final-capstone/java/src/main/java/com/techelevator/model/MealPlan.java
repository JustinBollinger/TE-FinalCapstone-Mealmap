package com.techelevator.model;

import java.time.LocalDate;

public class MealPlan
{
	private int userId;
	private int mealPlanId;
	private String mealPlanName;
	private LocalDate startDate;
	private int recipeId;
	private String recipeName;
	private String mealCategory;
	private String dayOfWeek;
	
	public MealPlan()
	{
		
	}
	
	public MealPlan(int userId, int mealPlanId, String mealPlanName, LocalDate startDate, int recipeId, String recipeName, String mealCategory, String dayOfWeek)
	{
		this.userId = userId;
		this.mealPlanId = mealPlanId;
		this.mealPlanName = mealPlanName;
		this.startDate = startDate;
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.mealCategory = mealCategory;
		this.dayOfWeek = dayOfWeek;
	}
	
	public int getUserId()
	{
		return userId;
	}
	
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	
	
	public int getMealPlanId()
	{
		return mealPlanId;
	}
	
	public void setMealPlanId(int mealPlanId)
	{
		this.mealPlanId = mealPlanId;
	}	
	public String getMealPlanName()
	{
		return mealPlanName;
	}
	
	public void setMealPlanName(String mealPlanName)
	{
		this.mealPlanName = mealPlanName;
	}	
	public LocalDate getStartDate()
	{
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate)
	{
		this.startDate = startDate;
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

	@Override
	public String toString()
	{
		return "Meal Plan{" +
				"userId = " + userId +
				"mealPlanId = " + mealPlanId +
				"mealPlanName = " + mealPlanName +
				"startDate = " + startDate +
				"recipeId = " + recipeId +
				"recipeName = " + recipeName +
				"mealCategory = " + mealCategory +
				"dayOfWeek = " + dayOfWeek +
				"}";
	}
	
	
	
	
}
