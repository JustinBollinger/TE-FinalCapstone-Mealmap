<template>
  <div class="recipes">
    <h1>Recipe Library</h1>
    <img src="../assets/Artboard 5.png" alt="full bag of groceries">
    <div class="recipe-list">
    <div v-for="recipe in recipes" v-bind:key="recipe.id" class="recipe">
      <router-link v-bind:to="{name: 'RecipeList', params:{id: recipe.id}}">
      {{ recipe.name }}
      </router-link>
    </div>
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
    recipeService.list().then((response) => {
      this.recipes = response.data;
    });
  }
}
</script>

<style>

</style>