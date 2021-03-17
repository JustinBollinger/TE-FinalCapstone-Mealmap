package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<MealPlan> getAll()
	{
		List<MealPlan> mealPlans = new ArrayList<>();
		
		String sql = "SELECT user_id" + 
					", meal_plan_id" + 
					", meal_plan_name" + 
					", start_date" + 
					", end_date" + 
					" FROM meal_plan;";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next())
		{
			MealPlan mealPlan = mapRowToMealPlan(results);
			mealPlans.add(mealPlan);
		}
		
		return mealPlans;
	}
	
	public MealPlan getById(int mealPlanId)
	{
		String sql = "SELECT meal_plan_id" + 
					", meal_id" + 
					", recipe_id" + 
					", recipe_name" + 
					", meal_category" + 
					", day_of_week" + 
					" FROM meal_recipes" + 
					" WHERE meal_id = ?;";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, mealPlanId);
		if(results.next())
		{
			return mapRowToMealPlan(results);
		}
		
		return null;
	}
	
	public MealPlan create(MealPlan newMealPlan)
	{
		String sql = "INSERT INTO meal_plan" + 
					"(" + 
					"user_id" + 
					", meal_plan_name" + 
					", start_date" + 
					", end_date" + 
					")" + 
					" VALUES (?, ?, ?, ?)" + 
					" RETURNING meal_plan_id;";
		
		Integer id = jdbcTemplate.queryForObject(sql, Integer.class,
												newMealPlan.getUserId(),
												newMealPlan.getMealPlanName(),
												newMealPlan.getStartDate(),
												newMealPlan.getEndDate());
		return getById(id);
	}
	
	
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
