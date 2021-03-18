<template>
  <div class="card">
    <div class="card-body">
      <h4 class="card-title">{{mealName}}</h4>
      <div v-if="meal()">
        <ul>
          <li v-for="recipe in meal().recipes" v-bind:key="recipe.recipeId">
            <router-link v-bind:to="{name: 'recipe-detail', params: {id: recipe.recipeId}}" >{{recipe.recipeName}}</router-link>
          </li>
        </ul>
      </div>
      <a href="#" v-on:click.prevent="isUpdating = true"></a>
      <form v-on:submit.prevent="addMeal" v-if="isAdding">
        <select v-model="recipeId">
          <option v-for="recipe in recipes" v-bind:key="recipe.recipeId" v-bind:value="recipe.recipeId">{{recipe.recipeName}}</option>
        </select>
        <button>Add</button>
      </form>
      <a href="#" v-on:click.prevent="isAdding = true">Add Recipe to Meal</a>

    </div>
  </div>
</template>

<script>
import mealPlanService from "@/services/MealPlanService";

export default {
  name: "MealCard",
  props: {
    mealName: {},
    date: {},
  },
  data() {
    return {
      isAdding: false,
      recipeId: {}
    }
  },
  computed: {
    recipes() {
      return this.$store.state.recipes;
    }
  },
  methods: {
    addMeal() {
      // add meal to database
      const meal = {
        mealPlanId: this.$route.params.id,
        mealDate: this.date,
        mealCategory: this.mealName,
        recipeId: this.recipeId
      };

      //call a meal service and add the
      mealPlanService.addRecipe(meal).then(() => {
        this.loadMeals();
      })

      this.isAdding = false;
    },
    loadMeals() {
      const mealPlanId = this.$route.params.id;
      mealPlanService.getMealsByMealPlanId(mealPlanId).then((response) => {
        // this.meals = response.data;
        this.$store.commit("SET_MEALS", response.data);
      });
    },
    meal() {
      // find a single meal at the specified date

      const date = this.date;
      const mealName = this.mealName;
      const meal = this.$store.state.meals.filter(meal => {
        const mealDate = new Date(meal.mealDate);
        const compareDate = new Date(date);
        return mealDate.getDate() === compareDate.getDate() && meal.mealCategory === mealName;
      })[0];

      return meal;
    }
  }
}
</script>

<style scoped>

</style>
