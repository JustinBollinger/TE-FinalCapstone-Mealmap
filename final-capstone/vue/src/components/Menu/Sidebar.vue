<template>
  <div class="sidebar">
    <div class="sidebar-backdrop" @click="closeSidebarPanel" v-if="isPanelOpen"></div>
    <transition name="slide">
      <div v-if="isPanelOpen"
           class="sidebar-panel">
        <slot></slot>
      </div>
    </transition>
  </div>
</template>
<script>
import { store, mutations } from '@/store.js'

export default {
  methods: {
    closeSidebarPanel: mutations.toggleNav
  },
  computed: {
    isPanelOpen() {
      return store.isNavOpen
    }
  }
}
</script>
<style>
.slide-enter-active,
.slide-leave-active
{
  transition: transform 0.2s ease;
}

.slide-enter,
.slide-leave-to {
  transform: translateX(-100%);
  transition: all 150ms ease-in 0s
}

.sidebar-backdrop {
  /*background-color: rgba(0,0,0,.85);*/
  /*background: linear-gradient(45deg, rgba(101,31,87,1) 0%, rgba(225,113,87,1) 48%, rgba(249,248,113,1) 100%);*/
  /*background: linear-gradient(45deg, rgba(237,28,36,1) 0%, rgba(0,113,188,1) 48%, rgba(27,20,100,1) 100%);*/
  background: #343A40;
  opacity: 85%;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
  cursor: pointer;
}

.sidebar-panel {
  overflow-y: auto;
  background-color: rgba(255, 255, 255, .75);
  position: fixed;
  left: 0;
  top: 0;
  height: 100vh;
  z-index: 1;
  padding: 3rem 20px 2rem 20px;
  width: 300px;
}
</style>