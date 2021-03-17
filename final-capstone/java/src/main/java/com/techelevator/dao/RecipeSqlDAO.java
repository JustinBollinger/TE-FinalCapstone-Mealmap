package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.model.Recipe;

@Service
public class RecipeSqlDAO implements RecipeDAO
{
	
	private JdbcTemplate jdbcTemplate;
	
	public RecipeSqlDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Recipe> getAll()
	{
		List<Recipe> recipes = new ArrayList<>();
		
		String sql = "SELECT user_id" + 
				", recipe_id" + 
				", recipe_name" + 
				", directions" + 
				", number_of_servings" + 
//				", recipe_category_id" + 
//				", dietary_restriction_id" + 
				", cooking_time" + 
				", difficulty" + 
				" FROM recipes" + 
				" ORDER BY recipe_name;";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next())
		{
			Recipe recipe = mapRowToRecipe(results);
			recipes.add(recipe);
		}
		return recipes;
	}
	
	public Recipe getById(int id)
	{
		String sql = "SELECT user_id" + 
				", recipe_id" + 
				", recipe_name" + 
				", directions" + 
				", number_of_servings" + 
				", cooking_time" + 
				", difficulty" + 
				" FROM recipes" + 
				" WHERE recipe_id = ?;";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		if (results.next())
		{
			return mapRowToRecipe(results);
		}
		return null;
	}
	
	public Recipe create(Recipe newRecipe)
	{		
		String sql = "INSERT INTO recipes" + 
					"(" +
					"user_id" +
					", recipe_name" + 
					", directions" + 
					", number_of_servings" + 
					", cooking_time" + 
					", difficulty" + 
					")" + 
					" VALUES" + 
					"(?, ?, ?, ?, ?, ?) " +
					"RETURNING recipe_id;";
		
		Integer id = jdbcTemplate.queryForObject(sql, Integer.class,
												newRecipe.getUserId(),
												newRecipe.getRecipeName(),
												newRecipe.getDirections(),
												newRecipe.getNumberOfServings(),
												newRecipe.getCookingTime(),
												newRecipe.getDifficulty());
		return getById(id);
	}
	
	
	public void update(Recipe recipe, int recipeId)
	{	
		String sql = "UPDATE recipes" + 
					" SET recipe_name = ?" + 
					", number_of_servings = ?" + 
					", cooking_time = ?" + 
					", difficulty = ?" + 
					", directions = ?" + 
					" WHERE recipe_id = ?;";
		
		jdbcTemplate.update(sql, recipe.getRecipeName(),
								recipe.getNumberOfServings(),
								recipe.getCookingTime(),
								recipe.getDifficulty(),
								recipe.getDirections(),
								recipeId);
	}
	
	public void delete(int recipeId)
	{
		String sql = "DELETE FROM recipes_ingredients" + 
				" WHERE recipe_id = ?;" + 
				" " + 
				"DELETE FROM recipes" + 
				" WHERE recipe_id = ?;";
		
		jdbcTemplate.update(sql, recipeId, recipeId);
	}

	
	
	
	private Recipe mapRowToRecipe(SqlRowSet rowSet)
	{
		Recipe recipe = new Recipe();
		recipe.setUserId(rowSet.getInt("user_id"));
		recipe.setRecipeId(rowSet.getInt("recipe_id"));
		recipe.setRecipeName(rowSet.getString("recipe_name"));
		recipe.setDirections(rowSet.getString("directions"));
		recipe.setNumberOfServings(rowSet.getInt("number_of_servings"));
//		recipe.setRecipeCategoryId(rowSet.getInt("recipe_category_id"));
//		recipe.setRestrictionId(rowSet.getInt("dietary_restriction_id"));
		recipe.setCookingTime(rowSet.getInt("cooking_time"));
		recipe.setDifficulty(rowSet.getString("difficulty"));
		return recipe;
	}
	
}
