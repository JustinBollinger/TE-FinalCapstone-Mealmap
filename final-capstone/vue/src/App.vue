<template >
  <div id="app" class="main-app">
    <nav class="main-nav">
      <Burger class="burger">
<!--        <img class="head-logo" :src="require('../public/hamburger_menu.svg')"/>-->
<!--        Menu-->
      </Burger>
      <div class="logo">
        <router-link class="meal-btn" v-bind:to="{ name: 'home' }"><img class="head-logo" :src="require('../public/Artboard 4 copy.png')"/></router-link>
      </div>
      <div>
        <button class="btn btn-primary btn-lg" v-on:click="login(user.id)">Sign in</button>
        <router-link id="btnsignin" class="btn btn-primary btn-lg" v-bind:to="{ name: 'register' }">Need an
          account?
        </router-link>
      </div>
    </nav>
    <Sidebar>
      <ul id="nav" class="sidebar-panel-nav">
        <li>
          <router-link class="meal-btn" v-bind:to="{ name: 'home' }">HOME</router-link>
        </li>
        <li>
          <router-link class="meal-btn" v-bind:to="{ name: 'ingredient-list'}">INGREDIENTS</router-link>
        </li>
        <li>
          <router-link class="meal-btn" v-bind:to="{ name: 'recipes' }">RECIPES</router-link>
        </li>
        <li>
          <router-link class="meal-btn" v-bind:to="{ name: 'meal-plan' }">MEAL PLANS</router-link>
        </li>
        <li>
          <router-link class="meal-btn" v-bind:to="{ name: 'grocery-list' }">GROCERY LIST</router-link>
        </li>
        <li>
          <router-link class="meal-btn" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">LOGOUT
          </router-link>
        </li>
      </ul>
    </Sidebar>
    <router-view/>
    <footer>
      Mealmap©; Copyright 2021 <img class="footer-logo" :src="require('../public/DC hori v2111.png')"/> inc.
    </footer>
  </div>
</template>

<script>
import Burger from './components/Menu/Burger.vue';
import Sidebar from './components/Menu/Sidebar.vue';

export default {
  name: 'app',
  components: {
    Burger,
    Sidebar
  }
}
</script>

<style>

.main-app{
  display: flex;
  min-height: 100vh;
  flex-direction: column;
}

html {
  height: 100%;
  overflow: hidden;
}

body {
  position: relative;
  min-height: 100vh;
  overflow: scroll;
  border: 0;
  margin: 0;
  padding: 0;
  height: 100%;
  /*background: linear-gradient(45deg, rgba(237, 28, 36, 1) 0%, rgba(0, 113, 188, 1) 48%, rgba(27, 20, 100, 1) 100%);*/
}

.main-nav {
  display: flex;
  justify-content: left;
  flex-grow: 1;
  padding: 0.5rem 0.8rem;
  /*background: #343A40;*/
  background: linear-gradient(45deg, rgba(237, 28, 36, 1) 0%, rgba(0, 113, 188, 1) 48%, rgba(27, 20, 100, 1) 100%);;

}
.burger{
  /*flex-grow: 1;*/
}

.logo{
  display: flex;
  justify-content: center;
  flex-grow: 1;
}

ul.sidebar-panel-nav {
  list-style-type: none;
}

ul.sidebar-panel-nav > li > a {
  color: #011c35;
  text-decoration: none;
  font-size: 1.5rem;
  font-weight: bolder;
  display: block;
  padding-bottom: 0.5em;
}

.footer-logo {
  height: 2rem;
}

#app-footer {
  color: white;
  opacity: 0.5;
  background: yellow;


}

footer {
  color: #ffffff;
  text-align: center;
  align-content: center;
  align-items: center;
  /*background: #343A40;*/
  background: linear-gradient(45deg, rgba(237, 28, 36, 1) 0%, rgba(0, 113, 188, 1) 48%, rgba(27, 20, 100, 1) 100%);;
  position: center;
  margin-top: 5rem;
  padding-top: 1rem;
  padding-bottom: 1rem;


}

.meal-btn {
  color: white;
  font-weight: bold;
}

.head-logo {
  /*position: fixed;*/
  color: #fff;
  height: 3rem;
}

#btnsignin {
  height: 3rem;
}

#app {
}

</style>



