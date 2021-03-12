<template>
<ingredient-list>
<div class = "ingredient-list">
    <h1>Ingredient Library</h1>

    <img src="../assets/Artboard 5.png" alt="full bag of groceries">

    <ul></ul>

    <h2>Add Ingredient</h2>
    <input type="text" id="list-input">
    <input type="submit" id="list-submit" v-on:click="addIngredient">


  </div>

</ingredient-list>
  
</template>

<script>
import ingredientService from "../services/IngredientService"

export default {
  name: 'ingredient-list',
  data() {
    return {
      ingredients: []
    };
  },
  created() {
    ingredientService.getIngredients().then((response) => {
      this.ingredients = response.data;
    });
  }
}


</script>

<style>

h2{
  color: white
}

</style>