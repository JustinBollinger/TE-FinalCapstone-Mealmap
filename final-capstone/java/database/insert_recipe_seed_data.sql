INSERT INTO recipes
(
    recipe_id
	, recipe_name
	, directions
	, serving_size
)
VALUES
(
    001
    , 'Vegetarian Stuffed Shells'
    , 'Cook shells in a large pot of boiling salted water, stirring occasionally, until very al dente, about 9 minutes; drain. Run under cold water to stop the cooking; drain again.'
    , 4
);

INSERT INTO ingredients
(
    recipe_id
	, ingredient_id
	, ingredient_name
	, measurement_id
)
VALUES
(
    001
    , 0001
    , 'Jumbo Pasta Shells'
    , 
);
