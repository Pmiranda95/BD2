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

import conexionbd.ClienteData;

import  conexionbd.EmpleadosData.*;
import static conexionbd.ProductosData.*;
import conexionbd.SucursalData;
import conexionbd.ProductosData;

public class Test {

	public static void main(String[] args) {
		Connexion conexion = new Connexion("Ventas");
		Connexion conexionCliente = new Connexion("Cliente");
		Connexion conexionSucursal = new Connexion("Sucursal");
		Connexion conexionProducto = new Connexion("Producto");

		/******************************************Insertar Sucursales*********************************************************/
		SucursalData.sucursal1.getEmpleados().add(EmpleadosData.empleado1);
		SucursalData.sucursal1.getEmpleados().add(EmpleadosData.empleado2);
		SucursalData.sucursal1.getEmpleados().add(EmpleadosData.empleado3);
		
		SucursalData.sucursal2.getEmpleados().add(EmpleadosData.empleado4);
		SucursalData.sucursal2.getEmpleados().add(EmpleadosData.empleado5);
		SucursalData.sucursal2.getEmpleados().add(EmpleadosData.empleado6);
		
		SucursalData.sucursal3.getEmpleados().add(EmpleadosData.empleado7);
		SucursalData.sucursal3.getEmpleados().add(EmpleadosData.empleado8);
		SucursalData.sucursal3.getEmpleados().add(EmpleadosData.empleado9);
		
		conexionSucursal.insert(SucursalData.sucursal1);
		conexionSucursal.insert(SucursalData.sucursal2);
		conexionSucursal.insert(SucursalData.sucursal3);
		
		
		
		/*********************Insertamos VEntas*******************************************************************************/

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
			Venta venta1 = new Venta(date1, 1, "tarjeta", listaProd1,EmpleadosData.empleado1,EmpleadosData.empleado1,ClienteData.cliente1);
			conexion.insert(venta1);
			date2= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd2 = new ArrayList<ProductoVendido>();
			ProductoVendido prod3 = new ProductoVendido(producto4, 3);
			ProductoVendido prod4= new ProductoVendido(producto5, 2);
			listaProd1.add(prod3);
			listaProd1.add(prod4);
			Venta venta2 = new Venta(date2, 2, "tarjeta", listaProd1,EmpleadosData.empleado1,EmpleadosData.empleado1,ClienteData.cliente2);

			conexion.insert(venta2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		/************************************************Insertar Clientes********************************************/

		conexionCliente.insertCliente(ClienteData.cliente1);
		conexionCliente.insertCliente(ClienteData.cliente2);
		conexionCliente.insertCliente(ClienteData.cliente3);
		conexionCliente.insertCliente(ClienteData.cliente4);
		conexionCliente.insertCliente(ClienteData.cliente5);
		conexionCliente.insertCliente(ClienteData.cliente6);
		conexionCliente.insertCliente(ClienteData.cliente7);
		conexionCliente.insertCliente(ClienteData.cliente8);
		conexionCliente.insertCliente(ClienteData.cliente9);
		conexionCliente.insertCliente(ClienteData.cliente10);
		
		/**********************************************Insertar Productos************************************************************************/
		
		conexionProducto.insert(ProductosData.producto1);
		conexionProducto.insert(ProductosData.producto2);
		conexionProducto.insert(ProductosData.producto3);
		conexionProducto.insert(ProductosData.producto4);
		conexionProducto.insert(ProductosData.producto5);
		conexionProducto.insert(ProductosData.producto6);
		conexionProducto.insert(ProductosData.producto7);
		conexionProducto.insert(ProductosData.producto8);
		conexionProducto.insert(ProductosData.producto9);
		conexionProducto.insert(ProductosData.producto10);

		
		//conexion.mostrar();
	}
	
	
	
}
