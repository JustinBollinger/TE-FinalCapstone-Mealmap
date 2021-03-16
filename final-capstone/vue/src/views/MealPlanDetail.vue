<template>
  <table class="table table-hover">
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
      <td>Breakfast</td>
      <td>Breakfast</td>
      <td>Breakfast</td>
      <td>Breakfast</td>
      <td>Breakfast</td>
      <td>Breakfast</td>
      <td>Breakfast</td>
    </tr>
    <tr class="table-light">
      <td>Lunch</td>
      <td>Lunch</td>
      <td>Lunch</td>
      <td>Lunch</td>
      <td>Lunch</td>
      <td>Lunch</td>
      <td>Lunch</td>
    </tr>
     <tr class="table-light">
      <td>Dinner</td>
      <td>Dinner</td>
      <td>Dinner</td>
      <td>Dinner</td>
      <td>Dinner</td>
      <td>Dinner</td>
      <td>Dinner</td>
    </tr>
  </tbody> 
  </table> 
</template>

<script>
import mealPlanService from "../services/MealPlanService"

export default {
data() {
    return {
      mealPlan: {
        userId: "",
        mealPlanId: "",
        mealPlanName: "",
        startDate: "",
        endDate: ""
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
th.scope {

}
</style>