import axios from 'axios';

export default {

  listRecipes() {
    return axios.get('/recipeList')
  },

//   getRecipe(recipeId) {
//     return axios.get(`/recipeList/${id}`)
//   }

}
