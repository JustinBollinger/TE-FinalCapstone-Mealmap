<template>
  <form>
  <fieldset>
    <legend>Add New Recipe</legend>
    <div class="form-group">
        <label class="col-form-label" for="inputDefault">Recipe Name</label>
        <input type="text" class="form-control" placeholder="Default input" id="inputDefault">
    </div>
    <div class="form-group">
      <label for="exampleSelect1">Number of Servings</label>
      <select class="form-control" id="exampleSelect1">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
      </select>
    </div>
    <legend>Select Recipe Category</legend>
    <div class="form-check">
        <label class="form-check-label">
          <input class="form-check-input" type="checkbox" value="" checked="">
          Appetizers
          Mains
        </label>
      </div>
    <div class="form-group">
      <label for="exampleTextarea">Directions</label>
      <textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
    </div>
    </fieldset>
    </form>
   <!-- <div class="add-new-recipe">
   <h1>Add New Recipe</h1>
        <form v-on:submit.prevent>
            <div class="field">
                <label for="recipeName">Recipe Name</label>
                <input type="text" v-model="recipe.recipeName"/>
            </div>
            <div class="field">
                <label for="directions">Directions</label>
                <input type="text" v-model="recipe.directions"/>
            </div>
            <div class="field">
                <label for="numberOfServings">Number of Servings</label>
                <input type="text" v-model="recipe.numberOfServings"/>
            </div>
                        
            <button type="button" v-on:click="cancel()">Cancel</button>&nbsp;
            <button type="submit" v-on:click="saveRecipe()">Save Recipe</button>

        </form>
    </div> -->
</template>

<script>
import RecipeService from "../services/RecipeService";

export default {
data() {
    return {
      recipe: {
        recipeId: "",
        recipeName: "",
        directions: "",
        numberOfServings: "",
        recipeCategoryId: "",
        dietaryRestrictionId: "",
        difficulty: ""
      }
    };
  },
  methods: {
    saveRecipe() {
      RecipeService.create(this.recipe).then((response) => {
        if(response.status === 201) {
          this.$router.push("/");
        }
      })
    },
    cancel() {
      this.$router.push("/");
    }
  }
}
</script>

<style>

</style>