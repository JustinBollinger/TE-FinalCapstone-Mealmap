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
            <meal-card v-bind:date="date" meal-name="Breakfast" v-bind:meal="mealByDate(date, 'Breakfast')" />
            <meal-card v-bind:date="date" meal-name="Lunch" v-bind:meal="mealByDate(date,'Lunch')" />
            <meal-card v-bind:date="date" meal-name="Dinner" v-bind:meal="mealByDate(date,'Dinner')" />
          </td>
        </tr>

        </tbody>
      </table>
      <div class="button-separator">
        <router-link class="btn btn-secondary" v-bind:to="{name: 'meal-plan'}">
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
import mealPlanService from "../services/MealPlanService"
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
      },
      meals: [
        {
          date: new Date("3/14/2021"),
          mealName: "Breakfast",
          recipes: [
            { id: 1, name: "pancakes"},
            { id: 2, name: "french toast"},
          ]
        },
        {
          date: new Date('3/16/2021'),
          mealName: "Lunch",
          recipes: [
            { id: 3, name: "Burger"},
            { id: 4, name: "French Fries"},
          ]
        }
      ]
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
    mealByDate(date, mealName){
      return this.meals.filter(meal => meal.date.getDate() == date.getDate() && meal.mealName == mealName)[0];
    }
  },
  created() {
    const mealPlanId = this.$route.params.id;
    mealPlanService.getMealPlanById(mealPlanId).then((response) => {
      console.log(response);
      // i'm just commenting this out so that I can use sample data
      //this.mealPlan = response.data;
    });
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
    },
  }
}
</script>

<style>

</style>
