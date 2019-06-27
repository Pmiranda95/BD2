package modelo;

public class Empleado {
    private int id;
    private String apellido;
    private String nombre;
    private int dni;
    private long cuit;
    private Domicilio domicilio;
    private ObraSocial obraSocial;
    private String Categoria;

    public Empleado(String apellido, String nombre, int dni, long cuit, Domicilio domicilio, ObraSocial obraSocial,String Categoria) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.cuit = cuit;
        this.domicilio = domicilio;
        this.obraSocial = obraSocial;
        this.Categoria = Categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
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

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
    
}
