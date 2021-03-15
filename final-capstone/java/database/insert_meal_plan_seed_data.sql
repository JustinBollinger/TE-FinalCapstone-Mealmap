INSERT INTO meal_plan
(
    	user_id
	, meal_plan_id
	, meal_plan_name
	, start_date
	, end_date
)
VALUES
(
    1
    , nextval ('seq_meal_plan_id')
    , 'March Meal Plan'
    , '2021-03-14'
    , '2021-03-20'
);

INSERT INTO meal_recipes
(
    	meal_plan_id
	, meal_id
	, recipe_id
	, recipe_name
	, meal_category
	, day_of_week
)
VALUES
(
    1
    , nextval('seq_meal_id')
    , 2
    , 'Green Beans with  Garlic'
    , 'Dinner'
    , 'Wednesday'
),

(
        1
    , nextval('seq_meal_id')
    , 3
    , 'BLT Sandwich'
    , 'Dinner'
    , 'Wednesday'
);
