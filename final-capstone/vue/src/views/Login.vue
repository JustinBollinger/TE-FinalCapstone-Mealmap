<template>

  <div class="jumbotron" id="main-contain">
    <div class="h1-contain">
      <h1 class="display-4-custom">Sign-in</h1>
    </div>


    <div class="h2-contain signin-container">
        <div id="home-image2"> <img class="signin-logo" src="../../public/assets/Artboard 4.png" alt="Meal Map logo"/></div>
<!--      <p id="instructions"> Please sign-in to access your account</p>-->

      <form class="form-signin" @submit.prevent="login">

        <div
            class="alert alert-danger"
            role="alert"
            v-if="invalidCredentials"
        >Invalid username and password!
        </div>

        <div
            class="alert alert-success"
            role="alert"
            v-if="this.$route.query.registration"
        >Thank you for registering, please sign in.
        </div>

        <div id="username-input">
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
        </div>

        <div id="password-input">
          <label for="password" class="sr-only">Password</label>
          <input
              type="password"
              id="password"
              class="form-control"
              placeholder="Password"
              v-model="user.password"
              required
          />
        </div>

        <div class="button-separator">
          <button class="btn btn-secondary button-properties" v-on:click="login(user.id)">Sign in</button>
          <router-link class="btn btn-secondary button-properties" v-bind:to="{ name: 'register' }">Need an
            account?
          </router-link>
        </div>
      </form>




    </div>



  </div>

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

#home-image2{
  display: flex;
  justify-content: left;
  margin-bottom: 25px;

}

</style>