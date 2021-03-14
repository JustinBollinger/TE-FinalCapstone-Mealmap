<template>
  <div class = "ingredient-list">
    <h1>Ingredient Library</h1>

    <img src="../assets/Artboard 5.png" alt="full bag of groceries">

    <h2>Ingredients</h2>
    <ul>
      <li v-for="ingredient in ingredients" v-bind:key="ingredient.id">
          {{ingredient.ingredientName}}
      </li>
    </ul>

    <label>Add Ingredient</label>
    <input type="text" id="ingredinet-input">
    <input type="submit" v-on:click="saveIngredient()">
  
  </div>
</template>

// <script>
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
  },

  methods: {
    saveIngredient() {
      ingredientService
      .create(this.ingredient)
      .then(() => {
        this.$router.push("/ingredientList/");
    }) 
    }
  }
}


</script>

<style>

h2{
  color: white
}

</style>