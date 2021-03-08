<template>
  <div class="jumbotron">
  <img src="../assets/Artboard 4.png" alt="Meal Map logo"/>
  <p class="lead">Please sign-in to access your account</p>
  <form class="form-signin" @submit.prevent="login">
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <label for="username" class="sr-only">Username </label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only">Password</label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <button class="btn btn-primary btn-lg" v-on:click="login(user.id)">Sign in</button>
      
      <router-link class="btn btn-primary btn-lg" v-bind:to="{ name: 'register' }">Need an account?</router-link>
        

    </form>
 </div>
  
  <!-- <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      
      <img src="../assets/Artboard 4.png" alt="Meal Map logo"/>
      <h2>Please sign-in to access your account.</h2>
      <div
        class="alert alert-danger"
        role="alert"
        v-if="invalidCredentials"
      >Invalid username and password!</div>
      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >Thank you for registering, please sign in.</div>
      <label for="username" class="sr-only">Username </label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <label for="password" class="sr-only">Password</label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <button class="btn btn-lg btn-primary btn-block" v-on:click="login(user.id)">Sign in</button>
      
      <router-link class="btn btn-lg btn-primary btn-block" v-bind:to="{ name: 'register' }">Need an account?</router-link>
        

    </form>
  </div> -->
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then(response => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch(error => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    }
  }
};
</script>

<style>

img {
  align-content: center;
  max-width: 25rem;
}
</style>