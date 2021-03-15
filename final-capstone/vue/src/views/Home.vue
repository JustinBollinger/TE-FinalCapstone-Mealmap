<template>

  <div id="h1-contain">
    <div id="h1-home">
      <h1>Welcome to Your Meal Planner</h1>
    </div>
    <div id="h2-contain">
      <h2> Do you have a favorite recipe? Do you need help planning for "Taco Tuesday" or "Meatless Monday" ? With
        MealMap©, you can enter and save all your favorite <strong>
          <router-link v-bind:to="{ name: 'recipes' }">recipes</router-link>
        </strong>. You can <strong>
          <router-link v-bind:to="{ name: 'modify-recipe' }">modify</router-link>
        </strong> a recipe in your library too. You can also use MealMap to plan your weekly meals. Recipes can be added
        to specific meals on certain days. MealMap even reads your <strong>
          <router-link v-bind:to="{ name: 'meal-plan' }">meal plan</router-link>
        </strong> and populates a <strong>
          <router-link v-bind:to="{ name: 'grocery-list' }">grocery list</router-link>
        </strong> for you! You can also check what <strong>
          <router-link v-bind:to="{ name: 'ingredient-list'}">ingredients</router-link>
        </strong> you have already so that you're
        not buying unnecessary items.
      </h2>
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
  background-image: url("../../public/rainbow-produce-copy.png"), linear-gradient(rgba(255, 255, 255, 99), rgba(255, 255, 255, 99));
  background-repeat: no-repeat;
  display: flex;
  justify-content: center;
  flex-direction: column;
  padding: 50px 100px 50px 100px;
}

h1 {
  /*padding: 50px 100px 50px 100px;*/
  font-size: 3rem;
}

h2 {
  line-height: 3rem;
  font-size: 1rem;
  color: #1d2124 !important;
}

#h2-contain {
  /*margin-bottom: 10rem;*/
  padding-top: 3rem;
  padding-right: 4rem;
  padding-left: 4rem;
  padding-bottom: 3rem;
  border-radius: 2.5rem;
  background: white;
  max-width: 800px;
  display: flex;
}

#h1-contain{

}

</style>
