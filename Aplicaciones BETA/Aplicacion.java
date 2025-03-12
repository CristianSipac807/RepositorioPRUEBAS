/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author visitante
 */
public class Aplicacion {

    public Aplicacion(int id_aplicacion, String nombre_aplicacion, String estatus_aplicacion) {
        this.id_aplicacion = id_aplicacion;
        this.nombre_aplicacion = nombre_aplicacion;
        this.estatus_aplicacion = estatus_aplicacion;
    }

    public int getId_aplicacion() {
        return id_aplicacion;
    }

    public String getNombre_aplicacion() {
        return nombre_aplicacion;
    }

    public String getEstatus_aplicacion() {
        return estatus_aplicacion;
    }

    public void setId_aplicacion (int id_aplicacion) {
        this.id_aplicacion = id_aplicacion;
    }

    public void setNombre_aplicacion(String nombre_aplicaion) {
        this.nombre_aplicacion = nombre_aplicacion;
    }

    public void setEstatus_aplicacion(String estatus_aplicacion) {
        this.estatus_aplicacion = estatus_aplicacion;
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "id_aplicacion=" + id_aplicacion + ", nombre_aplicacion=" + nombre_aplicacion + ", estatus_aplicacion=" + estatus_aplicacion + '}';
    }
    
    int id_aplicacion;
    String nombre_aplicacion;
    String estatus_aplicacion;
    
    public Aplicacion() { //no contiene nada
    }
    
    

}
