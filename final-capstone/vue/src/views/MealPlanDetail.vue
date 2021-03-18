<template>
  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Meal Plan Details</h1>
    </div>

    <div class="h2-contain">
      <h2>Use the drop-down menus to select different recipes for this meal plan.</h2>
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
        <tr class="table-light">
          <td v-for="date in dates" v-bind:key="date.id">
            <meal-card v-bind:date="date" meal-name="Breakfast"  />
            <meal-card v-bind:date="date" meal-name="Lunch"  />
            <meal-card v-bind:date="date" meal-name="Dinner"  />
          </td>
        </tr>

        </tbody>
      </table>
      <div class="button-separator">
        <router-link class="btn btn-secondary" v-bind:to="{name: 'meal-plan-detail'}">
          Back to Meal Plans
        </router-link>
<!--        <router-link class="btn btn-secondary" v-bind:to="{name: 'modify-meal-plan'}">-->
<!--          Modify Meal Plan-->
<!--        </router-link>-->
      </div>

    </div>
  </div>
</template>

<script>
import mealPlanService from "../services/MealPlanService";
import recipeService from "../services/RecipeService";
import MealCard from "@/components/MealCard";

export default {
  components: {MealCard},
  data() {
    return {
      mealPlan: {
        userId: "",
        mealPlanId: "",
        mealPlanName: "",
        startDate: ""
      }
    };
  },
  methods: {
    saveMealPlan() {
      const current = this.activeMealPlan;
      const mealPlan = {
        userId: current.userId,
        mealPlanId: current.mealPlanId,
        mealPlanName: current.mealPlanName,
        startDate: current.startDate,
        endDate: current.endDate
      };
      mealPlanService.updateMealPlan(mealPlan.id, mealPlan).then(() => {
        this.$router.push();
      })
    },
    loadRecipes() {
      recipeService.getRecipes().then((response) => {
        // this.meals = response.data;
        this.$store.commit("SET_RECIPES", response.data);
      });
    },
    loadMeals() {
      const mealPlanId = this.$route.params.id;
      mealPlanService.getMealsByMealPlanId(mealPlanId).then((response) => {
        // this.meals = response.data;
        this.$store.commit("SET_MEALS", response.data);
      });
    },
    loadMealPlan() {
      const mealPlanId = this.$route.params.id;
      mealPlanService.getMealPlanById(mealPlanId).then((response) => {
        this.mealPlan = response.data;
        this.loadMeals();
      });
    }
  },
  created() {
    this.loadMealPlan();
    this.loadRecipes();
  },
  computed: {
    dates() {
      const dates = [];
      let date = new Date(this.mealPlan.startDate);
      for (let i = 0; i < 7; i++) {
        const newDate = new Date(this.mealPlan.startDate);
        newDate.setDate(date.getDate() + i)
        dates.push(newDate);
      }
      return dates;
    }
  }
}
</script>

<style>

</style>
