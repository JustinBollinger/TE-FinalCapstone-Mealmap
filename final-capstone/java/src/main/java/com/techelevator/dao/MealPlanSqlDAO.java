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
		// setter mapping goes here
		
		
		
	}
}
