import {
  createSSRApp
} from "vue";
import App from "./App.vue";
import piniaPluginPersistedstate from 'pinia-plugin-persistedstate'
import * as Pinia from  'pinia'

import {httpInterceptor} from '@/utils/interceptor/http'

export function createApp() {
  const app = createSSRApp(App);
  app.use(Pinia.createPinia()
      .use(piniaPluginPersistedstate))


  return {
    app,
    Pinia
  };
}


uni.addInterceptor("request",httpInterceptor)