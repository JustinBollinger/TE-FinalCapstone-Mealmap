package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.model.MealPlan;
import com.techelevator.model.Recipe;

@Service
public class MealPlanSqlDAO implements MealPlanDAO
{
	private JdbcTemplate jdbcTemplate;
	
	public MealPlanSqlDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// no JOIN
	public List<MealPlan> getAll()
	{
		List<MealPlan> mealPlans = new ArrayList<>();
		
		String sql = "SELECT user_id" + 
				", meal_plan_id" + 
				", meal_plan_name" + 
				", start_date" + 
				" FROM meal_plan" + 
				" ORDER BY start_date;";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next())
		{
			MealPlan mealPlan = mapRowToMealPlan(results);
			mealPlans.add(mealPlan);
		}
		
		return mealPlans;
	}
	
	// need a JOIN between meal_plan_recipes AND recipes
	// WHERE meal_plan_id = ?;
	public MealPlan getById(int mealPlanId)
	{
		String sql = "SELECT user_id" +
					", meal_plan_id" +
					", meal_plan_name" +
					", start_date" +
					" FROM meal_plan" +
					" WHERE meal_plan_id = ?;";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, mealPlanId);
		if(results.next())
		{
			return mapRowToMealPlan(results);
		}
		
		return null;		
	}
	
	public MealPlan add(MealPlan newMealPlan)
	{
		String sql = "INSERT INTO meal_plan" + 
					"(" + 
					"user_id" + 
					", meal_plan_name" + 
					", start_date" +
					")" + 
					" VALUES" + 
					"(?, ?, ?) " +
					" RETURNING meal_plan_id;";
		
		Integer id = jdbcTemplate.queryForObject(sql, Integer.class,
												newMealPlan.getUserId(),
												newMealPlan.getMealPlanName(),
												newMealPlan.getStartDate());
		return getById(id);
	}
	
	
	private MealPlan mapRowToMealPlan(SqlRowSet rowSet)
	{
		MealPlan mealPlan = new MealPlan();
		mealPlan.setUserId(rowSet.getInt("user_id"));
		mealPlan.setMealPlanId(rowSet.getInt("meal_plan_id"));
		mealPlan.setMealPlanName(rowSet.getString("meal_plan_name"));
		mealPlan.setStartDate(rowSet.getDate("start_date").toLocalDate());
		return mealPlan;
	}
	
//	private Recipe mapRowToRecipe(SqlRowSet rowSet)
//	{
//		Recipe recipe = new Recipe();
//		recipe.setUserId(rowSet.getInt("user_id"));
//		recipe.setRecipeId(rowSet.getInt("recipe_id"));
//		recipe.setRecipeName(rowSet.getString("recipe_name"));
//		recipe.setDirections(rowSet.getString("directions"));
//		recipe.setNumberOfServings(rowSet.getInt("number_of_servings"));
////		recipe.setRecipeCategoryId(rowSet.getInt("recipe_category_id"));
////		recipe.setRestrictionId(rowSet.getInt("dietary_restriction_id"));
//		recipe.setCookingTime(rowSet.getInt("cooking_time"));
//		recipe.setDifficulty(rowSet.getString("difficulty"));
//		return recipe;
//	}
	
	
}
