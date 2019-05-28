package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Sucursal {

    private int id;
    private String nombre;
    private List<Empleado> empleados;
    private Domicilio domicilio;
    private Empleado encargado;
    private Cadena cadena;
    private List<Venta> ventas;

    public Sucursal(){};

    public Sucursal(String nombre,Domicilio domicilio, Empleado encargado, Cadena cadena) {
        this.nombre = nombre;
        this.empleados =  new ArrayList<Empleado>();
        this.domicilio = domicilio;
        this.encargado = encargado;
        this.cadena = cadena;
        this.ventas = new ArrayList<Venta>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }
}
