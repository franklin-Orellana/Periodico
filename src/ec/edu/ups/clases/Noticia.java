package ec.edu.ups.clases;

import java.util.Date;

/**
 * Noticia
 *
 * clase que permite identificar las partes de una noticia
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Noticia {//clase con el nombre de Noticia

    private String titulo;//titulo de cada objeto Noticia
    private String autor;//autor de cada objeto Noticia
    private Date fecha;//fecha de cada objeto Noticia
    private String contenido;//contenido de cada objeto Noticia
    private Multimedia multimedia;//multimedia de cada objeto Noticia

    public void setTitulo(String titulo) {//metodo para establecer el Titulo
        this.titulo = titulo;//Titulo adopta el valor que contenga titulo
    }//cierre del metodo

    public void setAutor(String autor) {//metodo para establecer el Autor
        this.autor = autor;//Autor adopta el valor que contenga autor
    }//cierre del metodo

    public void setFecha(Date fecha) {//metodo para establecer Fecha
        this.fecha = fecha;//Fecha adopta el valor que contenga fecha 
    }//cierre del metodo

    public void setContenido(String contenido) {//metodo para establecer Contenido
        this.contenido = contenido;//Contenido adopta el valor que contenga contenido
    }//cierre del metodo

    public void setMultimedia(Multimedia multimedia) {//metod para establecer Multimedia
        this.multimedia = multimedia;//Multimedia adopta el valor que contenga multimedia
    }//cierre del metodo

    public String getTitulo() {//metodo para obtener el titulo del objeto Noticia
        return this.titulo;
    }//cierre del metodo

    public String getAutor() {//metodo para obtener el autor del objeto Noticia
        return this.autor;
    }//cierre del metodo

    public Date getFecha() {//metodo para obtener la fecha del objeto Noticia
        return this.fecha;
    }//cierre del metodo

    public String getContenido() {//metodo para obtener el contenido del objeto Noticia
        return this.contenido;
    }//cierre del metodo

    public Multimedia getMultimedia() {//metodo para obtener multimedia del objeto Noticia
        return this.multimedia;
    }//cierre del metodo

}//cierre de la clase
