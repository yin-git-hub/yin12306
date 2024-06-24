<template>
  <view class="content">
    <image class="logo" src="/static/logo.png" />
    <view class="text-area">
      <text class="title">{{ title }}</text>
      <div>
        test:{{counteStore.count}}
        <br>
        <button @tap="addNumber">+</button>
      </div>
      <div>
        <button @tap="testApi">test api</button>
      </div>
    </view>
  </view>
</template>

<script setup lang="ts">
import {ref} from "vue"
import {useCounterStore} from "@/stores"
const title = ref('Hello')
const counteStore = useCounterStore()
const testData = ref<string>("")
const addNumber = ()=>{
  counteStore.addNumber()
}
const testApi = () =>{
  console.log(11)
  uni.request({
    method:"GET",
    url:'/test/test1',
  }).then(resp=>{
    console.log(resp.data)
  })
}

</script>

<style>
.content {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

.logo {
  height: 200rpx;
  width: 200rpx;
  margin-top: 200rpx;
  margin-left: auto;
  margin-right: auto;
  margin-bottom: 50rpx;
}

.text-area {
  display: flex;
  justify-content: center;
}

.title {
  font-size: 36rpx;
  color: #8f8f94;
}
</style>
