package modelo;

public class ObraSocial {

    private int id;
    private String nombre;
    private int numeroAfiliado;

    public ObraSocial(){};


    public ObraSocial(String nombre,int numeroAfiliado) {
        this.nombre=nombre;
        this.numeroAfiliado=numeroAfiliado;
    }

    public int getIdObraSocial() {
        return id;
    }

    public void setIdObraSocial(int idObraSocial) {
        this.id = idObraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAfiliado() {
        return numeroAfiliado;
    }

    public void setNumeroAfiliado(int numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }
}
