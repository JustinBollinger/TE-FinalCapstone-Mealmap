<template>
  <form v-on:submit.prevent>
    <div class="field">
      <label for="name">Name</label>
      <input type="text" v-model="document.name" />
    </div>
    <div class="field">
      <label for="author">Author</label>
      <input type="text" v-model="document.author" />
    </div>
    <div class="field">
      <label for="content">Content</label>
      <textarea spellcheck="false" v-model="document.content" />
    </div>
    <div class="actions">
      <button type="button" v-on:click="cancel()">Cancel</button>&nbsp;
      <button type="submit" v-on:click="saveRecipe()">Save Recipe</button>
    </div>
  </form>
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
      RecipeService
      .create(this.recipe)
      .then((response) => {
        if(response.status === 201) {
          this.$router.push("/recipeList");
        }
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