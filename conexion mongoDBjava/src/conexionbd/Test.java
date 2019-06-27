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
		
//		conexionSucursal.insert(SucursalData.sucursal1);
//		conexionSucursal.insert(SucursalData.sucursal2);
//		conexionSucursal.insert(SucursalData.sucursal3);
		
		
		
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
			Venta venta1 = new Venta(date1, 1, "tarjeta", listaProd1,EmpleadosData.empleado1,EmpleadosData.empleado1,ClienteData.cliente2,SucursalData.sucursal1);
			conexion.insert(venta1);

			date2= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd2 = new ArrayList<ProductoVendido>();
			ProductoVendido prod3 = new ProductoVendido(producto4, 3);
			ProductoVendido prod4= new ProductoVendido(producto5, 2);
			listaProd1.add(prod3);
			listaProd1.add(prod4);
			Venta venta2 = new Venta(date2, 2, "tarjeta", listaProd2,EmpleadosData.empleado1,EmpleadosData.empleado1,ClienteData.cliente2,SucursalData.sucursal1);

			conexion.insert(venta2);

			SimpleDateFormat sdf3 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString3 = "31-08-2019 12:20:56";
			Date date3;
			date3= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd3 = new ArrayList<ProductoVendido>();
			ProductoVendido prod5 = new ProductoVendido(producto6, 2);
			ProductoVendido prod6= new ProductoVendido(producto2, 1);
			listaProd3.add(prod3);
			listaProd3.add(prod4);
			Venta venta3 = new Venta(date3, 2, "tarjeta", listaProd3,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente3,SucursalData.sucursal1);

			conexion.insert(venta3);

 /**********		INSERT PRODUCTO 4 *************/
			SimpleDateFormat sdf4 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString4 = "31-08-2019 12:20:56";
			Date date4;
			date4= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd4 = new ArrayList<ProductoVendido>();
			ProductoVendido prod7 = new ProductoVendido(producto6, 2);
			ProductoVendido prod8= new ProductoVendido(producto2, 1);
			listaProd4.add(prod7);
			listaProd4.add(prod8);
			Venta venta4 = new Venta(date4, 2, "efectivo", listaProd4,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

//			conexion.insert(venta4);

			/**********		INSERT PRODUCTO 5 *************/
			SimpleDateFormat sdf5 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString5 = "31-08-2019 12:20:56";
			Date date5;
			date5= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd5 = new ArrayList<ProductoVendido>();
			listaProd5.add(new ProductoVendido(producto8, 2));
			listaProd5.add(new ProductoVendido(producto1, 1));
			Venta venta5 = new Venta(date5, 2, "efectivo", listaProd5,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente3,SucursalData.sucursal1);

			conexion.insert(venta5);

			/**********		INSERT PRODUCTO 6 *************/
			SimpleDateFormat sdf6 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString6 = "31-08-2019 12:20:56";
			Date date6;
			date6= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd6 = new ArrayList<ProductoVendido>();
			listaProd6.add(new ProductoVendido(producto9, 2));
			listaProd6.add(new ProductoVendido(producto2, 1));
			Venta venta6 = new Venta(date6, 2, "tarjeta", listaProd6,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta6);

			/**********		INSERT PRODUCTO 7 *************/
			SimpleDateFormat sdf7 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString7 = "31-08-2019 12:20:16";
			Date date7;
			date7= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd7 = new ArrayList<ProductoVendido>();
			listaProd7.add(new ProductoVendido(producto10, 2));
			listaProd7.add(new ProductoVendido(producto3, 1));
			Venta venta7 = new Venta(date7, 2, "tarjeta", listaProd7,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente4,SucursalData.sucursal1);

			conexion.insert(venta7);

			/**********		INSERT PRODUCTO 8 *************/
			SimpleDateFormat sdf8 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString8 = "31-08-2019 12:20:16";
			Date date8;
			date8= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd8 = new ArrayList<ProductoVendido>();
			listaProd8.add(new ProductoVendido(producto3, 2));
			listaProd8.add(new ProductoVendido(producto1, 1));
			Venta venta8 = new Venta(date8, 2, "tarjeta", listaProd8,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta8);

			/**********		INSERT PRODUCTO 9 *************/
			SimpleDateFormat sdf9 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString9 = "31-08-2019 12:20:16";
			Date date9;
			date9= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd9 = new ArrayList<ProductoVendido>();
			listaProd9.add(new ProductoVendido(producto8, 2));
			listaProd9.add(new ProductoVendido(producto1, 1));
			Venta venta9 = new Venta(date9, 2, "tarjeta", listaProd9,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente5,SucursalData.sucursal1);

			conexion.insert(venta9);

			/**********		INSERT PRODUCTO 10 *************/
			SimpleDateFormat sdf10 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString10 = "31-08-2019 12:20:106";
			Date date10;
			date10= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd10 = new ArrayList<ProductoVendido>();
			listaProd10.add(new ProductoVendido(producto4, 2));
			listaProd10.add(new ProductoVendido(producto1, 1));
			Venta venta10 = new Venta(date10, 2, "tarjeta", listaProd10,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta10);

			/**********		INSERT PRODUCTO 11 *************/
			SimpleDateFormat sdf11 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString11 = "31-08-2019 12:20:16";
			Date date11;
			date11= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd11 = new ArrayList<ProductoVendido>();
			listaProd11.add(new ProductoVendido(producto7, 2));
			listaProd11.add(new ProductoVendido(producto2, 1));
			Venta venta11 = new Venta(date11, 2, "tarjeta", listaProd11,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente5,SucursalData.sucursal1);

			conexion.insert(venta11);

			/**********		INSERT PRODUCTO 12 *************/
			SimpleDateFormat sdf12 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString12 = "31-08-2019 12:20:26";
			Date date12;
			date12= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd12 = new ArrayList<ProductoVendido>();
			listaProd12.add(new ProductoVendido(producto8, 2));
			listaProd12.add(new ProductoVendido(producto1, 1));
			Venta venta12 = new Venta(date12, 2, "tarjeta", listaProd12,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente2,SucursalData.sucursal1);

			conexion.insert(venta12);

			/**********		INSERT PRODUCTO 13 *************/
			SimpleDateFormat sdf13 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString13 = "31-08-2019 12:20:36";
			Date date13;
			date13= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd13 = new ArrayList<ProductoVendido>();
			listaProd13.add(new ProductoVendido(producto2, 2));
			listaProd13.add(new ProductoVendido(producto5, 1));
			Venta venta13 = new Venta(date13, 2, "tarjeta", listaProd13,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente2,SucursalData.sucursal1);

			conexion.insert(venta13);

			/**********		INSERT PRODUCTO 14 *************/
			SimpleDateFormat sdf14 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString14 = "31-08-2019 12:20:46";
			Date date14;
			date14= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd14 = new ArrayList<ProductoVendido>();
			listaProd14.add(new ProductoVendido(producto7, 2));
			listaProd14.add(new ProductoVendido(producto3, 1));
			Venta venta14 = new Venta(date14, 2, "tarjeta", listaProd14,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente3,SucursalData.sucursal1);

			conexion.insert(venta14);

			/**********		INSERT PRODUCTO 15 *************/
			SimpleDateFormat sdf15 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString15 = "31-08-2019 12:20:56";
			Date date15;
			date15= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd15 = new ArrayList<ProductoVendido>();
			listaProd15.add(new ProductoVendido(producto9, 2));
			listaProd15.add(new ProductoVendido(producto10, 1));
			Venta venta15 = new Venta(date15, 2, "tarjeta", listaProd15,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente3,SucursalData.sucursal1);

			conexion.insert(venta15);

			/**********		INSERT PRODUCTO 16 *************/
			SimpleDateFormat sdf16 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString16 = "31-08-2019 12:20:16";
			Date date16;
			date16= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd16 = new ArrayList<ProductoVendido>();
			listaProd16.add(new ProductoVendido(producto6, 2));
			listaProd16.add(new ProductoVendido(producto2, 1));
			Venta venta16 = new Venta(date16, 2, "efectivo", listaProd16,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente5,SucursalData.sucursal1);

			conexion.insert(venta16);

			/**********		INSERT PRODUCTO 17 *************/
			SimpleDateFormat sdf17 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString17 = "31-08-2019 12:20:16";
			Date date17;
			date17= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd17 = new ArrayList<ProductoVendido>();
			listaProd17.add(new ProductoVendido(producto8, 2));
			listaProd17.add(new ProductoVendido(producto9, 1));
			Venta venta17 = new Venta(date17, 2, "efectivo", listaProd17,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente5,SucursalData.sucursal1);

			conexion.insert(venta17);

			/**********		INSERT PRODUCTO 18 *************/
			SimpleDateFormat sdf18 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString18 = "31-08-2019 12:20:16";
			Date date18;
			date18= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd18 = new ArrayList<ProductoVendido>();
			listaProd18.add(new ProductoVendido(producto8, 2));
			listaProd18.add(new ProductoVendido(producto4, 1));
			Venta venta18 = new Venta(date18, 2, "efectivo", listaProd18,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente2,SucursalData.sucursal1);

			conexion.insert(venta18);

			/**********		INSERT PRODUCTO 19 *************/
			SimpleDateFormat sdf19 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString19 = "31-08-2019 12:20:36";
			Date date19;
			date19= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd19 = new ArrayList<ProductoVendido>();
			listaProd19.add(new ProductoVendido(producto2, 2));
			listaProd19.add(new ProductoVendido(producto7, 1));
			Venta venta19 = new Venta(date19, 2, "efectivo", listaProd19,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta19);

			/**********		INSERT PRODUCTO 20 *************/
			SimpleDateFormat sdf20 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString20 = "31-08-2019 12:20:26";
			Date date20;
			date20= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd20 = new ArrayList<ProductoVendido>();
			listaProd20.add(new ProductoVendido(producto8, 2));
			listaProd20.add(new ProductoVendido(producto1, 1));
			Venta venta20 = new Venta(date20, 2, "tarjeta", listaProd20,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta20);

			/**********		INSERT PRODUCTO 21 *************/
			SimpleDateFormat sdf21 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString21 = "31-08-2019 12:20:26";
			Date date21;
			date21= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd21 = new ArrayList<ProductoVendido>();
			listaProd21.add(new ProductoVendido(producto8, 2));
			listaProd21.add(new ProductoVendido(producto10, 1));
			Venta venta21 = new Venta(date21, 2, "tarjeta", listaProd21,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente2,SucursalData.sucursal1);

			conexion.insert(venta21);

			/**********		INSERT PRODUCTO 22 *************/
			SimpleDateFormat sdf22 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString22 = "31-08-2019 12:20:26";
			Date date22;
			date22= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd22 = new ArrayList<ProductoVendido>();
			listaProd22.add(new ProductoVendido(producto2, 2));
			listaProd22.add(new ProductoVendido(producto5, 1));
			Venta venta22 = new Venta(date22, 2, "tarjeta", listaProd22,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente7,SucursalData.sucursal1);

			conexion.insert(venta22);

			/**********		INSERT PRODUCTO 23 *************/
			SimpleDateFormat sdf23 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString23 = "31-08-2019 12:20:36";
			Date date23;
			date23= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd23 = new ArrayList<ProductoVendido>();
			listaProd23.add(new ProductoVendido(producto8, 2));
			listaProd23.add(new ProductoVendido(producto5, 1));
			Venta venta23 = new Venta(date23, 2, "tarjeta", listaProd23,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente7,SucursalData.sucursal1);

			conexion.insert(venta23);

			/**********		INSERT PRODUCTO 24 *************/
			SimpleDateFormat sdf24 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString24 = "31-08-2019 12:20:46";
			Date date24;
			date24= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd24 = new ArrayList<ProductoVendido>();
			listaProd24.add(new ProductoVendido(producto3, 2));
			listaProd24.add(new ProductoVendido(producto5, 1));
			Venta venta24 = new Venta(date24, 2, "tarjeta", listaProd24,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente5,SucursalData.sucursal1);

			conexion.insert(venta24);

			/**********		INSERT PRODUCTO 25 *************/
			SimpleDateFormat sdf25 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString25 = "31-08-2019 12:20:56";
			Date date25;
			date25= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd25 = new ArrayList<ProductoVendido>();
			listaProd25.add(new ProductoVendido(producto8, 2));
			listaProd25.add(new ProductoVendido(producto1, 1));
			Venta venta25 = new Venta(date25, 2, "tarjeta", listaProd25,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente5,SucursalData.sucursal1);

			conexion.insert(venta25);

			/**********		INSERT PRODUCTO 26 *************/
			SimpleDateFormat sdf26 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString26 = "31-08-2019 12:20:36";
			Date date26;
			date26= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd26 = new ArrayList<ProductoVendido>();
			listaProd26.add(new ProductoVendido(producto5, 2));
			listaProd26.add(new ProductoVendido(producto9, 1));
			Venta venta26 = new Venta(date26, 2, "tarjeta", listaProd26,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta26);

			/**********		INSERT PRODUCTO 27 *************/
			SimpleDateFormat sdf27 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString27 = "31-08-2019 12:20:26";
			Date date27;
			date27= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd27 = new ArrayList<ProductoVendido>();
			listaProd27.add(new ProductoVendido(producto10, 2));
			listaProd27.add(new ProductoVendido(producto1, 1));
			Venta venta27 = new Venta(date27, 2, "tarjeta", listaProd27,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta27);

			/**********		INSERT PRODUCTO 28 *************/
			SimpleDateFormat sdf28 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString28 = "31-08-2019 12:20:26";
			Date date28;
			date28= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd28 = new ArrayList<ProductoVendido>();
			listaProd28.add(new ProductoVendido(producto3, 2));
			listaProd28.add(new ProductoVendido(producto4, 1));
			Venta venta28 = new Venta(date28, 2, "tarjeta", listaProd28,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente8,SucursalData.sucursal1);

			conexion.insert(venta28);

			/**********		INSERT PRODUCTO 29 *************/
			SimpleDateFormat sdf29 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString29 = "31-08-2019 12:20:26";
			Date date29;
			date29= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd29 = new ArrayList<ProductoVendido>();
			listaProd29.add(new ProductoVendido(producto3, 2));
			listaProd29.add(new ProductoVendido(producto7, 1));
			Venta venta29 = new Venta(date29, 2, "tarjeta", listaProd29,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente8,SucursalData.sucursal1);

			conexion.insert(venta29);

			/**********		INSERT PRODUCTO 30 *************/
			SimpleDateFormat sdf30 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
			String dateInString30 = "31-08-2019 12:20:36";
			Date date30;
			date30= sdf2.parse(dateInString2);
			ArrayList<ProductoVendido> listaProd30 = new ArrayList<ProductoVendido>();
			listaProd30.add(new ProductoVendido(producto7, 2));
			listaProd30.add(new ProductoVendido(producto8, 1));
			Venta venta30 = new Venta(date30, 2, "tarjeta", listaProd30,EmpleadosData.empleado2,EmpleadosData.empleado1,ClienteData.cliente1,SucursalData.sucursal1);

			conexion.insert(venta30);



		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		/************************************************Insertar Clientes********************************************/

//		conexionCliente.insertCliente(ClienteData.cliente1,SucursalData.sucursal1);
//		conexionCliente.insertCliente(ClienteData.cliente2);
//		conexionCliente.insertCliente(ClienteData.cliente3);
//		conexionCliente.insertCliente(ClienteData.cliente4);
//		conexionCliente.insertCliente(ClienteData.cliente5);
//		conexionCliente.insertCliente(ClienteData.cliente6);
//		conexionCliente.insertCliente(ClienteData.cliente7);
//		conexionCliente.insertCliente(ClienteData.cliente8);
//		conexionCliente.insertCliente(ClienteData.cliente9);
//		conexionCliente.insertCliente(ClienteData.cliente1,SucursalData.sucursal10);
		
		/**********************************************Insertar Productos************************************************************************/
		
//		conexionProducto.insert(ProductosData.producto1);
//		conexionProducto.insert(ProductosData.producto2);
//		conexionProducto.insert(ProductosData.producto3);
//		conexionProducto.insert(ProductosData.producto4);
//		conexionProducto.insert(ProductosData.producto5);
//		conexionProducto.insert(ProductosData.producto6);
//		conexionProducto.insert(ProductosData.producto7);
//		conexionProducto.insert(ProductosData.producto8);
//		conexionProducto.insert(ProductosData.producto9);
//		conexionProducto.insert(ProductosData.producto10);

		
		//conexion.mostrar();
	}
	
	
	
}
