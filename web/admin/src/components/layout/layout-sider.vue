<template>


    <a-layout-sider  class="a-sider">
      <a-menu
          class="sider-menu"
          theme="dark"
          inlineIndent="30"
          id="dddddd"
          style="width: 200px"
          v-model:openKeys="openKeys"
          v-model:selectedKeys="selectedKeys"
          mode="inline"
          @click="handleClick"
      >
        <a-sub-menu key="sub4">
          <template #icon>
            <SettingOutlined />
          </template>
          <template #title>Navigation Three</template>
          <a-menu-item key="1" >
            <router-link to="trainNumber">
              车次管理
            </router-link>
          </a-menu-item>
          <a-menu-item key="2">
          <router-link to="passingStation">
            途径车站管理
          </router-link>
          </a-menu-item>
          <a-menu-item key="3">Option 11</a-menu-item>
          <a-menu-item key="4">Option 12</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
</template>
<script setup lang="ts">
import {ref, watch} from "vue";

const selectedKeys = ref<string[]>(['1']);
const openKeys = ref<string[]>(['sub1']);
const handleClick = (e: Event) => {
  console.log('click', e);
};
const titleClick = (e: Event) => {
  console.log('titleClick', e);
};
watch(
    () => openKeys,
    val => {
      console.log('openKeys', val);
    },
);
</script>
<style scoped>
.a-sider{
  background-color: white;
  width: 100px;
}

</style>
