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
		
		// !!! still need to get SQL statement for GET request !!!
		String sql = "";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next())
		{
			Recipe recipe = mapRowToRecipe(results);
			recipes.add(recipe);
		}
		return recipes;
	}
	
	private Recipe mapRowToRecipe(SqlRowSet rowSet)
	{
		Recipe recipe = new Recipe();
		
		// still need to set up 
		
		return recipe;
	}
	
}
