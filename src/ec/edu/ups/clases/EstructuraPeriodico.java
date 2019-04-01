package ec.edu.ups.clases;

import java.util.Date;

/**
 * EstructuraPeriodico
 *
 * Clase aqui nos permite estructurar el periodico digital
 *
 * @since 2019
 * @version 2.0
 * @author Franklin Orellana
 */
public class EstructuraPeriodico {// Clase la nombramos como EstructuraPeriodico

    private String ubicacion;// ubicacion de cada objeto EstructuraPeriodica
    private String nombrePeriodico;//nombrePeriodico de cada obejto EstructuraPeriodica
    private Date fecha;//fecha de cada objeto EstructuraPeriodica

    public void setUbicacion(String ubicacion) {//metodo para establecer la ubicacion
        this.ubicacion = ubicacion;//ubicacion adopta el valor que contenga ubicacion
    }//cierre del metodo

    public void setNombrePeriodico(String nombrePeriodico) {// metodo para establecer el nombre del periodico
        this.nombrePeriodico = nombrePeriodico;//nombre de periodico adopta el valor que contenga nombrePeriodico
    }//cierre del metodo

    public void setFecha(Date fecha) {//metodo para establecer una fecha en la EstructuraPeriodica
        this.fecha = fecha;//fecha adopta el valor que contenga fecha
    }//cierre del metodo

    public String getUbicacion() {//metodo para obtener la ubicacion del objeto EstructuraPeriodica
        return this.ubicacion;
    }//cierre del metodo

    public String getNombrePeriodico() {// metodo para obtener el nombre del periodico del objeto EstructuraPeriodica 
        return this.nombrePeriodico;
    }//cierre del metodo

    public Date getFecha() {//metodo para obtener la fecha del objeto EstructuraPeriodica
        return this.fecha;
    }//cierre del metodo
}//cierre de la clase
