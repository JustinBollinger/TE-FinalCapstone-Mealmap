<template>

  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Welcome to Mealmap!</h1>
    </div>

    <div class="h2-contain">
      <div id="home-image"> <img id="signin-logo" src="../assets/Artboard 4.png" alt="Meal Map logo"/></div>
      <p class="lead">Do you have a favorite recipe? Do you need help planning for "Taco Tuesday" or "Meatless Monday" ? With
        MealMap you can enter and save all your favorite <strong>
          <router-link v-bind:to="{ name: 'recipes' }">recipes</router-link>
        </strong>. You can <strong>modify</strong> a recipe in your library too. You can also use MealMap to plan your weekly meals. Recipes can be added
        to specific meals on certain days. MealMap even reads your <strong>
        <router-link v-bind:to="{ name: 'meal-plan' }">meal plan</router-link>
        </strong> and populates a <strong>grocery list</strong> for you! You can also check what <strong>ingredients</strong> you have already so that you're
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
  justify-content: center;
  margin-bottom: 25px;
}

</style>
