BEGIN TRANSACTION;

-- drop tables
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS recipes;
DROP TABLE IF EXISTS ingredients;
DROP TABLE IF EXISTS measurement_unit;
DROP TABLE IF EXISTS measurement_quantity;

-- drop sequences
DROP SEQUENCE IF EXISTS seq_user_id;

--create sequences manually - so that you can set the value after inserting seed data
CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


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
	recipe_id INT NOT NULL PRIMARY KEY,
	recipe_name varchar(100) NOT NULL,
	directions varchar(500) NOT NULL,
	serving_size INT NOT NULL,
	recipe_category_id INT,
	dietary_restriction_id INT

);

CREATE TABLE ingredients
(
	recipe_id INT NOT NULL,
	ingredient_id INT NOT NULL,
	ingredient_name varchar(50) NOT NULL,
	category_id INT,
	measurement_unit_id INT,
	measurement_quantity_id INT
);

CREATE TABLE measurement_unit
(
	measurement_unit_id INT NOT NULL PRIMARY KEY,
	measurement_description VARCHAR(100) NOT NULL
);

CREATE TABLE measurement_quantity
(
	measurement_quantity_id INT NOT NULL PRIMARY KEY,
	measurement_amount INT NOT NULL
);

-- create foreign key constraints

ALTER TABLE ingredients
ADD CONSTRAINT fk_recipe_id
FOREIGN KEY (recipe_id)
REFERENCES recipes (recipe_id);

ALTER TABLE ingredients
ADD CONSTRAINT fk_measurement_unit_id
FOREIGN KEY (measurement_unit_id)
REFERENCES measurement_unit(measurement_unit_id);

ALTER TABLE ingredients
ADD CONSTRAINT fk_measurement_quantity_id
FOREIGN KEY (measurement_quantity_id)
REFERENCES measurement_quantity(measurement_quantity_id);







COMMIT TRANSACTION;
