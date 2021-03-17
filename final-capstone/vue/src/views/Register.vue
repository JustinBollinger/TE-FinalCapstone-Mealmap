<template>
  <div class="jumbotron" id="main-contain">
    <div class="h1-contain">
      <h1 class="display-4-custom">Create Account</h1>
    </div>

    <div id="signin-container" class="h2-contain signin-container">
      <div id="home-image"> <img class="signin-logo" src="../../public/assets/Artboard 4.png" alt="Meal Map logo"/></div>

      <form class="form-register form-signin" @submit.prevent="register">

      <div class="alert alert-danger" role="alert" v-if="registrationErrors"> {{ registrationErrorMsg }} </div>
      <div class="alert alert" role="alert" v-if="registration">{ registration: 'success' }</div>
      
      <div>
        <label for="username" class="sr-only">Username</label>
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
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        placeholder="Confirm Password"
        v-model="user.confirmPassword"
        required
      />
      </div>

        <div class="button-separator">
      <router-link class="btn btn-secondary button-properties" :to="{ name: 'login' }">Have an account?</router-link>
      <button class="btn btn-secondary button-properties" type="submit">Create Account</button>
        </div>
    </form>
    </div>
  </div>
</template>

<script>
import authService from '../services/AuthService';

export default {
  name: 'register',
  data() {
    return {
      user: {
        username: '',
        password: '',
        confirmPassword: '',
        role: 'user',
      },
      registrationErrors: false,
      registrationErrorMsg: 'There were problems registering this user.',
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = 'Password & Confirm Password do not match.';
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: '/login',
                query: { registration: 'success' },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = 'Bad Request: Validation Errors';
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = 'There were problems registering this user.';
    },
  },
};
</script>

<style>

#signin-container{
  background-image: url("../../public/assets/rainbow-produce.jpg"),linear-gradient(rgba(255, 255, 255, 0.5), rgba(255, 255, 255,.5));


  background-size: cover;


}

</style>
