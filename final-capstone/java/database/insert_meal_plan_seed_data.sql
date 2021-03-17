INSERT INTO meal_plan
(
    user_id
	, meal_plan_id
	, meal_plan_name
	, start_date
)
VALUES
(
    1
    , nextval ('seq_meal_plan_id')
    , 'March Meal Plan'
    , '2021-03-14'
);

INSERT INTO meal_plan_recipes
(
	meal_plan_id
	, recipe_id
	, meal_category
	, day_of_week
)
VALUES
(
    1
    , 4
    , 'Breakfast'
    , 'Sunday'
),

(
    1
    , 5
    , 'Breakfast'
    , 'Monday'
),

(
    1
    , 6
    , 'Breakfast'
    , 'Tuesday'
),

(
    1
    , 7
    , 'Breakfast'
    , 'Wednesday'
),

(
    1
    , 4
    , 'Breakfast'
    , 'Thursday'
),

(
    1
    , 5
    , 'Breakfast'
    , 'Friday'
),

(
    1
    , 6
    , 'Breakfast'
    , 'Saturday'
),

(
    1
    , 15
    , 'Lunch'
    , 'Sunday'
),

(
    1
    , 16
    , 'Lunch'
    , 'Monday'
),

(
    1
    , 17
    , 'Lunch'
    , 'Tuesday'
),

(
    1
    , 24
    , 'Lunch'
    , 'Tuesday'
),

(
    1
    , 21
    , 'Lunch'
    , 'Wednesday'
),

(
    1
    , 22
    , 'Lunch'
    , 'Wednesday'
),


(
    1
    , 19
    , 'Lunch'
    , 'Thursday'
),

(
    1
    , 20
    , 'Lunch'
    , 'Friday'
),

(
    1
    , 18
    , 'Lunch'
    , 'Saturday'
),

(
    1
    , 11
    , 'Dinner'
    , 'Sunday'
),

(
    1
    , 13
    , 'Dinner'
    , 'Sunday'
),

(
    1
    , 25
    , 'Dinner'
    , 'Sunday'
),

(
    1
    , 8
    , 'Dinner'
    , 'Monday'
),

(
    1
    , 9
    , 'Dinner'
    , 'Tuesday'
),

(
    1
    , 14
    , 'Dinner'
    , 'Tuesday'
),


(
    1
    , 1
    , 'Dinner'
    , 'Wednesday'
),

(
    1
    , 10
    , 'Dinner'
    , 'Thursday'
),

(
    1
    , 12
    ,'Dinner'
    , 'Friday'
),

(
    1
    , 2
    , 'Dinner'
    , 'Saturday'
),

(
    1
    , 3
    , 'Dinner'
    , 'Saturday'
),

(
    1
    , 23
    , 'Dinner'
    , 'Saturday'
);


