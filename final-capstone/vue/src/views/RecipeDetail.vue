<template>
  <div class="card mb-3">
  <h3 class="card-header">Recipe Detail</h3>
  <div class="card-body">
    <h5 class="card-title" v-bind:id="recipe.id">{{recipe.recipeName}}</h5>
  </div>
  
  <ul class="list-group list-group-flush">
    <li class="list-group-item" v-bind:key="recipe.id">
            {{recipe.recipeName}}&nbsp;|&nbsp;
            {{recipe.cookingTime}} min&nbsp;|&nbsp;
            {{recipe.numberOfServings}} servings&nbsp;|&nbsp;
            {{recipe.difficulty}}&nbsp;|&nbsp;
            <!-- {{recipe.dietaryRestriction-id}}&nbsp;|nbsp; -->
    </li>
  </ul>
  
  <div class="card-body">
    <p class="card-text">Recipe directions to display here</p>
  </div>
  
  <div class="card-body">
    <a href="#" class="card-link">Back to Recipe Library</a>
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
        userId: this.$store.state.user.id,
        recipeId: this.$store.state.recipe.id,
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
      const current = this.$store.state.activeRecipe;
      const recipe = {
        userId: current.userId,
        recipeId: this.recipeId,
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
    recipeService.getRecipes().then((response) => {
      this.recipes = response.data;
    });
  }
}
</script>

<style>

</style>