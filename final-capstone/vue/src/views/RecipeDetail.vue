<template>

  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Recipe Detail</h1>
    </div>

    <div class="h2-contain signin-container">


      <div class="form-signin max-width800">
        <h3 v-bind:id="recipe.recipeId">{{ recipe.recipeName }}<small class="text-muted" v-bind:id="recipe.recipeId">
          <br>
          <hr>
          {{ recipe.cookingTime }} minutes |&nbsp;
          {{ recipe.numberOfServings }} servings&nbsp;|&nbsp;
          {{ recipe.difficulty }}
          <hr>
        </small></h3>
        <div>
          <p class="lead" v-bind:id="recipe.recipeId">{{ recipe.directions }}</p>
          <hr>
        </div>
        <div class="button-separator">
          <router-link class="btn btn-secondary button-properties" v-bind:to="{name: 'recipes'}">Back to Recipe
            Library
          </router-link>
          <router-link class="btn btn-secondary button-properties" v-bind:to="{name: 'modify-recipe'}">Modify Recipe
          </router-link>
          <!-- <a href="#" class="card-link">Delete Recipe</a> -->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import recipeService from "../services/RecipeService"

export default {
  data() {
    return {
      recipe: {
        userId: "",
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
      const current = this.activeRecipe;
      const recipe = {
        userId: current.userId,
        recipeId: current.recipeId,
        recipeName: current.recipeName,
        directions: current.directions,
        numberOfServings: current.numberOfServings,
        cookingTime: current.cookingTime,
        difficulty: current.difficulty
      };
      recipeService.updateRecipe(recipe.id, recipe).then(() => {
        this.$router.push();
      })
    }
  },
  created() {
    const recipeId = this.$route.params.id;
    recipeService.getRecipeById(recipeId).then((response) => {
      this.recipe = response.data;
    });
  }
}
</script>

<style>

</style>