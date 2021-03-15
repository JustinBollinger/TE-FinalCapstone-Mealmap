<template>
  <div id="app" class="main-app">

    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
      <a class="navbar-brand" href="#">
        <img class="head-logo" :src="require('../public/Artboard 4 copy.png')"/>
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
              aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarColor01">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Features</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Pricing</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
               aria-expanded="false">Dropdown</a>
            <div class="dropdown-menu">
              <a class="dropdown-item" href="#">Action</a>
              <a class="dropdown-item" href="#">Another action</a>
              <a class="dropdown-item" href="#">Something else here</a>
              <div class="dropdown-divider"></div>
              <a class="dropdown-item" href="#">Separated link</a>
            </div>
          </li>
        </ul>

        <div id="nav-btns">
          <router-link id="nav-btns1" type="button" class="btn btn-outline-secondary" v-bind:to="{ name: 'login' }">
            Sign in
          </router-link>
          <router-link id="nav-btns2" type="button" class="btn btn-outline-secondary"
                       v-bind:to="{ name: 'register' }">create account
          </router-link>
        </div>
      </div>
    </nav>

    <router-view/>

    <footer>
      mealmap© Copyright 2021 <img class="footer-logo" :src="require('../public/DC hori v2111.png')"/> inc.
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

#nav-btns1 {
  margin-right: 10px;
}

body {

}

.navbar {
  background: linear-gradient(45deg, rgba(237, 28, 36, 1) 0%, rgba(0, 113, 188, 1) 48%, rgba(27, 20, 100, 1) 100%);;
}

.footer-logo {
  height: 2rem;
}

footer {
  color: #ffffff;
  text-align: center;
  background: linear-gradient(45deg, rgba(237, 28, 36, 1) 0%, rgba(0, 113, 188, 1) 48%, rgba(27, 20, 100, 1) 100%);;
  padding-top: 1rem;
  padding-bottom: 1rem;
}

.head-logo {
  /*position: fixed;*/
  color: #fff;
  height: 2.5rem;
}

</style>



