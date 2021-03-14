<template>
<!--  <div id="app">-->


<!--    hamburger test start -->
    <div id="app">
      <nav class="main-nav">
        <div class="logo">
          <img class="head-logo" :src="require('../public/Artboard 4 copy.png')"/>
        </div>
        <Burger></Burger>
      </nav>

      <Sidebar>

        <ul id="nav" class="sidebar-panel-nav">
          <li><router-link class="meal-btn" v-bind:to="{ name: 'home' }">HOME</router-link></li>
          <li><router-link class="meal-btn" v-bind:to="{ name: 'ingredient-list'}">INGREDIENTS</router-link></li>
          <li><router-link class="meal-btn" v-bind:to="{ name: 'recipes' }">RECIPES</router-link></li>
          <li> <router-link class="meal-btn" v-bind:to="{ name: 'meal-plan' }">MEAL PLANS</router-link></li>
          <li> <router-link class="meal-btn" v-bind:to="{ name: 'grocery-list' }">GROCERY LIST</router-link></li>
          <li> <router-link class="meal-btn" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">LOGOUT
          </router-link></li>
        </ul>
      </Sidebar>

      <router-view/>
      <mdb-footer id="app-footer">
        <div class="footer-copyright text-center py-3">
          <mdb-container fluid>
            Mealmap&copy; Copyright 2021 <img class="footer-logo" :src="require('../public/DC hori v2111.png')"/> inc.
          </mdb-container>
        </div>
      </mdb-footer>

    </div>
<!--    hamburger test end -->


<!--    <div id="nav">-->
<!--      <div id="left-panel">-->
<!--          <img class="head-logo" :src="require('../public/Artboard 4 copy.png')"/>-->
<!--      </div>-->
<!--      <div id="right-panel">-->
<!--        <router-link class="meal-btn" v-bind:to="{ name: 'home' }">HOME</router-link>-->
<!--        <router-link class="meal-btn" v-bind:to="{ name: 'ingredient-list'}">INGREDIENTS</router-link>-->
<!--        <router-link class="meal-btn" v-bind:to="{ name: 'recipes' }">RECIPES</router-link>-->
<!--        <router-link class="meal-btn" v-bind:to="{ name: 'meal-plan' }">MEAL PLANS</router-link>-->
<!--        <router-link class="meal-btn" v-bind:to="{ name: 'grocery-list' }">GROCERY LIST</router-link>-->
<!--        <router-link class="meal-btn" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">LOGOUT-->
<!--        </router-link>-->
<!--      </div>-->
<!--      <div id="blank-right">-->

<!--      </div>-->
<!--    </div>-->
<!--    <router-view/>-->
    <!-- Footer -->
<!--    <mdb-footer id="app-footer">-->
<!--      <div class="footer-copyright text-center py-3">-->
<!--        <mdb-container fluid>-->
<!--          Mealmap&copy; Copyright 2021 <img class="footer-logo" :src="require('../public/DC hori v2111.png')"/> inc.-->
<!--        </mdb-container>-->
<!--      </div>-->
<!--    </mdb-footer>-->
    <!-- Footer -->
<!--  </div>-->

</template>

<!--hamburger test start-->
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
<!--hamburger tet end -->

<style>

#sidebar-logo{
  height: 3rem;
  margin-bottom: 50px;
}

/*hamburger test start*/
html {
  height: 100%;
  overflow:hidden;
}

body {
  border: 0; margin: 0; padding: 0;
  font-family: 'Lato';
  height: 100%;
  /*background: rgb(101,31,87);*/
  background: #343A40;
  /*background: linear-gradient(45deg, rgba(237,28,36,1) 0%, rgba(0,113,188,1) 48%, rgba(27,20,100,1) 100%);*/
  /*background: linear-gradient(45deg, rgba(101,31,87,1) 0%, rgba(225,113,87,1) 48%, rgba(249,248,113,1) 100%);*/
}

.logo {
  /*position: absolute;*/
  align-self: center;
  color: #fff;
  font-weight: bold;
  font-family: 'Lato'
}

.main-nav {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 0.8rem;
}

ul.sidebar-panel-nav {
  list-style-type: none;
}

ul.sidebar-panel-nav > li > a {
  color: #011c35;
  text-decoration: none;
  font-size: 1.5rem;
  font-family: Roboto, sans-serif;
  font-weight: bolder;
  display: block;
  padding-bottom: 0.5em;
}
/*hamburger test end*/

footer{
  background-color: #1d9ce5;
}

.footer-logo{
  height: 2rem;
}

/*#nav {*/
/*  display: flex;*/
/*}*/

#app-footer{
  color: white;
  opacity: 0.5;
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
  /*position: absolute;*/
  z-index: 2;
  height: 3rem;
  margin-top: 10px;
  margin-left: 50px;
  margin-bottom: 10px;
}

#app {
  font-family: 'Roboto', sans-serif;
}


</style>



