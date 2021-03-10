import axios from 'axios';

axios.defaults.baseURL = process.env.VUE_APP_REMOTE_API;

export default {

  getRecipes() {
    return axios.get('/recipeList')
  },


}
