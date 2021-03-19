<template>

  <div class="jumbotron" id="main-contain">
    <div class="h1-contain">
      <h1 class="display-4-custom">Meal Plans</h1>
    </div>

    <div class="h2-contain">

      <div class="mealplan-list">
        <div id="baby">
          <img id="baby2" src="../../public/assets/babygif.gif">
        </div>
<!--        <ul>-->
<!--          <li v-for="mealPlan in mealPlans" v-bind:key="mealPlan.mealPlanId">-->
<!--            <router-link v-bind:to="'mealPlanDetail/' + mealPlan.mealPlanId">-->
<!--              {{ mealPlan.mealPlanName }}&nbsp;|&nbsp;-->
<!--              {{ mealPlan.startDate }} -&nbsp;-->
<!--            </router-link>-->
<!--          </li>-->
<!--        </ul>-->
      </div>
<!--        <div class="button-separator">-->
<!--          <router-link class="btn btn-secondary button-properties" v-bind:to="{name: 'add-meal-plan'}">Add New Meal Plan</router-link>-->
<!--        </div>-->

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

#baby{
  display: flex;
  justify-content: center;

}

#baby2{
  border-radius: 15rem;
}

</style>