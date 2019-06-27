package conexionbd;
import modelo.Cadena;
import modelo.Sucursal;

import  conexionbd.EmpleadosData;

import conexionbd.DomicilioData;

public class SucursalData {

    static Cadena cadena1 = new Cadena("waltmart");
    static Cadena cadena2 = new Cadena("Coto");
    static Cadena cadena3 = new Cadena("Farmacity");
    
   
    
    static Sucursal sucursal1 = new Sucursal("sucursal_avellaneda",DomicilioData.domicilio1,EmpleadosData.empleado1,cadena1);
    static Sucursal sucursal2 = new Sucursal("sucursal_Lanus",DomicilioData.domicilio2,EmpleadosData.empleado2,cadena2);
    static Sucursal sucursal3 = new Sucursal("sucursal_Lomas",DomicilioData.domicilio3,EmpleadosData.empleado8,cadena3);


}
