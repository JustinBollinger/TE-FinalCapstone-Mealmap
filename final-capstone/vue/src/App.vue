<template>
  <div id="app">
    <div id="nav">
      <div id="left-panel">
          <img class="head-logo" :src="require('../public/Artboard 4 copy.png')"/>
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
    <!-- Footer -->
    <mdb-footer id="app-footer">
<!--      <mdb-container class="text-left">-->
<!--        <mdb-row>-->
<!--          <mdb-col sm="6">-->
<!--            <h5 class="title">Footer Content</h5>-->
<!--            <p>Here you can use rows and columns here to organize your footer content.</p>-->
<!--          </mdb-col>-->
<!--          <mdb-col sm="6">-->
<!--            <h5 class="title">Links</h5>-->
<!--            <ul>-->
<!--              <li class="list-unstyled"><a href="#!">Link 1</a></li>-->
<!--              <li class="list-unstyled"><a href="#!">Link 2</a></li>-->
<!--              <li class="list-unstyled"><a href="#!">Link 3</a></li>-->
<!--              <li class="list-unstyled"><a href="#!">Link 4</a></li>-->
<!--            </ul>-->
<!--          </mdb-col>-->
<!--        </mdb-row>-->
<!--      </mdb-container>-->
      <div class="footer-copyright text-center py-3">
        <mdb-container fluid>
          <img class="footer-logo" :src="require('../public/DC hori v2111.png')"   />
          &copy;    Copyright 2021 DataChef Inc.
        </mdb-container>
      </div>
    </mdb-footer>
    <!-- Footer -->
  </div>

</template>

<style>

footer{
  background-color: #1d9ce5;
}

.footer-logo{
  height: 2rem;
}

#nav {
  display: flex;
}

#app-footer{
  color: white;
  opacity: 0.5;
  background-color: #343a40;
}

#left-panel {
  display: flex;
  justify-content: left;
  flex-grow: 2;
  background: rgba(77, 77, 77, 0.50);
}

#right-panel {
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  flex-grow: 1;
  background: rgba(77, 77, 77, 0.50);
  /*border-bottom: solid 0.25rem #2c3e50;*/
}

#blank-right{
  display: flex;
  justify-content: right;
  flex-grow: 0.25;
  background: rgba(77, 77, 77, 0.50);
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
