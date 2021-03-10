
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
    100
    , 001
    , 'Vegetarian Stuffed Shells'
    , 'Cook shells in a large pot of boiling salted water, stirring occasionally, until very al dente, about 9 minutes; drain. Run under cold water to stop the cooking; drain again.
Meanwhile, heat oil in a large skillet over high. Add mushrooms and cook, stirring occasionally, until they release juices, then are dry again and nicely browned, 5–6 minutes; season with black pepper and 1 tsp. salt. Reduce heat to medium, add wine, and cook, stirring, until reduced by half, 1–2 minutes. Add spinach, cover, and cook until beginning to wilt, 1–2 minutes. Uncover and continue to cook, stirring occasionally, until spinach is completely wilted and most of the liquid is evaporated, 2–4 minutes more. Transfer mushroom mixture to a large bowl; reserve skillet.
Cook garlic and butter in reserved skillet over medium-high heat, stirring occasionally, until garlic is fragrant and beginning to brown, 2–3 minutes. Add marinara sauce and red pepper and bring to a simmer over low heat. Cook, stirring occasionally, until warmed through, 6–8 minutes.
While sauce cooks, add ricotta, 3 oz. Parmesan, 2 Tbsp. oregano, and remaining 1/2 tsp. salt to mushroom mixture and stir to combine. Spoon about 2 Tbsp. ricotta mixture into each shell. The shell should be filled to capacity but not overstuffed.
Nestle stuffed shells into hot sauce in skillet. Cover and cook over medium heat until shells are warmed through, 4–6 minutes. Remove from heat and let sit 5 minutes. Sprinkle with Parmesan and remaining 1 Tbsp. oregano.
'
    , 4
    , 45 
    , 'easy'
);

INSERT INTO ingredients
(
    recipe_id
	, ingredient_name

)
VALUES
(
    001
    , 'Jumbo Pasta Shells'
),

(
    001
    , 'salt'
),

(
    001
    , 'olive oil'
),

(
    001
    , 'mushrooms'
),

(
    001
    , 'spinach'
),

(
    001
    , 'butter'
),

(
    001
    , 'marinara sauce'
),

(
    001
    , 'red pepper flakes'
),

(
    001
    , 'ricotta cheese'
),

(
    001
    , 'parmesean cheese'
),

(
    001
    , 'oregeno'
);
INSERT INTO recipes_ingredients
(
    	recipe_id
	, ingredient_id
	, measurement_unit
	, measurement_quantity
)
VALUES
(
    001
    , 1
    , 'oz'
    , 6
),

(
    001
    , 2
    , 'teaspoon'
    , 1.5
),

(
    001
    , 3
    , 'tablespoon'
    , 2
),

(
    001
    , 4
    , 'lb'
    , .5
),

(
    001
    , 5
    , 'oz'
    , 5
),

(
    001
    , 6
    , 'tablespoon'
    , 2
),

(
    001
    , 7
    , 'cups'
    , 3
),

(
    001
    , 8
    , 'teaspoon'
    , .5
),

(
    001
    , 9
    , 'cups'
    , 2
),

(
    001
    , 10
    , 'oz'
    , 3
),

(
    001
    , 11
    , 'tablespoon'
    , 3
);
