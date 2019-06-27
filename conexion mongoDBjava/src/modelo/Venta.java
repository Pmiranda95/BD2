package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

public class Venta {

    private int id;
    private Date fecha;
    private int numeroTicker;
    private String formaDePago;
    private int precioTotal;
    private ArrayList<ProductoVendido> productoVendidos;
    private Empleado atencion;
    private Empleado cobroCaja;
    private Cliente cliente;
    private Sucursal sucursal;

    public Venta(Date fecha, int numeroTicker,String formaDePago, ArrayList<ProductoVendido> productoVendidos,Empleado atencion, Empleado cobroCaja,Cliente cliente,Sucursal sucursal) {
        this.fecha = fecha;
        this.numeroTicker = numeroTicker;
        this.formaDePago = formaDePago;
        this.productoVendidos = productoVendidos;
        this.setPrecioTotal();
        this.atencion = atencion;
        this.cobroCaja = cobroCaja;
        this.cliente = cliente;
        this.sucursal = sucursal;
    }

    public  Venta(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTicker() {
        return numeroTicker;
    }

    public void setNumeroTicker(int numeroTicker) {
        this.numeroTicker = numeroTicker;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public ArrayList<ProductoVendido> getProductoVendidos() {
        return productoVendidos;
    }

    public void setProductoVendidos(ArrayList<ProductoVendido> productoVendidos) {
        this.productoVendidos = productoVendidos;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {
        int precioTotal=0;
        for(ProductoVendido p:this.productoVendidos){
            precioTotal+=p.getProducto().getPrecio()*p.getCantidad();
        }
        this.precioTotal = precioTotal;
    }

    public Empleado getAtencion() {
        return atencion;
    }

    public void setAtencion(Empleado atencion) {
        this.atencion = atencion;
    }

    public Empleado getCobroCaja() {
        return cobroCaja;
    }

    public void setCobroCaja(Empleado cobroCaja) {
        this.cobroCaja = cobroCaja;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

}
