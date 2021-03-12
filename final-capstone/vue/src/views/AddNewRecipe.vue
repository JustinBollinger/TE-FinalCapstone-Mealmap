<template>
  <form v-on:submit.prevent>
    <fieldset>
    <h1>Add New Recipe</h1>
    <div class="form-group">
        <label class="col-form-label" for="inputDefault">Recipe Name&nbsp;</label>
        <input type="text" class="form-control" placeholder="What do you call this recipe?" id="inputDefault" v-model="recipe.recipeName">
    </div>
    <p></p>
    <div class="form-group">
      <label for="exampleSelect1">Number of Servings&nbsp;</label>
      <select class="form-control" id="exampleSelect1" v-model="recipe.numberOfServings">
        <option>1</option>
        <option>2</option>
        <option>4</option>
        <option>6</option>
        <option>8</option>
        <option>10</option>
      </select>
    </div>
    <div class="form-group">
        <label class="col-form-label" for="inputDefault">Cooking Time&nbsp;</label>
        <input type="text" class="form-control" placeholder="How many minutes does the recipe take to complete? " id="inputDefault" v-model="recipe.cookingTime">
    </div>
    <div class="form-group">
      <label for="exampleSelect1">Level of Difficulty&nbsp;</label>
      <select class="form-control" id="exampleSelect1" v-model="recipe.difficulty">
        <option>Easy</option>
        <option>Intermediate</option>
        <option>Hard</option>
      </select>
    </div>
    <p></p>
    <!-- <div class="form-check">
      <label class="form-check-label">Select Recipe Category&nbsp;</label>
         <input class="form-check-input" type="checkbox" value="" unchecked="">Appetizer
          <input class="form-check-input" type="checkbox" value="" unchecked="">Main Dish
          <input class="form-check-input" type="checkbox" value="" unchecked="">Side Dish
          <input class="form-check-input" type="checkbox" value="" unchecked="">Soup
          <input class="form-check-input" type="checkbox" value="" unchecked="">Dessert
    </div>
    <p></p>
    <div class="form-check">
        <label class="form-check-label">Select Dietary Restrictions if applicable &nbsp;</label>
          <input class="form-check-input" type="checkbox" value="" unchecked="">Vegetarian
          <input class="form-check-input" type="checkbox" value="" unchecked="">Vegan
          <input class="form-check-input" type="checkbox" value="" unchecked="">Gluten-free
          <input class="form-check-input" type="checkbox" value="" unchecked="">Dairy-free
          <input class="form-check-input" type="checkbox" value="" unchecked="">Egg-free
          <input class="form-check-input" type="checkbox" value="" unchecked="">Nut-free
    </div>
    <p></p>
    <div class="form-group">
        <label for="exampleTextarea">Ingredients</label>
        <textarea class="form-control" placeholder="What do you need to make this and how much?" id="exampleTextarea" rows="3"></textarea>
    </div>
    <p></p> -->
    <div class="form-group">
        <label for="exampleTextarea">Directions</label>
        <textarea class="form-control" placeholder="How do you make this recipe?" id="exampleTextarea" rows="3" v-model="recipe.directions"></textarea>
    </div>
    </fieldset>
    
    <button type="submit" id="btnrecipe" class="btn btn-primary btn-lg" v-on:click="saveRecipe()">Save New Recipe</button>
    <div v-if="isCreated">
        <router-link v-bind:to="{name: 'recipes'}"></router-link>
    </div>
    
    </form>
</template>

<script>
import RecipeService from "../services/RecipeService";

export default {
data() {
    return {
      recipe: {
        userId: this.$store.state.user.id,
        recipeId: "",
        recipeName: "",
        directions: "",
        numberOfServings: "",
        // recipeCategoryId: "",
        // dietaryRestrictionId: "",
        cookingTime: "",
        difficulty: "",
        isCreated: false
      }
    };
  },
  methods: {
    saveRecipe() {
      RecipeService.create(this.recipe).then(() => {
        this.$router.push("/recipeList");
        this.isCreated = true;
      })
    },
    cancel() {
      this.$router.push("/recipeList");
    }
  }
}
</script>

<style>

</style>