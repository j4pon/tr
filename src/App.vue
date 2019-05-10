<template>
  <div id="app" class="container-fluid">
    <Root />
  </div>
</template>

<script>
import Root from './components/Root'

export default {
  name: 'app',
  components: {
    Root
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
