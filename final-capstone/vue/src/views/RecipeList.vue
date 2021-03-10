<template>
  <div class="recipes">
    <h1>Recipe Library</h1>
    <img src="../assets/Artboard 5.png" alt="full bag of groceries">
    <div class="recipe-list">
      <div v-for="recipe in recipes" v-bind:key="recipe.id" class="recipe">
        <router-link v-bind:to="{name: 'RecipeList', params:{id: recipe.id}}"> {{ recipe.name }} </router-link>
      </div>
  </div>

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Recipe Name</th>
      <th scope="col">Total Cook Time</th>
      <th scope="col">Level of Difficulty</th>
      <th scope="col">Dietary Restrictions</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">placeholder</th>
      <td>placeholder</td>
      <td>placeholder</td>
      <td>placeholder</td>
    </tr>
    <tr class="table-primary">
      <th scope="row">placeholder</th>
      <td>placeholder</td>
      <td>placeholder</td>
      <td>placeholder</td>
    </tr>
    <tr>
      <th scope="row">placeholder</th>
      <td>placeholder</td>
      <td>placeholder</td>
      <td>placeholder</td>
    </tr>
    <tr class="table-primary">
      <th scope="row">placeholder</th>
      <td>placeholder</td>
      <td>placeholder</td>
      <td>placeholder</td>
    </tr>
  </tbody>
</table>

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
    recipeService.list().then((response) => {
      this.recipes = response.data;
    });
  }
}
</script>

<style>

</style>