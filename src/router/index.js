import Vue from 'vue'
import VueRouter from 'vue-router'
import { routes } from './routes'
//import axios from 'axios'

Vue.use(VueRouter)

let router = new VueRouter({
  mode: 'history',
  routes
})

router.beforeEach((to, from, next) => {
  console.log("#aquiiiiiiiiiiiii");
  next()
})

export default router

