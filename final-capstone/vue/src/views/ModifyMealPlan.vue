<template>
  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Meal Plan Details</h1>
    </div>

    <div class="h2-contain">
      <form v-on: submit.prevent>

      <table class="table">
        <thead>
        <tr>
          <th scope="col">Sunday</th>
          <th scope="col">Monday</th>
          <th scope="col">Tuesday</th>
          <th scope="col">Wednesday</th>
          <th scope="col">Thursday</th>
          <th scope="col">Friday</th>
          <th scope="col">Saturday</th>
        </tr>
        </thead>
        <tbody>
            <fieldset>
        <tr class="table-light">
          <td>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Breakfast</h4>
                <div class="form-group">
                    <select class="custom-select" id="selectedRecipe" v-model="recipe.recipeName">
                        <option selected="">Choose a Recipe</option>
                        <option value="1">{{recipe.recipeName}}</option>
                        <option value="2">Two</option>
                        <option value="3">Three</option>
                    </select>
                </div> 
                <div class="form-group">
                    <select class="custom-select">
                        <option selected="">Choose a Recipe</option>
                        <option value="1">One</option>
                        <option value="2">Two</option>
                        <option value="3">Three</option>
                    </select>
                </div> 
                <div class="form-group">
                    <select class="custom-select">
                        <option selected="">Choose a Recipe</option>
                        <option value="1">One</option>
                        <option value="2">Two</option>
                        <option value="3">Three</option>
                    </select>
                </div> 
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Lunch</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Dinner</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
          </td>
          <td>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Breakfast</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Lunch</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Dinner</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
          </td>
          <td>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Breakfast</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Lunch</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Dinner</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
          </td>
          <td>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Breakfast</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Lunch</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Dinner</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
          </td>
          <td>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Breakfast</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Lunch</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Dinner</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
          </td>
          <td>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Breakfast</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Lunch</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Dinner</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
          </td>
          <td>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Breakfast</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Lunch</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
            <div class="card">
              <div class="card-body">
                <h4 class="card-title">Dinner</h4>
                <a href="#" class="card-link">Link to Recipe 1</a>
                <a href="#" class="card-link">Link to Recipe 2</a>
              </div>
            </div>
          </td>
        </tr>
            </fieldset>
        </tbody>
      </table>
      <router-link class="btn btn-secondary" v-bind:to="{name: 'meal-plan'}">Back to Meal Plans
          </router-link>
      <router-link class="btn btn-secondary" v-bind:to="{name: 'modify-meal-plan'}">Modify Meal Plan
      </router-link>
      </form>
    </div>
  </div>
</template>

<script>
import mealPlanService from "../services/MealPlanService"
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
      }
    };
  },
  methods: {
    updateMealPlan() {
      const mealPlanId = this.$route.params.id;
      mealPlanService.updateRecipe(mealPlanId, this.mealPlan).then(() => {
        this.$router.push({name: 'meal-plan-detail', params: {mealPlan: mealPlanId}});
      })
    }
  },

  created() {
    const mealPlanId = this.$route.params.id;
    mealPlanService.getMealPlanById(mealPlanId).then((response) => {
      this.mealPlan = response.data;
    });
  }
}

</script>


<style>

</style>