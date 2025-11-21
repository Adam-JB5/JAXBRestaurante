/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojaxbrestaurante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author DAM209
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement
public class Postre {
    private String dulce;
    private String nombre;

    public Postre() {
    }
    
    

    public Postre(String dulce, String nombre) {
        this.dulce = dulce;
        this.nombre = nombre;
    }

    @XmlAttribute
    public String getDulce() {
        return dulce;
    }

    public void setDulce(String dulce) {
        this.dulce = dulce;
    }

    @XmlValue
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
