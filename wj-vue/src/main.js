import Vue from 'vue'
import App from './App'
import router from './router'

let axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8081/api'
Vue.prototype.$axios = axios

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  render: h => h(App)
})
