INSERT INTO measurement_unit
(
    measurement_unit_id
	, measurement_description
)
VALUES
(
    01
    , 'cup'
),

(
    02
    , 'tablespoon'
),

(
    03
    , 'teaspoon'
),

(
    04
    , 'oz'
),

(
    05
    , 'lb'
);

-- INSERT INTO measurement_quantity
-- (

-- ),

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
    , measurement_unit_id
	--, measurement_quantity_id
)
VALUES
(
    001
    , 0001
    , 'Jumbo Pasta Shells'
    , 04
),

(
    001
    , 0002
    , 'salt'
    , 03
),

(
    001
    , 0003
    , 'olive oil'
    , 02
),

(
    001
    , 0004
    , 'mushrooms'
    , 05
),

(
    001
    , 0005
    , 'spinach'
    , 04
),

(
    001
    , 0006
    , 'butter'
    , 02
),

(
    001
    , 0007
    , 'marinara sauce'
    , 01
),

(
    001
    , 0008
    , 'red pepper flakes'
    , 03
),

(
    001
    , 0009
    , 'ricotta cheese'
    , 01
),

(
    001
    , 0010
    , 'parmesean cheese'
    , 04
),

(
    001
    , 0011
    , 'oregeno'
    , 02
);
