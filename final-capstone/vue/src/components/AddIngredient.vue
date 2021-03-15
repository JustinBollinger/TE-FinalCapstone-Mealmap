<template>
<!--  <div class = "add-ingredient">-->
<!--    <label>Add Ingredient</label>-->
<!--    <input type="text" id="ingredinet-input">-->
<!--    <input type="submit" v-on:click="saveIngredient()">-->
<!--  </div>-->

  <div class="form-group">
    <div class="input-group mb-3">
<!--      <div class="custom-file">-->
<!--        <input type="text" class="custom-file-input" id="inputGroupFile02">-->
<!--        <label class="custom-file-label" for="inputGroupFile02">Ingredient Name</label>-->
<!--      </div>-->
<!--      <div class="input-group-append">-->
      <input type="text" class="form-control" placeholder="Default input" id="inputDefault">
        <div>
        <span type="button" class="btn btn-secondary" v-on:click="saveIngredient()" >Add</span>
      </div>
    </div>
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