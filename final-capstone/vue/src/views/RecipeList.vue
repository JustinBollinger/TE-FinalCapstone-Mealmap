<template>
  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Recipe Library</h1>
    </div>

    <div id="ingred-table" class="h2-contain">
      <table class="table">
        <thead>
        <tr>
          <th scope="col">Recipe Name</th>
          <th scope="col">Preparation Time</th>
          <th scope="col">Number Of Servings</th>
          <th scope="col">Difficulty</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="recipe in recipes" v-bind:key="recipe.id" class="table table-hover">
          <th scope="row">
            <router-link v-bind:to="'recipeList/recipeDetail/' + recipe.recipeId"> {{ recipe.recipeName }}
              &nbsp;&nbsp;
            </router-link>
          </th>
          <td>{{ recipe.cookingTime }} minutes</td>
          <td>{{ recipe.numberOfServings }}</td>
          <td>{{ recipe.difficulty }}</td>
        </tr>
        </tbody>

      </table>
      <router-link id="btnrecipe" class="btn btn-secondary" v-bind:to="{name: 'add-new-recipe'}">Add New Recipe
      </router-link>
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