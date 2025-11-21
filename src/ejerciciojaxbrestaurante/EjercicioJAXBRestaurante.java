/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojaxbrestaurante;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author DAM209
 */
public class EjercicioJAXBRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        //Variables
        Restaurante restaurante = new Restaurante("Buen Llantar");
        Menu menu;
        Plato1 plato1;
        Plato2 plato2;
        Postre postre;
        
        //Menu 1
        menu = new Menu("lunes-viernes", 12);
        
        //Platos 1
        plato1 = new Plato1("caliente", "Garbanzos");
        menu.annadirPlatosYPostres(plato1);
        plato1 = new Plato1("caliente", "Lentejas");
        menu.annadirPlatosYPostres(plato1);
        plato1 = new Plato1("frío", "Salmorejo");
        menu.annadirPlatosYPostres(plato1);
        
        //Platos 2
        plato2 = new Plato2(180, "Carne");
        menu.annadirPlatosYPostres(plato2);
        plato2 = new Plato2(280, "Pescado");
        menu.annadirPlatosYPostres(plato2);
        
        //Postres
        postre = new Postre("si", "Flan");
        menu.annadirPlatosYPostres(postre);
        postre = new Postre("no", "Helado");
        menu.annadirPlatosYPostres(postre);
        postre = new Postre("no", "Fruta");
        menu.annadirPlatosYPostres(postre);
        
        
        //Annadimos menu 1 a restaurante
        restaurante.annadirMenu(menu);
        
        //Menu 2
        menu = new Menu("kksabado-domingo", 18);
        
        //Platos 1
        plato1 = new Plato1("kkcaliente", "Garbanzos");
        menu.annadirPlatosYPostres(plato1);
        plato1 = new Plato1("kkcaliente", "Lentejas");
        menu.annadirPlatosYPostres(plato1);
        
        //Platos 2
        plato2 = new Plato2(280, "kkPescado");
        menu.annadirPlatosYPostres(plato2);
        
        //Postres
        postre = new Postre("si", "kkFlan");
        menu.annadirPlatosYPostres(postre);
        postre = new Postre("no", "kkHelado");
        menu.annadirPlatosYPostres(postre);
        postre = new Postre("no", "kkFruta");
        menu.annadirPlatosYPostres(postre);
        
        //Annadimos menu 2 a restaurante
        restaurante.annadirMenu(menu);
        
        
        try {
            System.out.println("Creando el objeto JAXBContext e iniciándolo con la clase de la que se va a hacer marshalling");
            JAXBContext jc = JAXBContext.newInstance(Restaurante.class);
            System.out.println("Creando el objeto Marshaller y configurándolo para que genere salida XML formateada");
            Marshaller m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            System.out.println("Convirtiendo el objeto en un documento XML y almacenándolo en un fichero");
            File ficheroXML = new File(args[0]);
            m.marshal(restaurante, ficheroXML);
            System.out.println("Fichero XML generado");
        } catch (JAXBException ex) {
            System.out.println(ex);
        }
        
//        File ficheroXML = new File(args[0]);
//
//        try {
//            JAXBContext jc = JAXBContext.newInstance(Restaurante.class);
//            Unmarshaller um = jc.createUnmarshaller();
//            Restaurante restaurante2 = (Restaurante) um.unmarshal(ficheroXML);
//            System.out.println("Terminado correctamente");
//            System.out.println(restaurante2);
//        } catch (JAXBException e) {
//            System.out.println(e);
//        }
    }
    
}
