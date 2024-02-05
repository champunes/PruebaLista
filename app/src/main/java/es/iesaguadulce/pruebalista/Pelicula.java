package es.iesaguadulce.pruebalista;

public class Pelicula {

    private int id;
    private String nombre;
    private String caratula;

    public Pelicula(int id, String nombre, String caratula) {
        this.id = id;
        this.nombre = nombre;
        this.caratula = caratula;
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

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }
}
