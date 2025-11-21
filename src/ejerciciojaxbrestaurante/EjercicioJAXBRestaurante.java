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
        
        Restaurante restaurante = new Restaurante();
        
        
        
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
