/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe
 */
public class modelo_doc {
    private String nombre ;
    private String documento;
    private String servicio;
    private modelo_doc siguiente;

    public modelo_doc(String nombre, String documento, String servicio) {
        this.nombre = nombre;
        this.documento = documento;
        this.servicio = servicio;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public modelo_doc getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(modelo_doc siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
