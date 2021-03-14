<template>

  <div id="home-contain">
    <h1>Welcome to Your Meal Planner</h1>
    <div id="home-left-right-container">
      <div id="header-text" class="home-left">
        <p> Do you have a favorite recipe? Do you need help planning for "Taco Tuesdays" or "Meatless Mondays?" With MealMap, you can <strong>enter and save recipes</strong>. You can <strong>modify a recipe</strong> in your library too. You can also use MealMap to plan your weekly meals. Recipes can be added to specific meals on certain days. MealMap even reads your <strong>weekly meal plan</strong> and populates a <strong>grocery list</strong> for you! You can also check what <strong>ingredients</strong> you have already so that you're not buying unecessary items.</p>
      </div>
      <div id="home-image" class="home-right">
        <img src="../assets/Artboard 5.png" alt="full bag of groceries">
      </div>
    </div>

  </div>
</template>

<script>


export default {
  name: "home"
};
</script>


<style>

#home-contain {
  background-image: url("../../public/rainbow-produce-copy.png"), linear-gradient(rgba(0, 0, 255, 0.75), rgba(255, 255, 0, 0.75));
  background-repeat: no-repeat;
  display: flex;
  justify-content: center;
  flex-direction: column;
  padding: 75px 100px 50px 100px;
  /*border-bottom: rgba(77, 77, 77, 100) solid 5px;*/
}

#home-left-right-container{
  display: flex;
  flex-direction: row;
}

h1 {
  font-family: Roboto, sans-serif;
  color: white;
  font-size: 4rem;
}

#header-text {
  display: flex;
  justify-content: left;
  /* max-width: ; */
}

img{
  max-width: 300px;
}

#home-image {
  display: flex;
  justify-content: right;
}



</style>
