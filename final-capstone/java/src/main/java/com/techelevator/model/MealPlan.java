package com.techelevator.model;

import java.time.LocalDate;

public class MealPlan
{
	private int userId;
	private int mealPlanId;
	private String mealPlanName;
	private LocalDate startDate;
	
	public MealPlan()
	{
		
	}
	
	public MealPlan(int userId, int mealPlanId, String mealPlanName, LocalDate startDate)
	{
		this.userId = userId;
		this.mealPlanId = mealPlanId;
		this.mealPlanName = mealPlanName;
		this.startDate = startDate;
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
	

	@Override
	public String toString()
	{
		return "Meal Plan{" +
				"userId = " + userId +
				"mealPlanId = " + mealPlanId +
				"mealPlanName = " + mealPlanName +
				"startDate = " + startDate +
				"}";
	}
	
	
	
	
}
