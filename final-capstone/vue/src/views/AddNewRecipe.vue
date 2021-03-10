<template>
    <form>
  <fieldset>
    <legend>Legend</legend>
    <div class="form-group row">
      <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
      <div class="col-sm-10">
        <input type="text" readonly="" class="form-control-plaintext" id="staticEmail" value="email@example.com">
      </div>
    </div>
    <div class="form-group">
      <label for="exampleInputEmail1">Email address</label>
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
      <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
      <label for="exampleSelect1">Example select</label>
      <select class="form-control" id="exampleSelect1">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
      </select>
    </div>
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