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
		
		Cliente cliente = new Cliente("Pablo","Miranda",39000075,new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),new ObraSocial("Osde",54654));
		ObraSocial obraSocial = new ObraSocial("gonza",1123);
		Empleado empleado = new Empleado("Miranda","Pablo",3900075,45454544,new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),obraSocial);
		Sucursal sucursal = new Sucursal("Roberto Gonzales",new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),empleado,new Cadena("garbaritno"));
		conexion.insert(sucursal);
		
		conexion.mostrar();
	}
	
	
	
}
