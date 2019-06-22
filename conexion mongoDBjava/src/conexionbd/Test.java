package conexionbd;

//import com.google.gson.Gson;

import modelo.*;
import conexionbd.EmpleadosData;

import java.util.ArrayList;
import java.util.Calendar;

import static conexionbd.EmpleadosData.*;
import static conexionbd.ProductosData.*;
import static conexionbd.SucursalData.sucursal1;

public class Test {

	public static void main(String[] args) {
		Connexion conexion = new Connexion("Ventas");
		
//		Cliente cliente1 = new Cliente("Lionel","Messi",39000075,
//                new Domicilio("Bolonia",2528,
//                        new Localidad("Banfield","54645"),
//                        new Provincia("Buenos aires","4654")
//                ),
//                new ObraSocial("Osde",54654));
//
//        Cliente cliente2 = new Cliente("Aguero","Sergio",39223453,
//                new Domicilio("29 de septiembre",251,
//                        new Localidad("Lanus","1824"),
//                        new Provincia("Buenos aires","4654")
//                ),
//                new ObraSocial("Osde",54655));
//
//        Cliente cliente3 = new Cliente("Gonzalo","Muscolo",39443242,
//                new Domicilio("Margarita wield",1232,
//                        new Localidad("Lanus","1824"),
//                        new Provincia("Buenos aires","4654")
//                ),
//                new ObraSocial("IOMA",33123));
//

//		conexion.setNameCollection("sucursal_prueba"); //no funca el cambio de collection
//		sucursal1.getEmpleados().add(empleado1);
//		sucursal1.getEmpleados().add(empleado2);
//		sucursal1.getEmpleados().add(empleado3);
//		conexion.insert(sucursal1);


		ArrayList<ProductoVendido> listaProd1 = new ArrayList<ProductoVendido>();
		ProductoVendido prod1 = new ProductoVendido(producto1, 2);
		ProductoVendido prod2 = new ProductoVendido(producto2, 1);
		listaProd1.add(prod1);
		listaProd1.add(prod2);
		Venta venta1 = new Venta(1, 1, "tarjeta", listaProd1,empleado1,empleado1);

		conexion.insert(venta1);

		ArrayList<ProductoVendido> listaProd2 = new ArrayList<ProductoVendido>();
		ProductoVendido prod3 = new ProductoVendido(producto4, 3);
		ProductoVendido prod4= new ProductoVendido(producto5, 2);
		listaProd1.add(prod3);
		listaProd1.add(prod4);
		Venta venta2 = new Venta(1, 2, "tarjeta", listaProd1,empleado1,empleado1);

		conexion.insert(venta2);



		conexion.mostrar();
	}
	
	
	
}
