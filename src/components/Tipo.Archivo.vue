<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-6 text-left">
                <h3>Tipo de Archivo</h3>
            </div>
            <div class="col-6 text-right">
                <kendo-button :disabled="false" @click="addCampana"><span class="k-icon k-i-add"></span>Agregar Tipo de Archivo</kendo-button>
            </div>
        </div>

        <div class="card">
            <div class="card-header text-left">
                Datos Generales
            </div>
            <div class="card-body">
            <table>
                <tr>
                    <td>Codigo</td>
                    <td><input type="text" class="k-textbox"></td>
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
                <tr>
                    <td>Estado</td>
                    <td>
                        <kendo-dropdownlist v-model="datoPais"
                        :data-source="dataPais"
                        :data-text-field="'text'"
                        :data-value-field="'value'"
                        :filter="'contains'">
                        </kendo-dropdownlist>                         
                    </td>
                    <td>Nombres</td>
                    <td colspan="3">
                        <input type="text" class="k textbox" style="width:100%">
                    </td>
                </tr>                
            </table>
            </div>
            <div class="card-footer">
                <div class="row">
                    <div class="col-6 text-right">
                        <kendo-button :disabled="false" ><span class="k-icon k-i-search"></span>Buscar</kendo-button>
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
                    '<div class="text-right">' +
                        '<a class="k-pager-refresh k-link k-button" title="Refresh" @click="newRow"><span class="k-icon k-i-excel"></span>Exportar</a>' +
                    '</div>';

                return kendo.template(templateHtml);
            },
        }      
    }
</script>

<style lang="scss" scoped>

</style>