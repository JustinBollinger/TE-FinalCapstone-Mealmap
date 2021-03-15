import axios from 'axios';

axios.default.baseURL = process.env.VUE_APP_REMOTE_API;

export default {
    getIngredients(){
        return axios.get(`/ingredientList`)
    },

    getIngredientById(id) {
        return axios.get(`/ingredientList/${id}`)
    },

    create(ingredient) {
        return axios.post(`/ingredientList`, ingredient)
    }
}