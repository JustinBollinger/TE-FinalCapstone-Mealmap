import axios from 'axios';

axios.defaults.baseURL = process.env.VUE_APP_REMOTE_API;

export default {

  getMealPlans() {
    return axios.get(`/mealPlan`)
  },

  getMealPlanById(id) {
    return axios.get(`/mealPlanDetail/${id}`)
  },

  create(mealPlan) {
    return axios.post(`/mealPlan/`, mealPlan);
  },

  updateMealPlan(id, mealPlan) {
    return axios.put(`/mealPlanDetail/${id}`, mealPlan);
  },

  // delete(id) {
  //   return axios.delete(`/recipeList/recipeDetail/${id}`);
  // }


  getMealsByMealPlanId(id) {
    return axios.get(`/mealDetail/${id}`)
  },

  addRecipe(meal) {
    return axios.post(`/mealDetail/`, meal);
  },

}
