
INSERT INTO recipes
(
    user_id
    , recipe_id
	, recipe_name
	, directions
	, number_of_servings
	, cooking_time
	, difficulty
)
VALUES
(
    1
    , 1
    , 'Vegetarian Stuffed Shells'
    , 'Cook shells in a large pot of boiling salted water, stirring occasionally, until very al dente, about 9 minutes; drain. Run under cold water to stop the cooking; drain again.
Meanwhile, heat oil in a large skillet over high. Add mushrooms and cook, stirring occasionally, until they release juices, then are dry again and nicely browned, 5–6 minutes; season with black pepper and 1 tsp. salt. Reduce heat to medium, add wine, and cook, stirring, until reduced by half, 1–2 minutes. Add spinach, cover, and cook until beginning to wilt, 1–2 minutes. Uncover and continue to cook, stirring occasionally, until spinach is completely wilted and most of the liquid is evaporated, 2–4 minutes more. Transfer mushroom mixture to a large bowl; reserve skillet.
Cook garlic and butter in reserved skillet over medium-high heat, stirring occasionally, until garlic is fragrant and beginning to brown, 2–3 minutes. Add marinara sauce and red pepper and bring to a simmer over low heat. Cook, stirring occasionally, until warmed through, 6–8 minutes.
While sauce cooks, add ricotta, 3 oz. Parmesan, 2 Tbsp. oregano, and remaining 1/2 tsp. salt to mushroom mixture and stir to combine. Spoon about 2 Tbsp. ricotta mixture into each shell. The shell should be filled to capacity but not overstuffed.
Nestle stuffed shells into hot sauce in skillet. Cover and cook over medium heat until shells are warmed through, 4–6 minutes. Remove from heat and let sit 5 minutes. Sprinkle with Parmesan and remaining 1 Tbsp. oregano.
'
    , 4
    , 45 
    , 'moderate'
),

(
    1
    , 2
    , 'Green Beans with Garlic'
    , 'Heat oil in a large skillet over high until shimmering. Add green beans (the dryer they are, the less they will spatter when they hit the oil) and cook, covering skillet as needed if beans are spattering, until browned underneath, about 3 minutes. Turn beans with tongs and redistribute so they brown evenly (don’t toss them since hot oil can easily slosh out of skillet if you try to show off). Continue to cook, turning occasionally, until browned all over and tender, about 5 minutes longer. Season with salt. Add garlic, capers, and red pepper flakes. Cook, tossing occasionally, just until garlic turns golden, about 1 minute.
    Transfer beans to a platter. Spoon caper-garlic mixture over and pour some oil over too; season with salt.'
    , 4
    , 15
    , 'easy'
),

(
    1
    , 3
    , 'BLT Sandwich'
    , 'Cook the bacon in a large, deep skillet over medium-high heat until evenly browned, about 10 minutes. Drain the bacon slices on a paper towel-lined plate.
    Arrange the cooked bacon, lettuce, and tomato slices on one slice of bread. Spread one side of remaining bread slice with the mayonnaise. Bring the two pieces together to make a sandwich.'
    , 1
    , 15
    , 'easy'
);

ALTER SEQUENCE seq_recipe_id RESTART WITH 4;


INSERT INTO ingredients
(
    ingredient_id
    , recipe_id
	, ingredient_name
)
VALUES
(
    nextval ('seq_ingredient_id')
    , 1
    , 'Jumbo Pasta Shells'
),

(
    nextval ('seq_ingredient_id')
   , 1
    , 'salt'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'olive oil'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'mushrooms'
),

(
    nextval ('seq_ingredient_id')
    ,1
    , 'spinach'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'butter'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'marinara sauce'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'red pepper flakes'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'ricotta cheese'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'parmesean cheese'
),

(
    nextval ('seq_ingredient_id')
    , 1
    , 'oregeno'
),

(
    nextval ('seq_ingredient_id')
    , 2
    , 'olive oil'
),

(
    nextval ('seq_ingredient_id')
    , 2
    , 'green beans'
),

(
    nextval ('seq_ingredient_id')
    , 2
    , 'garlic'
),

(
    nextval ('seq_ingredient_id')
    , 2
    , 'capers'
),

(
    nextval ('seq_ingredient_id')
    , 2
    , 'red pepper flakes'
),

(
    nextval ('seq_ingredient_id')
    , 3
    , 'bacon'
),

(
    nextval ('seq_ingredient_id')
    , 3
    , 'lettuce'
),

(
    nextval ('seq_ingredient_id')
    , 3
    , 'tomato'
),

(
    nextval ('seq_ingredient_id')
    , 3
    , 'bread'
),

(
    nextval ('seq_ingredient_id')
    , 3
    , 'mayonnaise'
);

ALTER SEQUENCE seq_ingredient_id RESTART WITH 22;

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
    , 12
    , 'cup'
    , 1/3
),

(
    2
    , 13
    , 'lb'
    , 1
),

(
    2
    , 14
    , 'cloves'
    , 6
),

(
    2
    , 15
    , 'tablespoon'
    , 1
),

(
    2
    , 16
    , 'teaspoon'
    , 1
),

(
    3
    , 17
    , 'slices'
    , 4
),

(
    3
    , 18
    , 'leaves'
    , 2
),

(
    3
    , 19
    , 'slices'
    , '2'
),

(
    3
    , 20
    , 'slices'
    , '2'
),

(
    3
    , 21
    , 'tablespoon'
    , 1
);


