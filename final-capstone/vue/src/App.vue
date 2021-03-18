<template>
  <div id="app" class="main-app">

    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
      <a class="navbar-brand" href="#">
        <router-link href="#" v-bind:to="{ name: 'home'}">
          <img class="head-logo" :src="require('../public/assets/Artboard 4 copy.png')"/>
        </router-link>
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
              aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarColor01">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'home'}">HOME</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'ingredient-list'}">INGREDIENTS</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'recipes' }">RECIPES</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" href="#" v-bind:to="{ name: 'meal-plan-detail',params:{id:1} }">MEAL PLAN</router-link>
          </li>
<!--          GROCERY LIST LINK IF EVER NEEDED     -->
<!--          <li class="nav-item">-->
<!--            <router-link class="nav-link" href="#" v-bind:to="{ name: 'grocery-list' }">GROCERY LIST</router-link>-->
<!--          </li>-->
        </ul>

        <div id="nav-btns">
          <router-link id="sign-in-btn" type="button" class="btn btn-outline-secondary" href="#"
                       v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">
            LOGOUT
          </router-link>
          <router-link id="sign-in-btn" type="button" class="btn btn-outline-secondary" v-bind:to="{ name: 'login' }"
                       v-if="$store.state.token == ''">
            SIGN IN
          </router-link>
          <router-link id="nav-btns2" type="button" class="btn btn-outline-secondary" v-bind:to="{ name: 'register' }"
                       v-if="$store.state.token == ''">
            CREATE ACCOUNT
          </router-link>
        </div>
      </div>
    </nav>

    <router-view/>

    <footer class="fixed-bottom">
      <div>mealmap© Copyright 2021 &nbsp</div>
      <div><img class="footer-logo" :src="require('../public/assets/DC hori v2111.png')"/></div>
      <div>&nbsp inc.</div>
    </footer>
  </div>
</template>

<script>


</script>

<style>



</style>