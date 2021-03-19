<template>

  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Ingredient Library</h1>
    </div>

    <div  class="h2-contain signin-container">

      <div id="ingred-table" class="form-signin max-width800">
        <add-ingredient></add-ingredient>
        <table class="table">
          <tbody>
          <tr v-for="ingredient in ingredients" v-bind:key="ingredient.id" class="table table-hover">
            <th scope="row">{{ ingredient.ingredientName }}</th>
          </tr>
          </tbody>
        </table>
      </div>

    </div>

  </div>

</template>

<script>
import AddIngredient from "../components/AddIngredient";
import IngredientService from "../services/IngredientService";

export default {
  data() {
    return {
      ingredients: []
    };
  },
  created() {
    IngredientService.getIngredients().then((response) => {
      this.ingredients = response.data;
    });
  },
  components: {
    AddIngredient
  }
}


</script>

<style>

#ingred-table {
  display: flex;
  justify-content: center;
  flex-direction: column;
}

</style>