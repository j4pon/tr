<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-6 text-left">
                <h3>Registro Tipo de Archivo</h3>
            </div>
            <div class="col-6 text-right">
                
            </div>
        </div>

        <div class="card">
            <div class="card-header text-left">
                Datos Generales
            </div>
            <div class="card-body">
            <table width="100%">
                <tr>
                    <td>Nombre</td>
                    <td colspan="5"><input type="text" class="k-textbox" style="width:100%"></td>
                    <td>Pais</td>
                    <td>
                        <kendo-dropdownlist v-model="datoPais"
                        :data-source="dataPais"
                        :data-text-field="'text'"
                        :data-value-field="'value'"
                        :filter="'contains'">
                        </kendo-dropdownlist>                        
                    </td>
                    <td>Empresa</td>
                    <td>
                        <kendo-dropdownlist v-model="datoPais"
                        :data-source="dataPais"
                        :data-text-field="'text'"
                        :data-value-field="'value'"
                        :filter="'contains'">
                        </kendo-dropdownlist>                         
                    </td>
                </tr>             
            </table>
            </div>
        </div>

        <div class="card mt-2">
            <div class="card-header text-left">
                Características
            </div>
            <div class="card-body">        
                <table width="100%">
                    <tr>
                        <td>Nro. Orden</td>
                        <td><input type="text" class="k-textbox"></td>
                        <td>Descripción</td>
                        <td><input type="text" class="k-textbox" style="width:100%"></td>
                    </tr>
                    <tr>
                        <td class="p-0 m-0">Tipo Dato</td>
                        <td class="p-0 m-0">
                            <kendo-dropdownlist v-model="datoPais"
                            :data-source="dataPais"
                            :data-text-field="'text'"
                            :data-value-field="'value'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                          
                        </td>
                        <td rowspan="2" colspan="2">
                            <div class="card mt-0 pt-0">
                                <div class="card-header text-left">
                                    Longitud
                                </div>
                                <div class="card-body">
                                    <table width="100%">
                                        <tr>
                                            <td>Variable</td>
                                            <td><input type="radio"></td>
                                            <td>Maxima</td>
                                            <td><input type="text" class="k-textbox" style="width:100%"></td>
                                        </tr>
                                        <tr>
                                            <td>Fija</td>
                                            <td><input type="radio"></td>
                                            <td>Minima</td>
                                            <td><input type="text" class="k-textbox" style="width:100%"></td>
                                        </tr>
                                    </table>
                                </div>
                            </div>


                        </td>
                    </tr>
                    <tr>
                        <td class="p-0 m-0">Es pk</td>
                        <td class="p-0 m-0"><input type="checkbox" name="" id=""></td>

                    </tr>
                    <tr>
                        <td class="p-0 m-0">Es Obligatorio</td>
                        <td class="p-0 m-0"><input type="checkbox" name="" id=""></td>
                    </tr>
                </table>
            </div>
            <div class="card-footer">
                <div class="row">
                    <div class="col-6 text-right">
                        <kendo-button :disabled="false" ><span class="k-icon k-i-add"></span>Agregar</kendo-button>
                    </div>
                    <div class="col-6 text-left">
                        <kendo-button :disabled="false" ><span class="k-icon k-i-trash"></span>Limpiar</kendo-button>
                    </div>
                </div>
            </div>
        </div>        

        <div class="card mt-2">
            <div class="card-header text-left">
                Resultado Busqueda
            </div>

            <kendo-datasource ref="datasource1"
                :transport-read="getData"
                :schema-data="'data'"
                :schema-total="'total'"
                :batch='true'
                :page-size='take'
                :server-paging="true" />

            <kendo-grid ref="grid" :height="350"
                :toolbar="toolbarTemplate"
                :data-source-ref="'datasource1'"
                :pageable='true'
                :columns="columns"
            />
            <div class="card-footer">
                <div class="row">
                    <div class="col-6 text-right">
                        <kendo-button :disabled="false" ><span class="k-icon k-i-save"></span>Registrar</kendo-button>
                    </div>
                    <div class="col-6 text-left">
                        <kendo-button :disabled="false" ><span class="k-icon k-i-trash"></span>Limpiar</kendo-button>
                    </div>
                </div> 
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        data: function() {
            return {
                take:10,
                datoPais: "",
                dataPais: [
                    { text: 'Small', value: '1' },
                    { text: 'Medium', value: '2' },
                    { text: 'Large', value: '3' },
                    { text: 'X-Large', value: '4' },
                    { text: '2X-Large', value: '5' }
                ],
                columns: [
                    {
                        command: [{text: "Editar", click:this.editRow }],
                        width: "200px"
                    },                    
                    {
                        title: "ID",
                        field: "id_usuario",
                        width: "80px",
                        hidden: true,
                        headerAttributes: {
                            style: "text-align: center;"
                        }
                    },
                    {
                        title: "Usuario",
                        field: "usuario",
                        width: "200px",
                        headerAttributes: {
                            style: "text-align: center;"
                        },
                        attributes: {
                            style: "text-align: left;"
                        }
                    },
                    {
                        title: "Nombres",
                        field: "nombres",
                        width: "200px",
                        headerAttributes: {
                            style: "text-align: center;"
                        },
                        attributes: {
                            style: "text-align: left;"
                        }
                    },
                    {
                        title: "Ap.Paterno",
                        field: "apellido_paterno",
                        width: "200px",
                        headerAttributes: {
                            style: "text-align: center;"
                        },
                        attributes: {
                            style: "text-align: left;"
                        }
                    },
                    {
                        title: "Ap.Materno",
                        field: "apellido_materno",
                        width: "200px",
                        headerAttributes: {
                            style: "text-align: center;"
                        },
                        attributes: {
                            style: "text-align: left;"
                        }
                    },
                    {
                        title: "Email",
                        field: "correo_electronico",
                        width: "200px",
                        headerAttributes: {
                            style: "text-align: center;"
                        },
                        attributes: {
                            style: "text-align: left;"
                        }
                    },
                    {
                        title: "Estado",
                        field: "estado",
                        width: "200px",
                        headerAttributes: {
                            style: "text-align: center;"
                        },
                        attributes: {
                            style: "text-align: left;"
                        }
                    }
                ],                
                             
            }
        },
        methods:{
            addCampana:function(){
                this.$router.push({ name: 'TipoArchivoNew', params: { new:false } })
            },
            getData:function(http) {
                http.success({data:[], total:0})
            },
            toolbarTemplate: function() {
                var templateHtml =
                    '<span>' +
                        '<a class="k-pager-refresh k-link k-button" title="Refresh" @click="newRow"><span class="k-icon k-i-excel"></span>Exportar</a>' +
                    '</span>';

                return kendo.template(templateHtml);
            },
        }      
    }
</script>

<style lang="scss" scoped>

</style>