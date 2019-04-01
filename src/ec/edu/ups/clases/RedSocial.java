package ec.edu.ups.clases;

/**
 * RedSocial
 *
 * clase que permite identificar la red social y sus principales componentes
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class RedSocial {//clase con el nombre de RedSocial

    private int codigo;//codigo de cada objeto RedSocial
    private String nombre;//nombre de cada objeto RedSocial
    private String url;//url de cada objeto RedSocial
    private String publicaciones;//publicaciones de cada objeto RedSocial

    public void setCodigo(int codigo) {//metodo para establecer el Codigo
        this.codigo = codigo;//Codigo adopta el valor que contenga codigo
    }//cierre del metodo

    public void setNombre(String nombre) {//metodo para establecer el Nombre
        this.nombre = nombre;//Nombre adopta el valor que contenga nombre
    }//cierre del metodo

    public void setUrl(String url) {//metodo para establecer el url
        this.url = url;//Url adopta el valor que contenga url
    }//cierre del metodo

    public int getCodigo() {//metodo para obtener el Codigo del objeto RedSocial
        return this.codigo;
    }//cierre del metodo

    public String getNombre() {//metodo para obtener el Nombre del objeto RedSocial
        return this.nombre;
    }//cierre del metodo

    public String getUrl() {//metodo para obtener el Url del objeto RedSocial
        return this.url;
    }//cierre del metodo
}//cierre de la clase
