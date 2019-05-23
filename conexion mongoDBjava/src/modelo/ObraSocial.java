package modelo;

public class ObraSocial {

    int _id;
    String nombre;
    int numeroAfiliado;

//    public ObraSocial(){};

    public ObraSocial(String nombre,int numeroAfiliado) {
        this.nombre=nombre;
        this.numeroAfiliado=numeroAfiliado;
    }

    public int getIdObraSocial() {
        return _id;
    }

    public void setIdObraSocial(int idObraSocial) {
        this._id = idObraSocial;
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
