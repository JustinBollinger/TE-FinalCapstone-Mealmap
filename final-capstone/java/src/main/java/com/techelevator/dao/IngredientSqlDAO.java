package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class IngredientSqlDAO implements IngredientDAO
{
	private JdbcTemplate jdbcTemplate;
	
	public IngredientSqlDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// SQL query functions go here
	
	
	
}
