package datos;

public class Cliente {

    private int id;
    private String apellido;
    private String nombre;
    private Domicilio domicilio;
    private ObraSocial obraSocial;

    public Cliente(String apellido, String nombre, Domicilio domicilio, ObraSocial obraSocial) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.obraSocial = obraSocial;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}
