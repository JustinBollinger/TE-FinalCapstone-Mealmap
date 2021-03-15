<template>
  <div class = "add-ingredient">
    <label>Add Ingredient</label>
    <input type="text" id="ingredinet-input">
    <input type="submit" v-on:click="saveIngredient()">
  </div>
</template>

<script>

import IngredientService from "../services/IngredientService"
export default {
  data() {
    return {
      ingredient:{
          name: "",
          isCreated:false
      }
    };
  },
 
  methods: {
    saveIngredient() {
      IngredientService
      .create(this.ingredient)
      .then(() => {
        this.$router.push("/ingredientList/");
        this.isCreated = true;
    }) 
    }
  }

}
</script>

<style>

label{
    color:white
}


</style>