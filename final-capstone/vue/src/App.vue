<template>
  <div id="app">
    <div id="nav">
      <div id="left-panel">
        <v-toolbar id="head-logo">
          <img class="head-logo" :src="require('../public/Artboard 4 copy.png')"/>
        </v-toolbar>
      </div>
      <div id="right-panel">
        <router-link class="meal-btn" v-bind:to="{ name: 'home' }">HOME</router-link>
        <router-link class="meal-btn" v-bind:to="{ name: 'ingredient-list'}">INGREDIENTS</router-link>
        <router-link class="meal-btn" v-bind:to="{ name: 'recipes' }">RECIPES</router-link>
        <router-link class="meal-btn" v-bind:to="{ name: 'meal-plan' }">MEAL PLANS</router-link>
        <router-link class="meal-btn" v-bind:to="{ name: 'grocery-list' }">GROCERY LIST</router-link>
        <router-link class="meal-btn" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">LOGOUT
        </router-link>
      </div>
      <div id="blank-right">

      </div>
    </div>
    <router-view/>
  </div>
</template>

<style>

#nav {
  display: flex;
}

#left-panel {
  display: flex;
  justify-content: left;
  flex-grow: 2;
  background: rgba(77, 77, 77, 0.75);
}

#right-panel {
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  flex-grow: 1;
  background: rgba(77, 77, 77, 0.75);
  /*border-bottom: solid 0.25rem #2c3e50;*/
}

#blank-right{
  display: flex;
  justify-content: right;
  flex-grow: 0.25;
  background: rgba(77, 77, 77, 0.75);
}

.meal-btn {
  color: white;
  font-weight: bold;
  font-family: Roboto, sans-serif;
}

.head-logo {
  height: 3rem;
  margin-top: 10px;
  margin-left: 50px;
  margin-bottom: 10px;
}

#app {
  font-family: 'Roboto', sans-serif;
}

</style>
