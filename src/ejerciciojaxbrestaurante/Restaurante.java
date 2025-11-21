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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DAM209
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Restaurante {
    @XmlAttribute
    private String nombre;
    @XmlElementRef
    private ArrayList<Menu> menus = new ArrayList();

    public Restaurante() {
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void annadirMenu(Menu menu) {
        menus.add(menu);
    }
    
    
}
