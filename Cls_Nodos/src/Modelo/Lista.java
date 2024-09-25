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
public class Lista {

    private Nodo Cabeza;

    public Lista() {
        this.Cabeza = null;
    }

    public void agregarCliente(String Nombre, String documento, String Servicio) {
        Nodo NuevoNodo = new Nodo(Nombre, documento, Servicio);
        if (Cabeza == null) {
            Cabeza = NuevoNodo;

        } else {
            Nodo temporal = Cabeza;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();

            }
            temporal.setSiguiente(NuevoNodo);

        }

    }

    public Nodo AtenderCliente() {
        if (Cabeza == null) {
            
            return null;
            
        } else { 
           Nodo ClienteAtendido=Cabeza;
           Cabeza=Cabeza.getSiguiente();
           return ClienteAtendido; 

        }
    }

    public Nodo getCabeza() {
        return Cabeza;
    }
    
}
