package ec.edu.ups.clases;

/**
 * Seccion
 *
 * clase que permite separar la seccion de noticia y sus partes
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Seccion {//clase con el nombre de Seccion

    private String nombre;//nombre de cada objeto Seccion
    private Noticia[] noticia;//noticia de cada objeto Seccion

    public void setNoticia(Noticia[] noticia) {//metodo para establecer Noticia
        this.noticia = noticia;//Noticia adopta el valor que contenga noticia
    }//cierre del metodo

    public Noticia[] getNoticia() {//metodo para obtener la noticia del objeto Seccion
        return this.noticia;
    }//cierre del metodo

    public void setNombre(String nombre) {//metodo para establecer Nombre
        this.nombre = nombre;//Nombre adopta el valor que contenga nombre
    }//cierre del metodo

    public String getNombre() {//metodo para obtener el Nombre del objeto Seccion
        return this.nombre;
    }//cierre del metodo
}//cierre de la clase
