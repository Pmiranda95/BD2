package datos;

public class Cadena {

    private int id;
    private String nombre;

    public Cadena(String nombre) {
        this.nombre = nombre;
    }

    public Cadena(){};

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
}
