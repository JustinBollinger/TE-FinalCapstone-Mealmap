<template>
  <div id="app" class="main-app">

    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
      <a class="navbar-brand" href="#">
        <router-link class="nav-link" href="#" v-bind:to="{ name: 'home'}"><img class="head-logo"
                                                                                :src="require('../public/Artboard 4 copy.png')"/>
        </router-link>
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
              aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarColor01">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'ingredient-list'}">INGREDIENTS</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'recipes' }">RECIPES</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'meal-plan' }">MEAL PLANS</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'grocery-list' }">GROCERY LIST</router-link>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle"
               data-toggle="dropdown"
               href="#"
               role="button"
               aria-haspopup="true"
               aria-expanded="false">
              RECIPES
            </a>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="#" v-bind:to="{ name: 'grocery-list' }">GROCERY LIST</a>
              <a class="dropdown-item" href="#" v-bind:to="{ name: 'recipes' }">RECIPES</a>
              <a class="dropdown-item" href="#" v-bind:to="{ name: 'modify-recipe' }">MODIFY RECIPE</a>
              <a class="dropdown-item" href="#" v-bind:to="{ name: 'recipe-detail' }">Something else here</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Separated link</a>
            </div>
          </li>
        </ul>

        <div id="nav-btns">
          <router-link id="sign-in-btn" type="button" class="btn btn-outline-secondary" href="#" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">
            LOGOUT
          </router-link>
          <router-link id="sign-in-btn" type="button" class="btn btn-outline-secondary" v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">
            Sign in
          </router-link>
          <router-link id="nav-btns2" type="button" class="btn btn-outline-secondary" v-bind:to="{ name: 'register' }" v-if="$store.state.token == ''">
            Create Account
          </router-link>
        </div>
      </div>
    </nav>

    <router-view/>

    <footer>
      <div>mealmap© Copyright 2021</div><div><img class="footer-logo" :src="require('../public/DC hori v2111.png')"/></div> <div>inc.</div>
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

#nav-btns {
  display: flex;
  flex-direction: row;
  justify-content: right;
}

#sign-in-btn {
  margin-right: 10px;
}

body {

}

.navbar {
  /*background: rgba(0, 0, 0, 0.25) !important;*/
border-bottom: white solid .15rem;
  background: linear-gradient(45deg, rgba(237, 28, 36, 1) 0%, rgba(0, 113, 188, 1) 48%, rgba(27, 20, 100, 1) 100%);
}

.footer-logo {
  height: 2rem;
}

footer {
  display: flex;
  justify-content: center;
  align-content: flex-end;
  align-items: center;
  color: #ffffff;
  text-align: center;
  /*background: rgba(0, 0, 0, 0.25) !important;*/

  background: linear-gradient(45deg, rgba(237, 28, 36, 1) 0%, rgba(0, 113, 188, 1) 48%, rgba(27, 20, 100, 1) 100%);
  padding-top: 1rem;
  padding-bottom: 1rem;
  border-top: white solid .15rem;
}

.head-logo {
  /*position: fixed;*/
  color: #fff;
  height: 2.5rem;
}

</style>