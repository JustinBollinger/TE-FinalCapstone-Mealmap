<template>
  <div class="main-contain">

    <div id="horzlogo">
      <img src="../assets/Artboard 4.png" alt="Meal Map logo"/>
    </div>

    <div id="landing-text">
      <p> Welcome to Mealmap!</p>
      <br>
      <p> Please sign-in <br>
        to access your account</p>
    </div>

    <div id="login-form">
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

        <div id="landing-buttons">
          <menu>
            <button id="btnsignin" class="btn btn-primary btn-lg" v-on:click="login(user.id)">Sign in</button>

            <router-link id="btnsignin" class="btn btn-primary btn-lg" v-bind:to="{ name: 'register' }">Need an
              account?
            </router-link>
          </menu>
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


body {
  background-image: url("../../public/rainbow-produce-copy.png"), linear-gradient(rgba(0, 0, 255, 0.75), rgba(255, 255, 0, 0.75));
  background-size: cover;
  background-repeat: no-repeat;
}

#horzlogo{
  display: flex;
  justify-content: center;
}

#landing-text{
  color: white;
  font-family: Roboto, sans-serif;
  font-size: 36pt;
  text-align: center;
  font-weight: bolder;
  display: flex;
  flex-direction: column;
  justify-content: center;
  max-width: 1200px;
}

#login-form{
  display: flex;
  justify-content: center;
  max-width: 1200px;
}

#landing-buttons{
  display: flex;
  flex-direction: row;
  justify-content: space-evenly;
  max-width: 1200px;

}


</style>