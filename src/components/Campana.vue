<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-6 text-left">
                <h3>Campañas</h3>
            </div>
            <div class="col-6 text-right">
                <kendo-button :disabled="false" @click="addCampana"><span class="k-icon k-i-add"></span>Agregar Campaña</kendo-button>
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
                            <kendo-datasource 
                            ref="remote1" 
                            :transport-read-url="'/drop?id=01'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.pais"
                            :options-label="optionLabel"
                            :data-source-ref="'remote1'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                           
                        </td>
                        <td>Empresa</td>
                        <td>
                            <kendo-datasource 
                            ref="remote2" 
                            :transport-read-url="'/drop?id=02'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.empresa"
                            :options-label="optionLabel"
                            :data-source-ref="'remote2'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                          
                        </td>
                    </tr>
                    <tr>
                        <td>Estado</td>
                        <td>
                            <kendo-datasource 
                            ref="remote3" 
                            :transport-read-url="'/drop?id=03'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.estado"
                            :options-label="optionLabel"
                            :data-source-ref="'remote3'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Canal</td>
                        <td>
                            <kendo-datasource 
                            ref="remote4" 
                            :transport-read-url="'/drop?id=04'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.canal"
                            :options-label="optionLabel"
                            :data-source-ref="'remote4'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>  
                        </td>                  
                        <td>Producto</td>
                        <td>
                            <kendo-datasource 
                            ref="remote5" 
                            :transport-read-url="'/drop?id=05'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.producto"
                            :options-label="optionLabel"
                            :data-source-ref="'remote5'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                        
                        </td>
                    </tr>
                    <tr>
                        <td>Tipo</td>
                        <td>
                            <kendo-datasource 
                            ref="remote6" 
                            :transport-read-url="'/drop?id=06'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.tipo"
                            :options-label="optionLabel"
                            :data-source-ref="'remote6'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                       
                        </td>
                        <td>Subtipo</td>
                        <td>
                            <kendo-datasource 
                            ref="remote7" 
                            :transport-read-url="'/drop?id=07'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.subtipo"
                            :options-label="optionLabel"
                            :data-source-ref="'remote7'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                           
                        </td>
                        <td>Procedencia</td>
                        <td>
                            <kendo-datasource 
                            ref="remote8" 
                            :transport-read-url="'/drop?id=08'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.procedencia"
                            :options-label="optionLabel"
                            :data-source-ref="'remote8'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                        
                        </td>
                    </tr>
                    <tr>
                        <td>Departamento</td>
                        <td>
                            <kendo-datasource 
                            ref="remote9" 
                            :transport-read-url="'/drop?id=09'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.departamento"
                            :options-label="optionLabel"
                            :data-source-ref="'remote9'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Perfil</td>
                        <td>
                            <kendo-datasource 
                            ref="remote10" 
                            :transport-read-url="'/drop?id=10'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.perfil"
                            :options-label="optionLabel"
                            :data-source-ref="'remote10'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>  
                        </td>
                        <td>Agencia</td>
                        <td>
                            <kendo-datasource 
                            ref="remote11" 
                            :transport-read-url="'/drop?id=11'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.agencia"
                            :options-label="optionLabel"
                            :data-source-ref="'remote11'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                    </tr>
                    <tr>
                        <td>Inicio Vigencia</td>
                        <td>
                            <kendo-datepicker v-model="filtro.inicio" :format="'yyyy/MMMM/dd'"></kendo-datepicker>
                        </td>
                        <td>Fin Vigencia</td>
                        <td>
                            <kendo-datepicker v-model="filtro.fin" :format="'yyyy/MMMM/dd'"></kendo-datepicker>
                        </td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </div>
            <div class="card-footer">
                <div class="row">
                    <div class="col-6 text-right">
                        <kendo-button :disabled="false" @click="filtrar"><span class="k-icon k-i-search"></span>Buscar</kendo-button>
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
import mixins from "~/mixins";
    export default {
        mixins:[mixins],
        data: function() {
            return {
                filtro:{},
                optionLabel: {
                    value: "Select a product...",
                    key: ""
                }
                take:10,
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
            filtrar:function(){
                console.log(this.filtro);
            },
            addCampana:function(){
                this.$router.push({ name: 'CampanaNew', params: { new:false } })
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
            }              
        }      
    }
</script>

<style lang="scss" scoped>

</style>