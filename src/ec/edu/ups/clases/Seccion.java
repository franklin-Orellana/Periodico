package ec.edu.ups.clases;

public class Seccion {

    private String nombre;
    private Noticia[] noticia;
    
    

    public void setNoticia(Noticia[] noticia) {
        this.noticia = noticia;
    }

    public Noticia[] getNoticia() {
        return this.noticia;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return this.nombre;
    }
}
