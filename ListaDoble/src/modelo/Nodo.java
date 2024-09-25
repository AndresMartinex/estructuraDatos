/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Felipe
 */
public class Nodo<T> {
    T date;
    Nodo <T> siguiente;
    Nodo <T> anterior;

    public Nodo(T date) {
        this.date = date;
        this.siguiente = null;
        this.anterior = null;
        
    }
    
    
}
