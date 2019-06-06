package conexionbd;

import modelo.Domicilio;
import modelo.Empleado;
import modelo.Localidad;
import modelo.Provincia;
import conexionbd.LocalidadData;

import static conexionbd.LocalidadData.*;
import static conexionbd.ObraSocialData.*;
import static conexionbd.ProvinciasData.buenosAires;
import static conexionbd.ProvinciasData.santaFe;

public class EmpleadosData {

//    notas
//    porque el empelado tiene  obrasocial


//    EMPLEADO SUCURSAL 1
    static Domicilio domicilioEmpleado1 = new Domicilio("calle falsa",123,lanus,buenosAires);
    static Empleado empleado1 = new Empleado("Gonzales","Carlos",39554679,20395546790L,domicilioEmpleado1,osde);

    static Domicilio domicilioEmpleado2 = new Domicilio("margarit wield",8822,lanus,buenosAires);
    static Empleado empleado2 = new Empleado("Muscolo","GOnzalo",39664570,2039664570L,domicilioEmpleado2,osecac);

    static Domicilio domicilioEmpleado3 = new Domicilio("ituzaingo",2333,avellaneda,buenosAires);
    static Empleado empleado3 = new Empleado("Messi","lionea",22332145,20223321450L,domicilioEmpleado3,galeno);

//    EMPLEADO SUCURSAL 2
    static  Domicilio domicilioEMpleado4 = new Domicilio("julio Roca",651,capitalFederal,buenosAires);
    static  Empleado empleado4 = new Empleado("Fontenla","Lautaro",87229341,20872293410L,domicilioEMpleado4,osecac);

    static Domicilio domicilioEmpleado5 = new Domicilio("esqiu",777,capitalFederal,buenosAires);
    static Empleado empleado5 = new Empleado("Garcia","Lautaro",45334565,20453345650L,domicilioEmpleado5,ioma);

    static Domicilio domicilioEmpleado6 = new Domicilio("lujan",453,lanus,buenosAires);
    static Empleado empleado6 = new Empleado("Gorostizaga","Juan cruz",35443456,20354434560L,domicilioEmpleado6,ioma);

//    EMPLEADO SUCURSAR 3
    static Domicilio domicilioEmpleado7 = new Domicilio("gaebeler",542,rosario,santaFe);
    static Empleado empleado7 = new Empleado("Saponaro","ramiro",45334678,20453346780L,domicilioEmpleado7,osecac);

    static Domicilio domicilioEmpleado8 = new Domicilio("guidi",555,belgrano,santaFe);
    static Empleado empleado8 = new Empleado("Vaccaro","enzo",56776890,20567768900L,domicilioEmpleado8,osecac);

    static Domicilio domicilioEmpleado9 = new Domicilio("ayacucho",5421,rosario,santaFe);
    static Empleado empleado9 = new Empleado("saracho","guadalupe",43445653,27434456530L,domicilioEmpleado9,osde);

}
