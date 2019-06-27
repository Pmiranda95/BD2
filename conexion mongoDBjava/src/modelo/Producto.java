package modelo;

public class Producto {
    private int id;
    private String descripcion;
    private String laboratorio;
    private int codigo;
    private  int precio;
    private  String tipo;//poner enum por (perfumeria o farmacia)

    public Producto(){};

    public Producto(String descripcion, String laboratorio, int codigo, int precio, String tipo) {
        this.descripcion = descripcion;
        this.laboratorio = laboratorio;
        this.codigo = codigo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
