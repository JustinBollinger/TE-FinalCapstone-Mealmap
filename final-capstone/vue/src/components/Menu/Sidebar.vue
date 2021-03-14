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
  transition: transform .2s ease;
}

.slide-enter,
.slide-leave-to {
  transform: translateX(-100%);
  transition: all 150ms ease-in 0s
}

.sidebar-backdrop {
  /*background-color: rgba(0,0,0,.85);*/
  /*background: linear-gradient(45deg, rgba(101,31,87,1) 0%, rgba(225,113,87,1) 48%, rgba(249,248,113,1) 100%);*/

  background: #534187;
  opacity: 50%;
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
  cursor: pointer;
}

.sidebar-panel {
  overflow-y: auto;
  background-color: rgba(255, 255, 255, .95);
  border-bottom-right-radius: 50px;

  position: fixed;
  left: 0;
  height: 50vh;
  z-index: 1;
  padding: 2.5rem 20px 2rem 20px;
  width: 300px;
}
</style>