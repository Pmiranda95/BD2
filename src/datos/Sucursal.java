package datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Sucursal {

    private int id;
    private String nombre;
    private Set<Empleado> empleados;
    private Domicilio domicilio;
    private Empleado encargado;
    private Cadena cadena;

    public Sucursal(){};

    public Sucursal(String nombre, Set<Empleado> empleados, Domicilio domicilio, Empleado encargado, Cadena cadena) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.domicilio = domicilio;
        this.encargado = encargado;
        this.cadena = cadena;
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

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
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
