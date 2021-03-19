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
    , meal_date
)
VALUES

(
    1
    , 5
    , 'Breakfast'
    , 'Monday'
    , '2021-03-15'
),

(
    1
    , 6
    , 'Breakfast'
    , 'Tuesday'
    , '2021-03-16'
),

(
    1
    , 7
    , 'Breakfast'
    , 'Wednesday'
    , '2021-03-17'
),

(
    1
    , 4
    , 'Breakfast'
    , 'Thursday'
    , '2021-03-18'
),

(
    1
    , 5
    , 'Breakfast'
    , 'Friday'
    , '2021-03-19'
),

(
    1
    , 6
    , 'Breakfast'
    , 'Saturday'
    , '2021-03-20'
),

(
    1
    , 16
    , 'Lunch'
    , 'Monday'
    , '2021-03-15'
),

(
    1
    , 17
    , 'Lunch'
    , 'Tuesday'
    , '2021-03-16'
),

(
    1
    , 24
    , 'Lunch'
    , 'Tuesday'
    , '2021-03-16'
),

(
    1
    , 21
    , 'Lunch'
    , 'Wednesday'
    , '2021-03-17'
),

(
    1
    , 22
    , 'Lunch'
    , 'Wednesday'
    , '2021-03-17'
),


(
    1
    , 19
    , 'Lunch'
    , 'Thursday'
    , '2021-03-18'
),

(
    1
    , 20
    , 'Lunch'
    , 'Friday'
    , '2021-03-19'
),

(
    1
    , 18
    , 'Lunch'
    , 'Saturday'
    , '2021-03-20'
),

(
    1
    , 11
    , 'Dinner'
    , 'Sunday'
    , '2021-03-14'
),

(
    1
    , 8
    , 'Dinner'
    , 'Monday'
    , '2021-03-15'
),

(
    1
    , 9
    , 'Dinner'
    , 'Tuesday'
    , '2021-03-16'
),

(
    1
    , 14
    , 'Dinner'
    , 'Tuesday'
    , '2021-03-16'
),


(
    1
    , 1
    , 'Dinner'
    , 'Wednesday'
    , '2021-03-17'
),

(
    1
    , 10
    , 'Dinner'
    , 'Thursday'
    , '2021-03-18'
),

(
    1
    , 12
    ,'Dinner'
    , 'Friday'
    , '2021-03-19'
),

(
    1
    , 2
    , 'Dinner'
    , 'Saturday'
    , '2021-03-20'
),

(
    1
    , 3
    , 'Dinner'
    , 'Saturday'
    , '2021-03-20'
),

(
    1
    , 23
    , 'Dinner'
    , 'Saturday'
    , '2021-03-20'
);


