<template>
  <div id="main-contain" >

    <img src="../assets/Artboard 4.png" alt="Meal Map logo"/>

      <p id="instructions"> Please sign-in to access your account</p>

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
  /*background-color: #343a40;*/
}

#main-contain{
  /*min-height: 100vh;*/
  background-image: url("../../public/rainbow-produce.jpg")
  ;
  /*background: white;*/

  /*, linear-gradient(rgba(255, 255, 255, 0.75)0%, rgba(255, 255, 255, 0.75)100%);*/
  background-repeat: no-repeat;
  /*background-size:100%;*/

  display: flex;
  flex-direction: column;
  padding: 75px 100px 50px 100px;
  justify-content: right;
  /*border-bottom: rgba(77, 77, 77, 100) solid 5px;*/
}

.form-signin{
  margin-bottom: 100px;
  max-width: 30rem;
}

#instructions{
margin-top: 3rem;
}

#landing-buttons {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}

</style>