INSERT INTO ingredients
(
    ingredient_id
	, ingredient_name
)
VALUES
(
    nextval ('seq_ingredient_id')
    , 'jumbo pasta shells'
),

(
    nextval ('seq_ingredient_id')
    , 'salt'
),

(
    nextval ('seq_ingredient_id')
    , 'olive oil'
),

(
    nextval ('seq_ingredient_id')
    , 'mushrooms'
),

(
    nextval ('seq_ingredient_id')
    , 'spinach'
),

(
    nextval ('seq_ingredient_id')
    , 'butter'
),

(
    nextval ('seq_ingredient_id')
    , 'marinara sauce'
),

(
    nextval ('seq_ingredient_id')
    , 'red pepper flakes'
),

(
    nextval ('seq_ingredient_id')
    , 'ricotta cheese'
),

(
    nextval ('seq_ingredient_id')
    , 'parmesean cheese'
),

(
    nextval ('seq_ingredient_id')
    , 'oregeno'
),

(
    nextval ('seq_ingredient_id')
    , 'green beans'
),

(
    nextval ('seq_ingredient_id')
    , 'garlic'
),

(
    nextval ('seq_ingredient_id')
    , 'capers'
),


(
    nextval ('seq_ingredient_id')
    , 'bacon'
),

(
    nextval ('seq_ingredient_id')
    , 'lettuce'
),

(
    nextval ('seq_ingredient_id')
    , 'tomato'
),

(
    nextval ('seq_ingredient_id')
    , 'bread'
),

(
    nextval ('seq_ingredient_id')
    , 'mayonnaise'
),

(
    nextval ('seq_ingredient_id')
    , 'eggs'
),

(
    nextval ('seq_ingredient_id')
    , 'pepper'
),

(
    nextval ('seq_ingredient_id')
    , 'ham'
),

(
    nextval ('seq_ingredient_id')
    , 'swiss cheese'
),

(
    nextval ('seq_ingredient_id')
    , 'water'
),

(
    nextval ('seq_ingredient_id')
    , 'old fashioned oats'
),

(
    nextval ('seq_ingredient_id')
    , 'peanut butter'
),

(
    nextval ('seq_ingredient_id')
    , 'honey'
),

(
    nextval ('seq_ingredient_id')
    , 'cinnamon'
),

(
    nextval ('seq_ingredient_id')
    , 'pancake mix'
),

(
    nextval ('seq_ingredient_id')
    , 'banana'
),

(
    nextval ('seq_ingredient_id')
    , 'walnuts'
),

(
    nextval ('seq_ingredient_id')
    , 'vanilla yogurt'
),

(
    nextval ('seq_ingredient_id')
    , 'peaches'
),

(
    nextval ('seq_ingredient_id')
    , 'blackberries'
),

(
    nextval ('seq_ingredient_id')
    , 'granola'
),

(
    nextval ('seq_ingredient_id')
    , 'cooked macaroni'
),

(
    nextval ('seq_ingredient_id')
    , 'canned tuna'
),

(
    nextval ('seq_ingredient_id')
    , 'cream of chicken soup'
),

(
    nextval ('seq_ingredient_id')
    , 'shredded cheddar cheese'
),

(
    nextval ('seq_ingredient_id')
    , 'french fried onions'
);



--ALTER SEQUENCE seq_ingredient_id RESTART WITH 22;

INSERT INTO recipes_ingredients
(
    	recipe_id
	, ingredient_id
	, measurement_unit
	, measurement_quantity
)
VALUES
(
    1
    , 1
    , 'oz'
    , 6
),

(
    1
    , 2
    , 'teaspoon'
    , 1.5
),

(
    1
    , 3
    , 'tablespoon'
    , 2
),

(
    1
    , 4
    , 'lb'
    , .5
),

(
    1
    , 5
    , 'oz'
    , 5
),

(
    1
    , 6
    , 'tablespoon'
    , 2
),

(
    1
    , 7
    , 'cups'
    , 3
),

(
    1
    , 8
    , 'teaspoon'
    , .5
),

(
    1
    , 9
    , 'cups'
    , 2
),

(
    1
    , 10
    , 'oz'
    , 3
),

(
    1
    , 11
    , 'tablespoon'
    , 3
),

(
    2
    , 3
    , 'cup'
    , 1/3
),

(
    2
    , 12
    , 'lb'
    , 1
),

(
    2
    , 13
    , 'cloves'
    , 6
),

(
    2
    , 14
    , 'tablespoon'
    , 1
),

(
    2
    , 15
    , 'teaspoon'
    , 1
),

(
    3
    , 16
    , 'slices'
    , 4
),

(
    3
    , 17
    , 'leaves'
    , 2
),

(
    3
    , 18
    , 'slices'
    , 2
),

(
    3
    , 19
    , 'slices'
    , 2
),

(
    3
    , 20
    , 'tablespoon'
    , 1
),

(
    4
    , 21
    , 'whole'
    , 3
),

(
    4
    , 22
    , 'teaspoon'
    , 1/8
),

(
    4
    , 23
    , 'cup'
    , 1/2
),

(
    4
    , 24
    , 'cup'
    , 1/4
),

(
    5
    , 25
    , 'cup'
    , 1.75
),

(
    5
    , 2
    , 'teaspoon'
    , 1/8
),

(
    5
    , 26
    , 'cup'
    , 1
),

(
    5
    , 27
    , 'tablespoon'
    , 2
),

(
    5
    , 28
    , 'tablespoon'
    , 2
),

(
    5
    , 29
    , 'teaspoon'
    , 1
),

(
    6
    , 30
    , 'cup'
    , 2
),

(
    6
    , 31
    , 'whole'
    , 1
),

(
    6
    , 26
    , 'cup'
    , 1/2
),

(
    6
    , 32
    , 'cup'
    , 1/4
), 

(
    7
    , 33
    , 'cups'
    , 4
),

(
    7
    , 34
    , 'medium'
    , 2
),

(
    7
    , 35
    , 'cups'
    , 2
),

(
    7
    , 36
    , 'cup'
    , 1/2
),

(
    8
    , 37
    , 'cups'
    , 3
),

(
    8
    , 38
    , 'oz'
    , 5
),

(
    8
    , 39
    , 'oz'
    , 10.75
),

(
    8
    , 40
    , 'cup'
    , 1
);