<template>
  <div class="recipes">
    <h1>Recipe Library</h1>
    <img src="../assets/Artboard 5.png" alt="full bag of groceries">

    <div class="recipe-list">
      <ul>
        <li v-for="recipe in recipes" v-bind:key="recipe.id">
          <router-link v-bind:to="{name: 'recipe-detail'}">
            {{recipe.recipeName}}&nbsp;|&nbsp;
            {{recipe.cookingTime}} min&nbsp;|&nbsp;
            {{recipe.numberOfServings}} servings&nbsp;|&nbsp;
            {{recipe.difficulty}}&nbsp;|&nbsp;
            <!-- {{recipe.dietaryRestriction-id}}&nbsp;|nbsp; -->
          </router-link>
        </li>
      </ul>
      <router-link id="btnrecipe" class="btn btn-primary btn-lg" v-bind:to="{name: 'add-new-recipe'}">Add New Recipe</router-link>
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