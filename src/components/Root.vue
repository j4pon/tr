<template>
  <div>
    <header class="header">

<!-- Just an image -->

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">
    <img alt="logo" style="width: 250px; height: 50px;" src="https://s3-eu-west-1.amazonaws.com/rankia/images/valoraciones/0016/0562/Banco-ripley.jpg?1404385612">
  </a>      

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active text-white">
        GESTION DE CAMPAÑAS 
      </li>
    </ul>
    <div class="form-inline my-2 my-lg-0  text-white">
      Tiempo Restante: 05:00
    </div>
  </div>
</nav>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <!--
  <img alt="logo" style="width: 500px; height: 109px;" src="https://s3-eu-west-1.amazonaws.com/rankia/images/valoraciones/0016/0562/Banco-ripley.jpg?1404385612">
  -->

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <span class="k-icon k-i-user"></span>JLANZA
      </li>
    </ul>
    <div class="form-inline my-2 my-lg-0">
      <span class="k-icon k-i-time"></span> Último acceso 22/04/2019 00:07:53
    </div>
  </div>
</nav>

</header>

    <section>
      <div class="container-fluid">
        <div class="row">
          <div class="col-3 p-0 sidebar">

    <kendo-panelbar>
        <li @click="menu('home')">Inicio</li>
        <li @click="menu('Campana')">Campaña</li>
        <li @click="menu('home')">Administración</li>
        <li @click="menu('SeguimientoCampana')">Seguimiento</li>
        <li @click="menu('ConsultaHistorico')">Reportes</li>
        <li @click="menu('CargaDatos')">Carga de Datos</li>
    </kendo-panelbar>

          </div>
          <div class="col-9 pt-2">
            <router-view></router-view>
          </div>
        </div>
      </div>
      <div>
        
      </div> 
    </section>
    <footer>
      <div class="container-fluid bg-dark text-white p-2">
        bancoripley.com.pe &#169; COPYRIGHT 2018. Todos los derechos reservados.
      </div>
      
    </footer>
  </div>
</template>

<script>
export default {
  name: 'Root',
  props: {
    msg: String
  },
  mount:function(){
  
  },
  methods:{
    menu: function(url){
      this.$router.push({ name: url })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
