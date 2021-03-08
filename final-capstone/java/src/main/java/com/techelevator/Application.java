package com.techelevator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
	
	private static final String API_BASE_URL = "http://localhost:8080/";
	
	private static final String LOGIN_MENU_OPTION_LOGIN = "Login";
	private static final String LOGIN_MENU_OPTION_REGISTER = "Register";
	private static final String MENU_OPTION_EXIT = "Exit";
	private static final String[] LOGIN_MENU_OPTIONS = {LOGIN_MENU_OPTION_LOGIN, 
														LOGIN_MENU_OPTION_REGISTER,
														MENU_OPTION_EXIT};

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	public void run()
	{
		System.out.println("***** Hi *******");
	}
	
}
