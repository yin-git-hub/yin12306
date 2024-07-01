<script setup lang="ts">

import LayoutSider from "@/components/layout/layout-sider.vue";
</script>

<template>
  <a-layout>
    <LayoutSider/>
    <a-layout>
      <a-layout-header style="background-color: #8f8f94">

        Header</a-layout-header>
      <a-layout-content class="a-content">
        <router-view></router-view>
        Content

      </a-layout-content>
      <a-layout-footer>Footer</a-layout-footer>
    </a-layout>

  </a-layout>
</template>

<style scoped>

</style>