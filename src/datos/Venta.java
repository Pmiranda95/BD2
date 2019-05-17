package datos;

import java.util.Calendar;
import java.util.Set;

public class Venta {

    private int id;
    private Calendar fecha;
    private int numeroTicker;
    private float totalVenta;
    private String formaDePago;
    private Set<ProductoVendido>productoVendidos;
    private float precioTotal;
    private Empleado atencion;
    private Empleado cobroCaja;

    public Venta(Calendar fecha, int numeroTicker, float totalVenta, String formaDePago, Set<ProductoVendido> productoVendidos, float precioTotal, Empleado atencion, Empleado cobroCaja) {
        this.fecha = fecha;
        this.numeroTicker = numeroTicker;
        this.totalVenta = totalVenta;
        this.formaDePago = formaDePago;
        this.productoVendidos = productoVendidos;
        this.precioTotal = precioTotal;
        this.atencion = atencion;
        this.cobroCaja = cobroCaja;
    }

    public  Venta(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTicker() {
        return numeroTicker;
    }

    public void setNumeroTicker(int numeroTicker) {
        this.numeroTicker = numeroTicker;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Set<ProductoVendido> getProductoVendidos() {
        return productoVendidos;
    }

    public void setProductoVendidos(Set<ProductoVendido> productoVendidos) {
        this.productoVendidos = productoVendidos;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
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
}
