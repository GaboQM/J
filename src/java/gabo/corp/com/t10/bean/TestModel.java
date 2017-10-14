/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabo.corp.com.t10.bean;

import javax.ejb.Stateless;

/**
 *
 * @author gaboqm
 */
@Stateless
public class TestModel {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private String nombre,correo;
    public TestModel(){
        this.nombre="Pedro";
        this.correo="drope@gmail.com";
    }
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    
   
}
