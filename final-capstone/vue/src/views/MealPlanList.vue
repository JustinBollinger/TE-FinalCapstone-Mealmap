<template>
  <div id="mealPlan">
    <h1>My Meal Plans</h1>
    <p></p>
    <img src="../assets/Artboard 5.png" alt="full bag of groceries">

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

ul{
  color:white
}

</style>