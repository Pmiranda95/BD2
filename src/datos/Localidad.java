package datos;

public class Localidad {
    private int id;
    private String nombre;
    private String codigo;
    private Provincia provincia;

    public Localidad(String nombre, String codigo,Provincia provincia) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.provincia= provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
