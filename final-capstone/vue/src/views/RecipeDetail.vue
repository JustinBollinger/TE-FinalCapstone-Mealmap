<template>
  <div class="card mb-3">
    <h3 class="card-header">Recipe Detail</h3>
    <div class="card-body">
    <h5 class="card-title" v-bind:id="recipe.recipeId">{{recipe.recipeName}}</h5>
    </div>
  
  <ul class="list-group list-group-flush">
    <li class="list-group-item" v-bind:id="recipe.recipeId">
            {{recipe.recipeName}}&nbsp;|&nbsp;
            {{recipe.cookingTime}} min&nbsp;|&nbsp;
            {{recipe.numberOfServings}} servings&nbsp;|&nbsp;
            {{recipe.difficulty}}&nbsp;|&nbsp;
            <!-- {{recipe.dietaryRestriction-id}}&nbsp;|nbsp; -->
    </li>
  </ul>
  
  <div class="card-body">
    <p class="card-text" v-bind:id="recipe.recipeId">{{recipe.directions}}</p>
  </div>
  
  <div class="card-body">
    <router-link id="btnrecipe" class="btn btn-primary btn-lg" v-bind:to="{name: 'recipe-list'}">Back to Recipe Library</router-link>
    <a href="#" class="card-link">Modify Recipe</a>
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
      recipeService.update(recipe.Id, recipe).then(() => {
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