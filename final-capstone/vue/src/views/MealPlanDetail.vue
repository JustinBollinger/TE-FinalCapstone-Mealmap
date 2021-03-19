<template>
  <div class="jumbotron" id="main-contain">

    <div class="h1-contain">
      <h1 class="display-4-custom">Meal Plan Details</h1>
    </div>

    <div class="h2-contain signin-container">

      <h4><p>Use the drop-down menus to select different recipes for this meal plan.</p></h4>

      <div id="table-contain">

        <div v-for="(date, index) in dates" v-bind:key="date" class="meal-plan-card form-signin2">
          <div class="table-header">
            <div class="table" id="meal-plan-header" scope="col">{{ dayName(index) }}</div>
          </div>
          <meal-card class="breakfast-card meal-plan-card-section text-white" v-bind:date="date" meal-name="Breakfast"/>
          <br>
          <meal-card class="lunch-card meal-plan-card-section" v-bind:date="date" meal-name="Lunch"/>
          <br>
          <meal-card class="dinner-card meal-plan-card-section" v-bind:date="date" meal-name="Dinner"/>
        </div>
      </div>

<!--      <div class="button-separator">-->
<!--        <router-link class="btn btn-secondary button-properties" v-bind:to="{name: 'meal-plan'}">-->
<!--          Back to Meal Plans-->
<!--        </router-link>-->
<!--      </div>-->

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
    },
    dayName(index) {
      const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
      return days[index];
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

#table-contain {
  display: flex;
  flex-wrap: wrap;
  flex-direction: row;
  justify-content: left;


  /*flex-grow: 1;*/
}

#days-of-the-week {
  text-align: center;
}

.table-header {
  display: flex;
  justify-content: center;
  text-align: center;
  font-weight: 800;
  color: #252629;
  font-size: 18pt;
}

.meal-plan-card {
  /*margin: 20px;*/
  /*background: rgba(251, 80, 48, .50);*/
  /*background: #242528;*/
  /*background: rgba(36, 37, 40, 0.5);*/
  background: rgb(245, 245, 245);
  max-width: 250px;

  /*display: flex;*/
  /*justify-content: center;*/
}

.breakfast-card{
  /*color: white!important;*/

  /*background-color: rgba(63, 227, 43, 0.95);*/
}

.lunch-card{
  /*background: rgba(61, 203, 250, .95);*/
}

.dinner-card{
  /*background: rgba(255, 208, 48, .95);*/
}

</style>
