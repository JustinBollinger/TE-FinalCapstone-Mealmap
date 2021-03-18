BEGIN TRANSACTION;

-- drop tables
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS recipes;
DROP TABLE IF EXISTS ingredients;
DROP TABLE IF EXISTS recipes_ingredients;
DROP TABLE IF EXISTS meal_plan;
DROP TABLE IF EXISTS meal_plan_recipes;



-- drop sequences
DROP SEQUENCE IF EXISTS seq_user_id;
DROP SEQUENCE IF EXISTS seq_ingredient_id;
DROP SEQUENCE IF EXISTS seq_recipe_id;
DROP SEQUENCE IF EXISTS seq_meal_plan_id;



--create sequences manually - so that you can set the value after inserting seed data
CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

  CREATE SEQUENCE seq_ingredient_id
  START 1
  INCREMENT BY 1;

  CREATE SEQUENCE seq_recipe_id
  START 1
  INCREMENT BY 1;
  
  CREATE SEQUENCE seq_meal_plan_id
  START 1
  INCREMENT BY 1;
  

  
-- create tables
CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id') NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE recipes
(	
	user_id INT NOT NULL,
	recipe_id int DEFAULT nextval('seq_recipe_id') NOT NULL PRIMARY KEY,
	recipe_name varchar(200) NOT NULL,
	directions TEXT NOT NULL,
	number_of_servings INT NOT NULL,
	recipe_category_id INT,
	dietary_restriction_id INT,
	cooking_time INT,
	difficulty VARCHAR(50)

);

CREATE TABLE ingredients
(
	ingredient_id int DEFAULT nextval('seq_ingredient_id') NOT NULL PRIMARY KEY,
	ingredient_name varchar(50) NOT NULL,
	category_id INT
);

CREATE TABLE recipes_ingredients
(
	recipe_id INT,
	ingredient_id INT,
	measurement_unit VARCHAR(100),
	measurement_quantity INT
);

CREATE TABLE meal_plan
(
	user_id INT,
	meal_plan_id INT DEFAULT nextval ('seq_meal_plan_id') NOT NULL PRIMARY KEY,
	meal_plan_name VARCHAR(100),
	start_date date
);

CREATE TABLE meal_plan_recipes
(
	meal_plan_id INT,
	recipe_id INT,
	meal_category VARCHAR(50),
	day_of_week VARCHAR(50),
	meal_date DATE
);


-- create foreign key constraints

ALTER TABLE recipes_ingredients
ADD CONSTRAINT fk_recipe_id
FOREIGN KEY (recipe_id)
REFERENCES recipes (recipe_id);

ALTER TABLE recipes_ingredients
ADD CONSTRAINT fk_ingredient_id
FOREIGN KEY (ingredient_id)
REFERENCES ingredients(ingredient_id);

ALTER TABLE recipes
ADD CONSTRAINT fk_user_id
FOREIGN KEY (user_id)
REFERENCES users (user_id);

ALTER TABLE meal_plan
ADD CONSTRAINT fk_user_id
FOREIGN KEY (user_id)
REFERENCES users (user_id);

ALTER TABLE meal_plan_recipes
ADD CONSTRAINT fk_meal_plan_id
FOREIGN KEY (meal_plan_id)
REFERENCES meal_plan (meal_plan_id);

ALTER TABLE meal_plan_recipes
ADD CONSTRAINT fk_recipe_id
FOREIGN KEY (recipe_id)
REFERENCES recipes (recipe_id);


COMMIT TRANSACTION;
