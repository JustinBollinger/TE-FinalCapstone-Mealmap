SELECT *
FROM users;

SELECT *
FROM recipes;

SELECT *
FROM ingredients;

SELECT *
FROM recipes_ingredients;

SELECT *
FROM meal_plan;

SELECT *
FROM meal_plan_recipes;


DELETE FROM ingredients
WHERE ingredient_id >= 43;