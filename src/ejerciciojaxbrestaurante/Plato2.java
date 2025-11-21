/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojaxbrestaurante;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author DAM209
 */
@XmlRootElement
public class Plato2 {
    private int peso;
    private String nombre;
    
    public Plato2() {
        
    }
    
    public Plato2(int peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    @XmlAttribute
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @XmlValue
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Plato2{" + "peso=" + peso + ", nombre=" + nombre + '}';
    }
    
    
    
}
