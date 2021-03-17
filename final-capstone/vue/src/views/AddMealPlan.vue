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
                <div class="form-group">
                    <label for="exampleSelect1">Number of Servings&nbsp;</label>
                    <select class="form-control" id="exampleSelect1" v-model="recipe.numberOfServings">
                        <option>1</option>
                        <option>2</option>
                        <option>4</option>
                        <option>6</option>
                        <option>8</option>
                        <option>10</option>
                    </select>
                </div>
                <div class="form-group">
                    <label class="col-form-label" for="inputDefault">Cooking Time&nbsp;</label>
                    <input type="text" class="form-control" placeholder="How many minutes does the recipe take to complete? " id="inputDefault" v-model="recipe.cookingTime">
                    </div>
                <div class="form-group">
                    <label for="exampleSelect1">Level of Difficulty&nbsp;</label>
                    <select class="form-control" id="exampleSelect1" v-model="recipe.difficulty">
                        <option>Easy</option>
                        <option>Intermediate</option>
                        <option>Hard</option>
                    </select>
                </div>
                <p></p>
                </div>
              </fieldset>

          </form>
      </div>
  </div>
</template>

<script>
export default {

}
</script>

<style>

</style>