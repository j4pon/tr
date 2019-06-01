<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-6 text-left">
                <h3>Carga de Datos</h3>
            </div>
            <div class="col-6 text-right">

            </div>
        </div>

        <div class="card">
            <div class="card-header text-left">
                Datos Generales
            </div>
            <div class="card-body">
                <table>
                    <tr>
                        <td>Codigo Carga</td>
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
                        <td>Estado de carga</td>
                        <td>
                            <kendo-datasource 
                            ref="remote12" 
                            :transport-read-url="'/drop?id=12'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.estadocarga"
                            :options-label="optionLabel"
                            :data-source-ref="'remote12'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                          
                        </td>
                        <td>Codigo Campaña</td>
                        <td>
                            <input type="text" v-model="filtro.codigocampana" class="k-textbox">
                        </td>                  
                        <td>Estado Campaña</td>
                        <td>
                            <kendo-datasource 
                            ref="remote13" 
                            :transport-read-url="'/drop?id=13'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.estadocampana"
                            :options-label="optionLabel"
                            :data-source-ref="'remote13'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                       
                        </td>
                    </tr>
                    <tr>
                        <td>Inicio carga</td>
                        <td>
                            <kendo-datepicker v-model="filtro.inicio" :format="'yyyy/MMMM/dd'"></kendo-datepicker>
                        </td>
                        <td>Fin carga</td>
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
                Carga archivo
            </div>
            <div class="card-body">
                <table>
                    <tr>
                        <td>Campaña</td>
                        <td>
                            <kendo-datasource 
                            ref="remote14" 
                            :transport-read-url="'/drop?id=14'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.campana"
                            :options-label="optionLabel"
                            :data-source-ref="'remote14'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Tipo archivo</td>
                        <td>
                            <kendo-datasource 
                            ref="remote15" 
                            :transport-read-url="'/drop?id=15'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.tipoarchivo"
                            :options-label="optionLabel"
                            :data-source-ref="'remote15'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Operación</td>
                        <td>
                            <kendo-datasource 
                            ref="remote16" 
                            :transport-read-url="'/drop?id=16'"
                            :transport-read-type="'POST'" 
                            :transport-read-content-type="'application/json; charset=utf-8'"
                            :transport-read-data-type="'json'"
                            :schema-parse="parseData" />
                            <kendo-dropdownlist v-model="filtro.operacion"
                            :options-label="optionLabel"
                            :data-source-ref="'remote16'"
                            :data-text-field="'value'"
                            :data-value-field="'key'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                    </tr>
                    <tr>
                        <td>Fecha Carga</td>
                        <td>
                            <kendo-datepicker v-model="filtro.fechacarga" :format="'yyyy/MMMM/dd'"></kendo-datepicker>                       
                        </td>
                        <td>Ruta</td>
                        <td colspan="2">
                            <kendo-upload ref="upload"
                                name="files"
                                :async-save-url="'custom-save-url'"
                                :async-remove-url="'custom-remove-url'"
                                :validation-allowed-extensions='[".pdf"]'>
                            </kendo-upload>                   
                        </td>
                        <td>
                            <kendo-button :disabled="false" ><span class="k-icon k-i-file"></span>Cargar archivo</kendo-button>
                        </td>
                    </tr>
                </table>
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
            },
        }      
    }
</script>

<style lang="scss" scoped>

</style>