/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Felipe
 */
public class listaEnlazada<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public listaEnlazada() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public void agregarFinalLista(T date) {
        Nodo<T> nuevoNodo = new Nodo<>(date);

        if (cabeza == null) {
            cabeza = cola = nuevoNodo;

        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;

        }
        tamano++;
    }

    public void agregarInicio(T date) {

        Nodo<T> nuevoNodo = new Nodo<>(date);

        if (cabeza == null) {
            cabeza = cola = nuevoNodo;

        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;

        }
        tamano++;
    }

    public void eliminar(T date) {
        Nodo<T> actual = cabeza;

        while (actual != null) {
            if (actual.date.equals(date)) {
                if (actual.anterior == null) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {

                        /*                        cabeza.anterior==null;*/
                    } else if (actual.siguiente == null) {
                        cola = actual.anterior;
                        cola.siguiente = null;
                    } else {
                        actual.anterior.siguiente = actual.siguiente;
                        actual.siguiente.anterior = actual.anterior;
                    }
                    
                    tamano--;
                    return;
                }
               actual= actual.siguiente;

            }
        }
    }
    
    
    public boolean search(T date){
        Nodo <T> actual=cabeza;
        while(actual!=null){
        if(actual.date.equals(date)){
            return true;
        }else{
            actual=actual.siguiente;
        }
    }
        return false;
    }
    
    public void invertir(){
        Nodo <T>temp=null;
        Nodo <T> actual=cabeza;
        
        while (temp!=null) {            
            actual.siguiente=cabeza.siguiente;
            temp.anterior=temp.siguiente;
            actual.siguiente=temp.siguiente;
            temp.siguiente=cabeza.anterior;
            if(temp!=null){
                cabeza=actual.siguiente;
               
            }
        break;    
        }
        
    }
    
    
    
}
