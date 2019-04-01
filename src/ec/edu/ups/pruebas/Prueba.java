package ec.edu.ups.pruebas;//package se utilizar para agrupar clases seleccionadas

/**
 * import sirve para importar clases de un paquete
 */
import ec.edu.ups.clases.Seccion;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.EstructuraPeriodico;
import java.util.Date;

public class Prueba {//clase con nombre Prueba

    public static void main(String[] args) {//Es el punto de entrada a un proceso o programa en la clase principal
        System.out.println("----------------------");
        //asignando valores a los campos facebook
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");

        int cod = facebook.getCodigo();
        System.out.println("Codigo: " + cod);//imprime el Codigo en una ventana de consola
        String nom = facebook.getNombre();
        System.out.println("Nombre: " + nom);//imprime el Nombre en una ventana de consola
        String url = facebook.getUrl();
        System.out.println("URL: " + url);//imprime la URL en una ventana de consola
        System.out.println(" ");

        System.out.println("----------------------");
        //asignando valores a los campos sec
        System.out.println(" ");
        Seccion sec = new Seccion();
        sec.setNombre("Futbol");
        Noticia noticia = new Noticia();

        String secNombre = sec.getNombre();
        System.out.println("Seccion: " + secNombre);//imprime el Nombre de la seccion en una ventana de consola
        Noticia[] noti = new Noticia[1];
        noti[0] = noticia;
        sec.setNoticia(noti);
        System.out.println("Noticia: " + noti);//imprime la Noticia en una ventana de consola
        System.out.println(" ");

        System.out.println("----------------------");
        //asignando valores a los campos video
        System.out.println(" ");
        Multimedia video = new Multimedia();
        Byte[] bytes = {1, 2, 3};
        video.setArchivo(bytes);
        video.setFormato(" .mp4 ");
        video.setTamañoBytes(20.12);
        video.setNombre("Video1");
        video.setPat("Av. las americas");
        video.setCreacion(new Date());
        video.setModificacion(new Date());

        String nomb = video.getNombre();
        System.out.println("Nombre:  " + nomb);//imprime el Nombre en una ventana de consola
        String pat = video.getPat();
        System.out.println("Ubicacion:  " + pat);//imprime la Ubicacion en una ventana de consola
        bytes = video.getArchivo();
        System.out.println("Archivo: " + bytes);//imprime el Archivo en una ventana de consola
        String form = video.getFormato();
        System.out.println("Fomato: " + form);//imprime el Formato en una ventana de consola
        double tam = video.getTamañoBytes();
        System.out.println("Tamaño: " + tam);//imprime el Tamano en una ventana de consola
        Date fech = video.getCreacion();
        System.out.println("Creacion: " + fech);//imprime la Creacion en una ventana de consola
        Date mod = video.getModificacion();
        System.out.println("Modificacion: " + mod);//imprime la Modificacion en una ventana de consola
        System.out.println(" ");

        System.out.println("----------------------");
        //asignando valores a los campos Datos
        System.out.println(" ");
        EstructuraPeriodico Datos = new EstructuraPeriodico();
        Datos.setNombrePeriodico(" PERIODICO VIRTUAL ");
        Datos.setUbicacion("Av. las Americas");
        Datos.setFecha(new Date());

        String no = Datos.getNombrePeriodico();
        System.out.println("Nombre: " + no);//imprime el Nombre en una ventana de consola
        String ubi = Datos.getUbicacion();
        System.out.println("Ubicacion: " + ubi);//imprime la Ubicacion en una ventana de consola
        Date fecha = Datos.getFecha();
        System.out.println("Fecha: " + fecha);//imprime la Fecha en una ventana de consola
        System.out.println(" ");

        System.out.println("----------------------");
        //asignando valores a los campos notici
        System.out.println(" ");
        Noticia notici = new Noticia();
        notici.setAutor("Autor: ");
        notici.setContenido("Contenido: ");
        notici.setFecha(new Date());
        notici.setTitulo("Titulo: ");
        notici.setMultimedia(video);

        String aut = noticia.getAutor();
        System.out.println("Franklin Orellana");//imprime el Autor en una ventana de consola
        String tit = noticia.getTitulo();
        System.out.println("Nuevo Alcalde De Cuenca");//imprime el Titulo en una ventana de consola
        String cont = noticia.getContenido();
        System.out.println("Pedro Palacios gana la alcaldia con un 28.9% de votos a favor");//imprime el Contenido en una ventana de consola
        Multimedia vidnot = noticia.getMultimedia();
        System.out.println("Multimedia: " + vidnot);//imprime la Multimedia en una ventana de consola
        Date fecha1 = noticia.getFecha();
        System.out.println("Fecha: " + fecha1);//imprime la Fecha en una ventana de consola
        System.out.println(" ");

        System.out.println("----------------------");
        System.out.println(" ");
    }//cierra el proceso en la clase principal

}//cierre clase

