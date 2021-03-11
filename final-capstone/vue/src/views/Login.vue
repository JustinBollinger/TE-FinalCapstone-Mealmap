<template>
  <div class="main-contain">
    <div id="horzlogo">
      <img src="../assets/Artboard 4.png" alt="Meal Map logo"/>
    </div>
    <div id="heading">
      <h1>Welcome to Mealmap!</h1>
      <h2>Please sign-in to access your account</h2>

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
          <menu>
            <button id="btnsignin" class="btn btn-primary btn-lg" v-on:click="login(user.id)">Sign in</button>

            <router-link id="btnsignin" class="btn btn-primary btn-lg" v-bind:to="{ name: 'register' }">Need an account?
            </router-link>
          </menu>
        </form>
      </div>
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

#login-form {
  display: flex;
  justify-content: center;
  flex-direction: column;
  margin: 75px;
  max-width: 400px;
}

#login-buttons {
  display: flex;
  flex-direction: column;
}

#horzlogo {
  display: flex;
  justify-content: left;
  margin-left: 50px;
  margin-top: 50px;
}

#heading {
  color: black;
  background: linear-gradient(rgba(0, 0, 255, 0.6), rgba(255, 255, 0, 0.6));
  /*background: rgba(255, 255, 255, 0.5);*/
  display: flex;
  flex-direction: column;
  justify-content: center;

  font-size: 36pt !important;
  margin: 75px;
  text-align: center;
  border-radius: 5rem;
  max-width: 40rem;
}

body {
  background-image: url("../assets/rainbow-produce.jpg");
  background-size: cover;
  background-repeat: no-repeat;
}

.main-contain {

}

menu {
  display: flex;
  justify-content: space-between;
}

#btnsignin {
  flex-grow: 1;
  margin-right: 5rem;

  /*background-color: #1d2124;*/
}

.lead {
  justify-content: center;
}


img {
  justify-content: center;
  align-content: center;
  max-width: 25rem;
}

</style>