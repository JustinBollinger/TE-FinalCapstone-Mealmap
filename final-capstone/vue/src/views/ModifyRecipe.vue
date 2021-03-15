<template>
  <form v-on:submit.prevent>
    <fieldset>
    <h3>Modify Recipe</h3>
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

    <div class="form-group">
        <label for="exampleTextarea">Ingredients</label>
        <textarea class="form-control" placeholder="What do you need to make this and how much?" id="exampleTextarea" rows="3"></textarea>
    </div>
    <p></p>
    <div class="form-group">
        <label for="exampleTextarea">Directions</label>
        <textarea class="form-control" placeholder="How do you make this recipe?" id="exampleTextarea" rows="3" v-model="recipe.directions"></textarea>
    </div>
    </fieldset>

    <router-link id="btnrecipe" class="btn btn-primary btn-lg" v-bind:to="{name: 'recipe-detail'}">Save Modified Recipe</router-link>
    
   <!-- <button type="submit" id="btnrecipe" class="btn btn-primary btn-lg" v-on:click="updateRecipe()">Save Modified Recipe</button>
    <div v-if="isModified">
        <router-link v-bind:to="{name: 'recipe-detail'}"></router-link>
    </div> -->
   <router-link id="btnrecipe" class="btn btn-primary btn-lg" v-bind:to="{name: 'recipes'}">Back to Recipe Library</router-link> 

  </form>  
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
        isModified: false
      }
    };
  },
  methods: {
    updateRecipe() {
      // const current = this.activeRecipe;
      const recipe = {
        userId: this.userId,
        recipeId: this.recipeId,
        recipeName: this.recipeName,
        directions: this.directions,
        numberOfServings: this.numberOfServings,
        cookingTime: this.cookingTime,
        difficulty: this.difficulty,
      };
      recipeService.updateRecipe(this.recipeId, recipe).then(() => {
            this.$router.push({name: 'modify-recipe', params: {recipeId: this.recipe}});
        })
    }  
    //   recipeService.updateRecipe(recipe.id, recipe).then(() => {
    //     this.$router.push();
    //   })
    },
  
  created() {
    const recipeId = this.$route.params.id;
    recipeService.getRecipeById(recipeId).then((response) => {
      this.recipe = response.data;
    });
  }
}
</script>