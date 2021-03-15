<template>
  <div class="jumbotron" id="main-contain">
    <div class="h1-contain">
      <h1 class="display-3">Ingredient Library</h1>
    </div>

    <div class="h2-contain">
      <add-ingredient></add-ingredient>
    </div>

    <div class="h2-contain">

      <table class="table">
        <thead>
        <tr>
          <th scope="col">Ingredient Name</th>
          <!--        <th scope="col">Ingredient Name</th>-->
          <!--        <th scope="col">Column heading</th>-->
          <!--        <th scope="col">Column heading</th>-->
        </tr>
        </thead>
        <tbody>
        <tr v-for="ingredient in ingredients" class="table-secondary">
          <th scope="row">{{ ingredient.ingredientName }}</th>
          <!--        <td>{{ingredient.ingredientName}}</td>-->
          <!--        <td>Column content</td>-->
          <!--        <td>Column content</td>-->
        </tr>
        <!--      <tr>-->
        <!--        <th scope="row">Default</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr v-for="ingredient in ingredients" class="table-primary">-->
        <!--        <th scope="row">Primary</th>-->
        <!--        <td>{{ingredient.ingredientName}}</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr class="table-secondary">-->
        <!--        <th scope="row">Secondary</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr class="table-success">-->
        <!--        <th scope="row">Success</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr class="table-danger">-->
        <!--        <th scope="row">Danger</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr class="table-warning">-->
        <!--        <th scope="row">Warning</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr class="table-info">-->
        <!--        <th scope="row">Info</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr class="table-light">-->
        <!--        <th scope="row">Light</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        <!--      <tr class="table-dark">-->
        <!--        <th scope="row">Dark</th>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--        <td>Column content</td>-->
        <!--      </tr>-->
        </tbody>
      </table>
    </div>

    <!--    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">-->
    <!--      <div class="card-header">-->
    <!--        <h4 class="card-title">My Ingredients</h4>-->
    <!--      </div>-->
    <!--      <div class="card-body">-->
    <!--        <div class="form-group">-->
    <!--          <label for="exampleSelect2">Example multiple select</label>-->
    <!--          <select multiple="" class="form-control" id="exampleSelect2">-->
    <!--            <li><option>v-for="ingredient in ingredients" v-bind:key="ingredient.id">-->
    <!--              {{ingredient.ingredientName}}</option></li>-->
    <!--            <option>2</option>-->
    <!--            <option>3</option>-->
    <!--            <option>4</option>-->
    <!--            <option>5</option>-->
    <!--          </select>-->
    <!--        </div>-->
    <!--        <p class="card-text">-->
    <!--        <ul id="list">-->
    <!--        <li v-for="ingredient in ingredients" v-bind:key="ingredient.id">-->
    <!--          {{ingredient.ingredientName}}-->
    <!--        </li>-->
    <!--      </ul>-->
    <!--        </p>-->
    <!--      </div>-->
    <!--    </div>-->

    <!--    <div class="form-group">-->
    <!--      <div class="input-group mb-3">-->
    <!--        <div class="custom-file">-->
    <!--          <input type="file" class="custom-file-input" id="inputGroupFile02">-->
    <!--          <label class="custom-file-label" for="inputGroupFile02">Ingredient Name</label>-->
    <!--        </div>-->
    <!--        <div class="input-group-append">-->
    <!--          <span class="input-group-text">Add</span>-->
    <!--        </div>-->
    <!--      </div>-->
    <!--    </div>-->
    <!--    <h2></h2>-->
    <!--    <ul id="list">-->
    <!--      <li v-for="ingredient in ingredients" v-bind:key="ingredient.id">-->
    <!--          {{ingredient.ingredientName}}-->
    <!--      </li>-->
    <!--    </ul>-->



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

/* h2{
  color: white
} */

#list{
  color:white
}


</style>