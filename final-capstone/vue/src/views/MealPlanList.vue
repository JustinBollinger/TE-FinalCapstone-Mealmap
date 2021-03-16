<template>

  <div class="jumbotron" id="main-contain">
    <div class="h1-contain">
      <h1 class="display-4-custom">My Meal PLans</h1>
    </div>

    <div class="mealplan-list">
      <ul>
        <li v-for="mealPlan in mealPlans" v-bind:key="mealPlan.mealPlanId">
          <router-link v-bind:to="'mealPlanDetail/' + mealPlan.mealPlanId">
            {{mealPlan.mealPlanName}}&nbsp;|&nbsp;
            {{mealPlan.startDate}} -&nbsp;
            {{mealPlan.endDate}} &nbsp;|&nbsp;
          </router-link>
        </li>
      </ul>
      <router-link id="btnmealplan" class="btn btn-primary btn-lg" v-bind:to="{name: 'meal-plan'}">Add New Meal Plan</router-link>
    </div>
  </div>

</template>

<script>
import mealPlanService from "../services/MealPlanService"

export default {
  data() {
    return {
      mealPlans: []
    };
  },
  created() {
    mealPlanService.getMealPlans().then((response) => {
      this.mealPlans = response.data;
    });
  }
}
</script>

<style>

ul {
  color: white
}

</style>