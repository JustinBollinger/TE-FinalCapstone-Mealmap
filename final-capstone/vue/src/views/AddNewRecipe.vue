<template>

  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Add New Recipe</h1>
    </div>

    <div class="h2-contain signin-container">

      <form v-on:submit.prevent class="form-signin">

        <fieldset>
          <div class="form-group">
            <label class="col-form-label" for="inputDefault">Recipe Name&nbsp;</label>
            <input type="text" class="form-control" placeholder="What do you call this recipe?" id="inputDefault"
                   v-model="recipe.recipeName">
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
            <input type="text" class="form-control" placeholder="How many minutes does the recipe take to complete? "
                   id="inputDefault" v-model="recipe.cookingTime">
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

          <div class="form-group">
            <label for="exampleTextarea">Directions</label>
            <textarea class="form-control" placeholder="How do you make this recipe?" id="exampleTextarea" rows="3"
                      v-model="recipe.directions"></textarea>
          </div>

        </fieldset>

        <div class="button-separator">
          <button type="submit" class="btn btn-secondary button-properties" v-on:click="saveRecipe()">Save New Recipe
          </button>
          <div v-if="isCreated">
            <router-link v-bind:to="{name: 'recipes'}"></router-link>
          </div>
        </div>

      </form>

    </div>
  </div>
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
        this.$router.push("/recipeList/");
        this.isCreated = true;
      })
    },
    cancel() {
      this.$router.push("/recipeList/");
    }
  }
}
</script>

<style>

</style>