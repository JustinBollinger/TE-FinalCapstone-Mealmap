<template>
  <div class = "ingredient-list">
    <h1>Ingredient Library</h1>

    <img src="../assets/Artboard 5.png" alt="full bag of groceries">

    <h2>Ingredients</h2>
    <ul id="list">
      <li v-for="ingredient in ingredients" v-bind:key="ingredient.id">
          {{ingredient.ingredientName}}
      </li>
    </ul>

    <add-ingredient></add-ingredient>
  
  </div>
</template>

<script>
import AddIngredient from "../components/AddIngredient";
import IngredientService from "../services/IngredientService";

export default {
  data(){
    return{
      ingredients: []
    };
  },
  created() {
  IngredientService.getIngredients().then((response) => {
    this.ingredients = response.data;
  });
  },
  components:{
    AddIngredient
  }
}
  

</script>

<style>

/* h2{
  color: white
} */

#list{
  color:cornflowerblue
}

</style>