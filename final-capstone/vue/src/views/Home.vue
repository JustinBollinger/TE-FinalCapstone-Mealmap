<template>

  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Welcome to Mealmap!</h1>
    </div>


    <div class="h2-contain signin-container">
      <div id="home-image"> <img class="signin-logo" src="../../public/assets/Artboard 4.png" alt="Meal Map logo"/></div>
      <p id="home-text" class="lead home-text max-width800">Do you have a favorite recipe? <br>
        Do you need help planning for "Taco Tuesday" or "Meatless Monday" ? <br>
        <br>
        With MealMap you can enter and save all your favorite <strong>
          <router-link class="home-links" v-bind:to="{ name: 'recipes' }">recipes</router-link>
        </strong>. You can <strong>modify</strong> a recipe in your library too. You can also use MealMap to plan your weekly meals. Recipes can be added
        to specific meals on certain days.
<!--        MealMap even reads your <strong>-->
<!--        <router-link class="home-links" v-bind:to="{ name: 'meal-plan' }">meal plan</router-link>-->
<!--        </strong> and populates a <strong>grocery list</strong> for you! <br>-->
        <br>
        <br> You can also check what <strong><router-link class="home-links" v-bind:to="{ name: 'ingredient-list'}">ingredients</router-link></strong> you have already so that you're
        not buying unnecessary items.
      </p>
    </div>

  </div>

</template>

<script>


export default {
  name: "home"
};
</script>

<style>

#home-image{
  display: flex;
  justify-content: left;
  margin-bottom: 25px;
}

#home-text{
  /*background-image: linear-gradient(rgba(36, 37, 40,.85), rgba(36, 37, 40,.85));*/
  /*background: linear-gradient(45deg, rgba(237, 28, 36, .85) 0%, rgba(0, 113, 188, 0.85) 48%, rgba(27, 20, 100, .85) 100%);*/
  background: rgba(255, 255, 255, 0.95);

  padding: 25px;
  border-radius: 25px;
  font-size: 18pt;
  color: #020202;
}

.home-links{
  font-size: 18pt;
  color: #0071bc;
  font-weight: bold;
  /*font-style: oblique;*/
}

</style>
