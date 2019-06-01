<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-12 text-left">
                <h3>Registrar Campañas</h3>
            </div>
        </div>

        <div class="card">
            <div class="card-header text-left">
                Datos Generales
            </div>
            <div class="card-body">
                <table>
                    <tr>
                        <td>Nombre</td>
                        <td colspan="5"><input type="text" class="k-textbox" style="width:100%"></td>
                    </tr>
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
                    <tr>
                        <td>Campaña Individual</td>
                        <td>
                            <input type="radio" value="Individual" v-model="filtro.campana">
                        </td>
                        <td>Campaña Combinada</td>
                        <td>
                            <input type="radio"  value="Combinada" v-model="filtro.campana">
                        </td>
                        <td>Campaña Excluyente</td>
                        <td>
                            <input type="radio"  value="Excluyente" v-model="filtro.campana">
                        </td>
                    </tr>
                    <tr>
                        <td style="vertical-align:top">Descripcion</td>
                        <td colspan="5">
                            <textarea name="" id="" v-model="filtro.descripcion" cols="30" rows="10" style="width:100%;"></textarea>    
                        </td>
                    </tr>
                    <tr>
                        <td style="vertical-align:top">Condiciones</td>
                        <td colspan="5">
                            <textarea name="" id="" v-model="filtro.condiciones" cols="30" rows="10" style="width:100%;"></textarea>    
                        </td>
                    </tr>

                </table>
            </div>
            <div class="card-footer">
                <div class="row">
                    <div class="col-6 text-right">
                        <kendo-button :disabled="false" @click="save"><span class="k-icon k-i-save"></span>Registrar</kendo-button>
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
import mixins from "~/mixins";
    export default {
        mixins:[mixins],
        data: function() {
            return {
                take:10,
                filtro:{}
            }
        },  
        methods:{
            save:function(){
                console.log(this.filtro);
            }
        }      
    }
</script>

<style lang="scss" scoped>

</style>