import {
	createSSRApp
} from "vue";
import App from "./App.vue";
import piniaPluginPersistedstate from 'pinia-plugin-persistedstate'

import * as Pinia from  'pinia'

export function createApp() {
	const app = createSSRApp(App);
	app.use(Pinia.createPinia().use(piniaPluginPersistedstate));
	return {
		app,
		Pinia
	};
}


