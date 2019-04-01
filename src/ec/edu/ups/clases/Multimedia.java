package ec.edu.ups.clases;

import java.util.Date;

/**
 * Multimedia
 *
 * clase que permite identificar el tipo de multimedia y sus cualidades
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class Multimedia {//clase con el nombre de Multimedia

    private String nombre;//nombre de cada objeto Multimedia
    private String formato;//formato de cada objeto Multimedia
    private double tamañoBytes;//tama;oBytes de cada objeto Multimedia
    private String pat;//pat de cada objeto Multimedia
    private Byte[] archivo;//archivo de cada objeto Multimedia
    private Date creacion;//creacion de cada objeto Multimedia
    private Date modificacion;//modificacion de cada objeto Multimedia

    public Date getCreacion() {//metodo que sirve para obetener la creacion del objeto Multimedia
        return this.creacion;
    }//cierre metodo

    public Date getModificacion() {//metodo que sirve para obetener la modificacion del objeto Multimedia
        return this.modificacion;
    }//cierre metodo

    public void setCreacion(Date creacion) {//metodo para establecer Creacion
        this.creacion = creacion;//Creacion adopta el valor que contenga creacion
    }//cierre metodo

    public void setModificacion(Date modificacion) {//metodo para establecer Modificacion
        this.modificacion = modificacion;//Modificacion adopta el valor que contenga modificacion
    }//cierre metodo

    public String getFormato() {//metodo que sirve para obetener el formato del objeto Multimedia
        return this.formato;
    }//cierre metodo

    public double getTamañoBytes() {//metodo que sirve para obetener el TamanoBytes del objeto Multimedia
        return this.tamañoBytes;
    }//cierre metodo

    public String getPat() {//metodo que sirve para obetener el Pat del objeto Multimedia
        return this.pat;
    }//cierre metodo

    public String getNombre() {//metodo que sirve para obetener el Nombre del objeto Multimedia
        return this.nombre;
    }//cierre metodo

    public Byte[] getArchivo() {//metodo que sirve para obetener el Archivo del objeto Multimedia
        return this.archivo;
    }//cierre metodo

    public void setFormato(String formato) {//metodo para establecer Formato
        this.formato = formato;//Formato adopta el valor que contenga formato
    }//cierre metodo

    public void setTamañoBytes(double tamañoBytes) {//metodo para establecer TamanoBytes
        this.tamañoBytes = tamañoBytes;//tamanoBytes adopta el valor que contenga tamanoBytes
    }//cierre metodo

    public void setPat(String pat) {//metodo para establecer Pat
        this.pat = pat;//Pat adopta el valor que contenga pat
    }//cierre metodo

    public void setNombre(String nombre) {//metodo para obtener Nombre
        this.nombre = nombre;//Nombre adopta el valor que contenga nombre
    }//cierre metodo

    public void setArchivo(Byte[] archivo) {//metodo para obtener Archivo
        this.archivo = archivo;//Archivo adopta el valor que contenga archivo
    }//cierre metodo

}//cierre clase
