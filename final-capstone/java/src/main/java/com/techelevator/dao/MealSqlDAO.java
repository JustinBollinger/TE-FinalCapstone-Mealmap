package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.model.Meal;

@Service
public class MealSqlDAO implements MealDAO
{
	private JdbcTemplate jdbcTemplate;
	
	public MealSqlDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Meal> getAll()
	{
		List<Meal> meals = new ArrayList<>();
		
		String sql = "";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next())
		{
			Meal meal = mapRowToMeal(results);
			meals.add(meal);
		}
		return meals;
	}
	
	
	public Meal getById(int mealId)
	{
		String sql = "SELECT meal_plan_id" + 
					", meal_id" + 
					", recipe_id" + 
					", recipe_name" + 
					", meal_category" + 
					", day_of_week" + 
					" FROM meal_recipes" + 
					" WHERE meal_id = ?;";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, mealId);
		if(results.next())
		{
			return mapRowToMeal(results);
		}
		
		return null;
	}
	
//	public Meal add(Meal newMeal)
//	{
//		
//		
//	}
	
	private Meal mapRowToMeal(SqlRowSet rowSet)
	{
		Meal meal = new Meal();
		meal.setMealPlanId(rowSet.getInt("meal_plan_id"));
		meal.setMealId(rowSet.getInt("meal_id"));
		meal.setRecipeId(rowSet.getInt("recipe_id"));
		meal.setRecipeName(rowSet.getString("recipe_name"));
		meal.setMealCategory(rowSet.getString("meal_category"));
		meal.setDayOfWeek(rowSet.getString("day_of_week"));
		return meal;
	}

}
