<template>
  <div class="jumbotron" id="main-contain">
    <h1>Ingredient Library</h1>


    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
      <div class="card-header">
        <h4 class="card-title">My Ingredients</h4>
      </div>
      <div class="card-body">
        <p class="card-text">
        <ul id="list">
        <li v-for="ingredient in ingredients" v-bind:key="ingredient.id">
          {{ingredient.ingredientName}}
        </li>
      </ul></p>
      </div>
    </div>

    <div class="form-group">
      <div class="input-group mb-3">
        <div class="custom-file">
          <input type="file" class="custom-file-input" id="inputGroupFile02">
          <label class="custom-file-label" for="inputGroupFile02">Ingredient Name</label>
        </div>
        <div class="input-group-append">
          <span class="input-group-text">Add</span>
        </div>
      </div>
    </div>
<!--    <h2></h2>-->
<!--    <ul id="list">-->
<!--      <li v-for="ingredient in ingredients" v-bind:key="ingredient.id">-->
<!--          {{ingredient.ingredientName}}-->
<!--      </li>-->
<!--    </ul>-->

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