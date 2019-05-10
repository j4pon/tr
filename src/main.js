import Vue from 'vue'
import App from './App.vue'
import jquery from 'jquery'
window.$ = jquery
window.jQuery = jquery

import router from './router/index'
import store from './store'

import '@progress/kendo-ui'
import '@progress/kendo-ui/js/cultures/kendo.culture.es-PE.js'
// Import component
import '@progress/kendo-theme-default/dist/all.css'
import { KendoButtonsInstaller } from '@progress/kendo-buttons-vue-wrapper'
import { KendoDataSourceInstaller } from '@progress/kendo-datasource-vue-wrapper'
import { KendoDropdownsInstaller } from '@progress/kendo-dropdowns-vue-wrapper'
import { KendoChartInstaller } from '@progress/kendo-charts-vue-wrapper'
import { KendoLayoutInstaller, LayoutInstaller  } from '@progress/kendo-layout-vue-wrapper'
import { InputsInstaller, KendoInputsInstaller} from '@progress/kendo-inputs-vue-wrapper'
import { DateinputsInstaller, KendoDateinputsInstaller } from '@progress/kendo-dateinputs-vue-wrapper'
import { KendoPopupsInstaller } from '@progress/kendo-popups-vue-wrapper'
import { GridInstaller } from '@progress/kendo-grid-vue-wrapper'
import { ValidatorInstaller } from '@progress/kendo-validator-vue-wrapper'
import { WindowInstaller } from '@progress/kendo-window-vue-wrapper';
import { UploadInstaller } from '@progress/kendo-upload-vue-wrapper'

import BootstrapVue from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
//import 'bootstrap-vue/dist/bootstrap-vue.css'
import './app.css'


Vue.config.productionTip = false

Vue.use(KendoButtonsInstaller)
Vue.use(KendoInputsInstaller)
Vue.use(KendoDropdownsInstaller)
Vue.use(KendoDataSourceInstaller)
Vue.use(KendoChartInstaller)
Vue.use(KendoLayoutInstaller)
Vue.use(KendoDateinputsInstaller)
Vue.use(KendoPopupsInstaller)
Vue.use(GridInstaller)
Vue.use(WindowInstaller)
Vue.use(ValidatorInstaller)
Vue.use(InputsInstaller)
Vue.use(DateinputsInstaller)
Vue.use(LayoutInstaller)
Vue.use(UploadInstaller)
Vue.use(BootstrapVue)

new Vue({
  store,
  router,
  ...App
}).$mount('#app')