import axios from 'axios';

axios.defaults.baseURL = process.env.VUE_APP_REMOTE_API;

export default {

  getMeal() {
    return axios.get('/recipeList')
  },

  getMealsByDay(id) {
    return axios.get(`/recipeList/recipeDetail/${id}`)
  },

  create(recipe) {
    return axios.post(`/recipeList/`, recipe);
  },

  updateRecipe(id, recipe) {
    return axios.put(`/recipeList/recipeDetail/${id}`, recipe);
  },

  // delete(id) {
  //   return axios.delete(`/recipeList/recipeDetail/${id}`);
  // }

}