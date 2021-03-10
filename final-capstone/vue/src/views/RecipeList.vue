<template>
  <div class="recipes">
    <h1>Recipe Library</h1>
    <img src="../assets/Artboard 5.png" alt="full bag of groceries">

    <div class="recipe-list">
      <ul>
        <li v-for="recipe in recipes" v-bind:key="recipe.id">
          {{recipe.name}}&<nbsp>|</nbsp>
          {{recipe.cooking-time}}&<nbsp>|</nbsp>
          {{recipe.difficulty}}&<nbsp>|</nbsp>
          {{recipe.dietary-restriction-id}}&<nbsp>|</nbsp>
        </li>
      </ul>
    </div>
  </div>

</template>

<script>
import recipeService from "../services/RecipeService"

export default {
  name: 'recipe-list',
  data() {
    return {
      recipes: []
    };
  },
  created() {
    recipeService.getRecipes().then((response) => {
      this.recipes = response.data;
    });
  }
}
</script>

<style>

</style>