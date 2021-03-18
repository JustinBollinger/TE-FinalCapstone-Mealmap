import Vue from 'vue'
import Router from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Logout from '../views/Logout.vue'
import Register from '../views/Register.vue'
import store from '../store/index'
import GroceryList from '../views/GroceryList.vue'
import IngredientList from '../views/IngredientList.vue'
import MealPlanList from '../views/MealPlanList.vue'
import MealPlanDetail from '../views/MealPlanDetail.vue'
import AddMealPlan from "../views/AddMealPlan.vue"
import RecipeDetail from '../views/RecipeDetail.vue'
import RecipeList from '../views/RecipeList.vue'
import AddNewRecipe from '../views/AddNewRecipe.vue'
import ModifyRecipe from '../views/ModifyRecipe.vue'
// import MealPlanDetailTestFile from "@/views/MealPlanDetailTestFile";

Vue.use(Router)

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 *
 * It also is used to detect whether or not a route requires the user to have first authenticated.
 * If the user has not yet authenticated (and needs to) they are redirected to /login
 * If they have (or don't need to) they're allowed to go about their way.
 */


const router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/login",
      name: "login",
      component: Login,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/logout",
      name: "logout",
      component: Logout,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/register",
      name: "register",
      component: Register,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/groceryList",
      name: "grocery-list",
      component: GroceryList,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/ingredientList",
      name: "ingredient-list",
      component: IngredientList,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/mealPlan",
      name: "meal-plan",
      component: MealPlanList,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/mealPlanDetail/:id",
      name: "meal-plan-detail",
      component: MealPlanDetail,
      meta: {
        requiresAuth: true
      }
    },
    // {
    //   path: "/mealPlanDetailTestFile/:id",
    //   name: "meal-plan-test",
    //   component: MealPlanDetailTestFile,
    //   meta: {
    //     requiresAuth: true
    //   }
    // },
    {
      path: "/addMealPlan",
      name: "add-meal-plan",
      component: AddMealPlan,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/recipeList/recipeDetail/:id",
      name: "recipe-detail",
      component: RecipeDetail,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/recipeDetail/modify/:id",
      name: "modify-recipe",
      component: ModifyRecipe,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/recipeList",
      name: "recipes",
      component: RecipeList,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/recipeList/addNewRecipe",
      name: "add-new-recipe",
      component: AddNewRecipe,
      meta: {
        requiresAuth: true
      }
    }
  ]
})

router.beforeEach((to, from, next) => {
  // Determine if the route requires Authentication
  const requiresAuth = to.matched.some(x => x.meta.requiresAuth);

  // If it does and they are not logged in, send the user to "/login"
  if (requiresAuth && store.state.token === '') {
    next("/login");
  } else {
    // Else let them go to their next destination
    next();
  }
});

export default router;
