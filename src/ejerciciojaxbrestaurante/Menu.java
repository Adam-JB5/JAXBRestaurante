/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojaxbrestaurante;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DAM209
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement
public class Menu {
    @XmlAttribute
    private String dias;
    @XmlAttribute
    private int precio;
    @XmlMixed
    @XmlElementRefs({
        @XmlElementRef(type = Plato1.class),
        @XmlElementRef(type = Plato2.class),
        @XmlElementRef(type = Postre.class)
    })
    private ArrayList<Object> platosYPostres = new ArrayList();

    public Menu() {
    }

    public Menu(String dias, int precio) {
        this.dias = dias;
        this.precio = precio;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Object> getPlatosYPostres() {
        return platosYPostres;
    }

    public void annadirPlatosYPostres(Object platoOPostre) {
        platosYPostres.add(platoOPostre);
    }
    
    
}
