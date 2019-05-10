import CampanaPage from 'components/Campana'
import CampanaPageNew from 'components/Campana.New'
import CampanaPageEdit from 'components/Campana.Edit'
import SeguimientoCampanaPage from 'components/Seguimiento.Campana'
import CargaDatos from 'components/Carga.Datos'
import CargaDatosDetail from 'components/Carga.Datos.Detail'
import TipoArchivo from 'components/Tipo.Archivo'
import TipoArchivoNew from 'components/Tipo.Archivo.New'
import ConsultaHistorico from 'components/Consulta.Historico'



export const routes = [
  { name: 'home', path: '/', component: CampanaPage},
  { name: 'Campana', path: '/Campana', component: CampanaPage},
  { name: 'CampanaNew', path: '/CampanaNew', component: CampanaPageNew},
  { name: 'CampanaEdit', path: '/CampanaEdit', component: CampanaPageEdit},  
  { name: 'CargaDatos', path: '/CargaDatos', component: CargaDatos},
  { name: 'CargaDatosDetail', path: '/CargaDatosDetail', component: CargaDatosDetail},
  { name: 'SeguimientoCampana', path: '/SeguimientoCampana', component: SeguimientoCampanaPage},
  { name: 'TipoArchivo', path: '/TipoArchivo', component: TipoArchivo},
  { name: 'TipoArchivoNew', path: '/TipoArchivoNew', component: TipoArchivoNew},
  { name: 'ConsultaHistorico', path: '/ConsultaHistorico', component: ConsultaHistorico},
]
