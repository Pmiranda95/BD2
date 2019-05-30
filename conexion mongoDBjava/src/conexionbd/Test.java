package conexionbd;

import com.google.gson.Gson;

import modelo.Cliente;
import modelo.Domicilio;
import modelo.Empleado;
import modelo.Localidad;
import modelo.ObraSocial;
import modelo.Provincia;
import modelo.Sucursal;
import modelo.Cadena;
public class Test {

	public static void main(String[] args) {
		Connexion conexion = new Connexion();
		
		Cliente cliente = new Cliente("Lionel","Messi",39000075,new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),new ObraSocial("Osde",54654));
		ObraSocial obraSocial = new ObraSocial("gonza",1123);
		Empleado empleado1 = new Empleado("Miranda","Pablo",3900075,45454544,new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),obraSocial);
		Empleado empleado2 = new Empleado("Messi","Pablo",3900075,45454544,new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),obraSocial);
		Sucursal sucursal = new Sucursal("Roberto Gonzales",new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),empleado1,new Cadena("garbaritno"));

//		sucursal.getEmpleados().add(empleado1);
//		sucursal.getEmpleados().add(empleado2);

		conexion.insert(cliente);
		
//		conexion.mostrar();
	}
	
	
	
}
