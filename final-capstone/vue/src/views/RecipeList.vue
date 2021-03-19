<template>

  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Recipe Library</h1>
    </div>

    <div class="h2-contain signin-container">

      <div class="form-signin max-width800">
        <table class="table">
          <thead >
          <tr>
            <th scope="col">Recipe Name</th>
            <th class="text-center" scope="col">Prep Time</th>
            <th class="text-center" scope="col" >Servings</th>
            <th class="text-center" scope="col">Difficulty</th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="recipe in recipes" v-bind:key="recipe.id" class="table table-hover">
            <th scope="row">
              <router-link v-bind:to="'recipeList/recipeDetail/' + recipe.recipeId"> {{ recipe.recipeName }}
                &nbsp;&nbsp;
              </router-link>
            </th>
            <td class="text-center">{{ recipe.cookingTime }} minutes</td>
            <td class="text-center">{{ recipe.numberOfServings }}</td>
            <td class="text-center">{{ recipe.difficulty }}</td>
          </tr>
          </tbody>

        </table>

        <div class="button-separator">
          <router-link class="btn btn-secondary button-properties" v-bind:to="{name: 'add-new-recipe'}">Add New Recipe
          </router-link>
        </div>
      </div>

    </div>
  </div>

</template>

<script>

import recipeService from "../services/RecipeService"

export default {
  name: 'recipes',
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