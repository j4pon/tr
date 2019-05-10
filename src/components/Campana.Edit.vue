<template>
    <div class="container-fluid">
        <div class="row">
            <div class="col-12 text-left">
                <h3>Actualizar Campañas</h3>
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
                        <td>Canal</td>
                        <td>
                            <kendo-dropdownlist v-model="datoPais"
                            :data-source="dataPais"
                            :data-text-field="'text'"
                            :data-value-field="'value'"
                            :filter="'contains'">
                            </kendo-dropdownlist>
                        </td>                  
                        <td>Producto</td>
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
                        <td>Tipo</td>
                        <td>
                            <kendo-dropdownlist v-model="datoPais"
                            :data-source="dataPais"
                            :data-text-field="'text'"
                            :data-value-field="'value'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Subtipo</td>
                        <td>
                            <kendo-dropdownlist v-model="datoPais"
                            :data-source="dataPais"
                            :data-text-field="'text'"
                            :data-value-field="'value'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Procedencia</td>
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
                        <td>Departamento</td>
                        <td>
                            <kendo-dropdownlist v-model="datoPais"
                            :data-source="dataPais"
                            :data-text-field="'text'"
                            :data-value-field="'value'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Perfil</td>
                        <td>
                            <kendo-dropdownlist v-model="datoPais"
                            :data-source="dataPais"
                            :data-text-field="'text'"
                            :data-value-field="'value'"
                            :filter="'contains'">
                            </kendo-dropdownlist>                         
                        </td>
                        <td>Agencia</td>
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
                        <td>Inicio Vigencia</td>
                        <td>
                            <kendo-datepicker :format="'yyyy/MMMM/dd'"></kendo-datepicker>
                        </td>
                        <td>Fin Vigencia</td>
                        <td>
                            <kendo-datepicker :format="'yyyy/MMMM/dd'"></kendo-datepicker>
                        </td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Campaña Individual</td>
                        <td>
                            <input type="radio">
                        </td>
                        <td>Campaña Combinada</td>
                        <td>
                            <input type="radio">
                        </td>
                        <td>Campaña Excluyente</td>
                        <td>
                            <input type="radio">
                        </td>
                    </tr>
                    <tr>
                        <td style="vertical-align:top">Descripcion</td>
                        <td colspan="5">
                            <textarea name="" id="" cols="30" rows="10" style="width:100%;"></textarea>    
                        </td>
                    </tr>
                    <tr>
                        <td style="vertical-align:top">Condiciones</td>
                        <td colspan="5">
                            <textarea name="" id="" cols="30" rows="10" style="width:100%;"></textarea>    
                        </td>
                    </tr>

                </table>
            </div>
            <div class="card-footer">
                <div class="row">
                    <div class="col-6 text-right">
                        <kendo-button :disabled="false" ><span class="k-icon k-i-refresh"></span>Actualizar</kendo-button>
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
                ]               
            }
        },        
    }
</script>

<style lang="scss" scoped>

</style>