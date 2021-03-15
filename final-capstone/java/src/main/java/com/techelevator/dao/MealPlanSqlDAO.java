package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.model.MealPlan;

@Service
public class MealPlanSqlDAO implements MealPlanDAO
{
	private JdbcTemplate jdbcTemplate;
	
	public MealPlanSqlDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// jdbc CRUD ops go here
	
	
	private MealPlan mapRowToMealPlan(SqlRowSet rowSet)
	{
		MealPlan mealPlan = new MealPlan();
		mealPlan.setUserId(rowSet.getInt("user_id"));
		mealPlan.setMealPlanId(rowSet.getInt("meal_plan_id"));
		mealPlan.setMealPlanName(rowSet.getString("meal_plan_name"));
		mealPlan.setStartDate(rowSet.getDate("start_date").toLocalDate());
		mealPlan.setEndDate(rowSet.getDate("end_date").toLocalDate());
		return mealPlan;
	}
}
