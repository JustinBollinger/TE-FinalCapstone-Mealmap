<template>
  <div class="jumbotron main-contain" >
      <div class="h1-contain">
          <h1 class="display-4-custom"></h1>
      </div>
      <div class="h2-contain">
          <form v-on:submit.prevent>
              <fieldset>
                <h1>Add New Meal Plan</h1>
                <div class="form-group">
                  <label class="col-form-label" for="inputDefault">Meal Plan Name&nbsp;</label>
                  <input type="text" class="form-control" id="inputDefault" v-model="mealPlan.mealPlanName">
                </div>
                <div class="form-group">
                    <label for="exampleSelect1">Which day are you going to make this recipe?&nbsp;</label>
                    <select class="form-control" id="exampleSelect1" v-model="mealRecipes.dayOfWeek">
                        <option>Sunday</option>
                        <option>Monday</option>
                        <option>Tuesday</option>
                        <option>Wednesday</option>
                        <option>Thursday</option>
                        <option>Friday</option>
                        <option>Saturday</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleSelect1">Which meal is this recipe planned for?&nbsp;</label>
                    <select class="form-control" id="exampleSelect1" v-model="mealRecipes.mealCategory">
                        <option>Breakfast</option>
                        <option>Lunch</option>
                        <option>Dinner</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleSelect1">Which recipe are you planning to make?&nbsp;</label>
                    <select class="form-control" id="exampleSelect1" v-model="mealRecipes.recipeId">
                        <option>TBD</option>
                        <option>Drop down menu of recipes</option>
                    </select>
                    <label for="exampleSelect1">Which other recipe are you planning to make?&nbsp;</label>
                    <select class="form-control" id="exampleSelect1" v-model="mealRecipes.recipeId">
                        <option>TBD</option>
                        <option>Drop down menu of recipes</option>
                    </select>
                    <label for="exampleSelect1">Which other recipe are you planning to make?&nbsp;</label>
                    <select class="form-control" id="exampleSelect1" v-model="mealRecipes.recipeId">
                        <option>TBD</option>
                        <option>Drop down menu of recipes</option>
                    </select>
                </div>
              </fieldset>
            <div class="button-separator">
                <button type="submit" class="btn btn-secondary" v-on:click="saveMealPlan()">Save Meal Plan</button>
                <div v-if="isCreated">
                    <router-link v-bind:to="{name: 'meal-plan'}"></router-link>
                </div>
            </div>
        </form>
      </div>
  </div>
</template>

<script>
import mealPlanService from "../services/MealPlanService";

export default {
data() {
    return {
      mealPlanId: {
        userId: this.$store.state.user.id,
        mealPlanName: "",
        startDate: "",
        endDate: "",
        isCreated: false
      }
    };
  },
  methods: {
    saveMealPlan() {
      mealPlanService.create(this.mealPlan).then(() => {
        this.$router.push("/mealPlan");
        this.isCreated = true;
      })
    },
    cancel() {
      this.$router.push("/mealPlan");
    }
  }
}

</script>

<style>

</style>