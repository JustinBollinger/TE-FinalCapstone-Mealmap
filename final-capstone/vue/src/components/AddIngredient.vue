<template>

  <div class="form-group">

    <div class="input-group mb-3">

      <input type="text" class="form-control" placeholder="Add New Ingredient Name" id="inputDefault">
      <div>
        <span type="button" class="btn btn-secondary" v-on:click="saveIngredient()">Add</span>
      </div>
    </div>
  </div>


</template>

<script>

import IngredientService from "../services/IngredientService";

export default {
  data() {
    return {
      ingredient: {
        ingredientName: "",
        isCreated: false
      }
    };
  },

  methods: {
    saveIngredient() {
      IngredientService
          .create(this.ingredient)
          // .then(() => {
          // this.$router.push("/ingredientList/");
          this.isCreated = true;
          
        //})
    }
  }
}
</script>

<style>

</style>