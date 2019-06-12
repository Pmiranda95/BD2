package conexionbd;

import modelo.Cadena;
import modelo.Domicilio;
import modelo.Sucursal;

import static conexionbd.EmpleadosData.empleado1;
import static conexionbd.LocalidadData.lanus;
import static conexionbd.ProvinciasData.buenosAires;

public class SucursalData {

    static Domicilio domicilioSucursal1 = new Domicilio("mitre",123,lanus,buenosAires);
    static Cadena cadena1 = new Cadena("waltmart");
    static Sucursal sucursal1 = new Sucursal("sucursal_avellaneda",domicilioSucursal1,empleado1,cadena1);


}
