// stores/counter.js
import { defineStore } from 'pinia';
import {ref} from "vue";

export const useCounterStore =
    defineStore('counter', {
    state: () => {
        const count = ref( 0)
        const addNumber = ()=>{
            count.value++
        }
        return { count ,addNumber};
    },
        persist:{
            storage:{
                setItem(key,value){
                    uni.setStorageSync(key,value)
                },
                getItem(key){
                    return uni.getStorageSync(key)
                }
            }
        }
}, );
