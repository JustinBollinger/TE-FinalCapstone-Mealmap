package com.techelevator.model;

import java.time.LocalDate;

public class MealPlan
{
	private int userId;
	private int mealPlanId;
	private String mealPlanName;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public MealPlan()
	{
		
	}
	
	public MealPlan(int userId, int mealPlanId, String mealPlanName, LocalDate startDate, LocalDate endDate)
	{
		this.userId = userId;
		this.mealPlanId = mealPlanId;
		this.mealPlanName = mealPlanName;
		this.startDate = startDate;
		this.endDate = endDate;
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
	public LocalDate getEndDate()
	{
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate)
	{
		this.endDate = endDate;
	}
	
	@Override
	public String toString()
	{
		return "Meal Plan{" +
				"userId = " + userId +
				"mealPlanId = " + mealPlanId +
				"mealPlanName = " + mealPlanName +
				"startDate = " + startDate +
				"endDate = " + endDate +
				"}";
	}
	
	
	
	
}
