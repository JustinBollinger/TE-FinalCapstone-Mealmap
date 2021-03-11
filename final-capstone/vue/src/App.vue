<template>
  <div id="app">
    <div id="nav">
      <router-link class="btn" v-bind:to="{ name: 'home' }">Home</router-link>
      <router-link class="btn" v-bind:to="{ name: 'ingredient-list'}">Ingredients</router-link>
      <router-link class="btn" v-bind:to="{ name: 'recipes' }">Recipes</router-link>
      <router-link class="btn" v-bind:to="{ name: 'meal-plan' }">Meal Plans</router-link>
      <router-link class="btn" v-bind:to="{ name: 'grocery-list' }">Grocery List</router-link>
      <router-link class="btn" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<style>

#nav {
  display: flex;
  justify-content: right;
  background: #4D4D4D;
  border-bottom: solid 0.25rem #2c3e50;
  color: white !important;

}

#app {

  font-family: 'Fira Sans', sans-serif;
  font-family: 'Roboto', sans-serif;
  max-width: 1920px;
}

</style>
