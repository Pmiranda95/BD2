package conexionbd;

//import com.google.gson.Gson;

import modelo.*;
import conexionbd.EmpleadosData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static conexionbd.ClientesData.cliente1;
import static conexionbd.ClientesData.cliente2;
import static conexionbd.EmpleadosData.*;
import static conexionbd.ProductosData.*;
import static conexionbd.SucursalData.sucursal1;

public class Test {

	public static void main(String[] args) {
		Connexion conexion = new Connexion("Ventas");
		

//                new ObraSocial("IOMA",33123));
//

//		conexion.setNameCollection("sucursal_prueba"); //no funca el cambio de collection
//		sucursal1.getEmpleados().add(empleado1);
//		sucursal1.getEmpleados().add(empleado2);
//		sucursal1.getEmpleados().add(empleado3);
//		conexion.insert(sucursal1);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString1 = "31-08-2018 10:20:56";
		Date date1 ;
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString2 = "31-08-2019 12:20:56";
		Date date2;
		try {
			date1 = sdf1.parse(dateInString1);
			ArrayList<ProductoVendido> listaProd1 = new ArrayList<ProductoVendido>();
			ProductoVendido prod1 = new ProductoVendido(producto1, 2);
			ProductoVendido prod2 = new ProductoVendido(producto2, 1);
			listaProd1.add(prod1);
			listaProd1.add(prod2);
			Venta venta1 = new Venta(date1, 1, "tarjeta", listaProd1,empleado1,empleado1,cliente1);
			conexion.insert(venta1);
	/****************************************************************************************************/
			date2= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd2 = new ArrayList<ProductoVendido>();
			ProductoVendido prod3 = new ProductoVendido(producto4, 3);
			ProductoVendido prod4= new ProductoVendido(producto5, 2);
			listaProd1.add(prod3);
			listaProd1.add(prod4);
			Venta venta2 = new Venta(date2, 2, "tarjeta", listaProd1,empleado1,empleado1,cliente2);

			conexion.insert(venta2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		



		conexion.mostrar();
	}
	
	
	
}
