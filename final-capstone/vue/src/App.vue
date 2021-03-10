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
  justify-content: space-between;
  border-bottom: solid 2px #2c3e50;
}

#navitem{
  flex-grow: 1;
}

/*template{*/
/*  display: flex;*/
/*}*/

#app {
  font-family: 'Fira Sans', sans-serif;
  font-family: 'Roboto', sans-serif;
  color: #2c3e50;
  max-width: 800px;
  margin: 0 auto;
} 
/* 
#nav {
  padding: 30px;
  text-align: center;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}  */

</style>
