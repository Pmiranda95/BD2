package conexionbd;

import com.google.gson.Gson;

import modelo.Cliente;
import modelo.Domicilio;
import modelo.Localidad;
import modelo.ObraSocial;
import modelo.Provincia;

public class Test {

	public static void main(String[] args) {
		Connexion conexion = new Connexion();
		
		Cliente cliente = new Cliente("Pablo","Miranda",39000075,new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),new ObraSocial("Osde",54654));
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		//System.out.println(json);
		conexion.insert(json);
		//conexion.actualizar("Roberto Carlos","Pablito Miranda");
		//conexion.eliminar("Roberto Carlos");
		conexion.mostrar();
		//serializeUserSimple();
		
		
	}
	
	/*private static  void serializeUserSimple() {
		Cliente cliente = new Cliente("Pablo","Miranda",39000075,new Domicilio("Bolonia",2528,new Localidad("Banfield","54645"),new Provincia("Buenos aires","4654")),new ObraSocial("Osde",54654));
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		System.out.println(json);
	}*/
	
}
