<template>

  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Recipe Library</h1>
    </div>


    <div id="ingred-table" class="h2-contain">

      <table class="table">

        <tr>
          <th></th>
          <th scope="col">Monday</th>
          <th scope="col">Tuesday</th>
          <th scope="col">Wednesday</th>
          <th scope="col">Thursday</th>
          <th scope="col">Friday</th>
          <th scope="col">Saturday</th>
          <th scope="col">Sunday</th>

        </tr>
        <tr>
          <th>Breakfast</th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>
        <tr>
          <th></th>
          <td>meal 2</td>
          <td>meal 2</td>
          <td>meal 2</td>
          <td>meal 2</td>
          <td>meal 2</td>
          <td>meal 2</td>
          <td>meal 2</td>
        </tr>
        <tr>
          <th></th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>
        <tr>
          <th>Lunch</th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>
        <tr>
          <th></th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>
        <tr>
          <th></th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>
        <tr>
          <th>Dinner</th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>
        <tr>
          <th></th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>
        <tr>
          <th></th>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
          <td>meal 1</td>
        </tr>

      </table>

      <table class="table">
        <thead>
        <tr>
          <th scope="col"></th>
          <th scope="col">Monday</th>
          <th scope="col">Tuesday</th>
          <th scope="col">Wednesday</th>
          <th scope="col">Thursday</th>
          <th scope="col">Friday</th>
          <th scope="col">Saturday</th>
          <th scope="col">Sunday</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="recipe in recipes" v-bind:key="recipe.id" class="table table-hover">
          <th scope="">
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

      <div class="button-separator">
        <router-link class="btn btn-secondary button-properties" v-bind:to="{name: 'add-new-recipe'}">Add New Recipe
        </router-link>
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