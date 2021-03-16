package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MealSqlDAO
{
	private JdbcTemplate jdbcTemplate;
	
	public MealSqlDAO(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// SQL statement API functions go here
	
	
}
