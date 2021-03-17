<template>
  <div class="card">
    <div class="card-body">
      <h4 class="card-title">{{mealName}}</h4>
      <div v-if="meal">
        <ul>
          <li v-for="recipe in meal.recipes" v-bind:key="recipe.id">
            <router-link v-bind:to="{name: 'recipe-detail', params: {id: recipe.id}}" >{{recipe.name}}</router-link>
          </li>
        </ul>
      </div>
      <a href="#" v-on:click.prevent="isUpdating = true"></a>
      <form v-on:submit.prevent="addMeal" v-if="isAdding">
        <select>
          <option value="1">Choose recipe</option>
        </select>
        <button>Add</button>
      </form>
      <a href="#" v-on:click.prevent="isAdding = true">Add Recipe to Meal</a>
      <form v-on:submit.prevent="addMeal" v-if="isAdding">
        <select>
          <option value="1">Choose recipe</option>
        </select>
        <button>Add</button>
      </form>

    </div>
  </div>
</template>

<script>
export default {
  name: "MealCard",
  props: {
    meal: {},
    mealName: {},
    date: {}
  },
  data() {
    return {
      isAdding: false
    }
  },
  methods: {
    addMeal() {
      // add meal to database
      // update store with the new meal
      this.isAdding = false;
    }
  }
}
</script>

<style scoped>

</style>
