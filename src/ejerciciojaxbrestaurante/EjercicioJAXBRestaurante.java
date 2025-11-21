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

/**
 *
 * @author DAM209
 */
public class EjercicioJAXBRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurante restaurante = new Restaurante("Buen Llantar");
        
        Plato1 plato1Garbanzos = new Plato1("caliente", "Garbanzos");
        Plato1 plato1Lentejas = new Plato1("caliente", "Lentejas");
        Plato1 plato1Salmorejo = new Plato1("frío", "Salmorejo");

        Plato2 plato2Carne = new Plato2(180, "Carne");
        Plato2 plato2Pescado = new Plato2(280, "Pescado");

        Postre postreFlan = new Postre("si", "Flan");
        Postre postreHelado = new Postre("no", "Helado");
        Postre postreFruta = new Postre("no", "Fruta");
        
        Menu menu1 = new Menu("lunes-viernes", 12);
        
        menu1.annadirPlatosYPostres(plato1Garbanzos);
        menu1.annadirPlatosYPostres(plato1Lentejas);
        menu1.annadirPlatosYPostres(plato1Salmorejo);
        
        menu1.annadirPlatosYPostres(plato2Carne);
        menu1.annadirPlatosYPostres(plato2Pescado);
        
        menu1.annadirPlatosYPostres(postreFlan);
        menu1.annadirPlatosYPostres(postreHelado);
        menu1.annadirPlatosYPostres(postreFruta);
        
        restaurante.annadirMenu(menu1);
        
        
        Menu menu2 = new Menu("sabado-domingo", 18);
        
        Plato1 plato1Escarola = new Plato1("frío", "Escarola");
        Plato1 plato1Pisto = new Plato1("caliente", "Pisto");

        Plato2 plato2Marisco = new Plato2(200, "Marisco");
        Plato2 plato2Caza = new Plato2(220, "Caza");

        Postre postreMouse = new Postre("si", "Mouse");
        Postre postreCuajada = new Postre("no", "Cuajada");
        
        menu2.annadirPlatosYPostres(plato1Escarola);
        menu2.annadirPlatosYPostres(plato1Pisto);
        
        menu2.annadirPlatosYPostres(plato2Marisco);
        menu2.annadirPlatosYPostres(plato2Caza);
        
        menu2.annadirPlatosYPostres(postreMouse);
        menu2.annadirPlatosYPostres(postreCuajada);
        
        restaurante.annadirMenu(menu2);
        
        
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
    }
    
}
