/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import nodos.Nodos;

/**
 *
 * @author Felipe
 */
public class Modelo_nodo {
   private int data;

  private Modelo_nodo siguiente;
   
   public Modelo_nodo(int data){
       this.data=data;
       this.siguiente=null;
   }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Modelo_nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Modelo_nodo siguiente) {
        this.siguiente = siguiente;
    }
   
    
    
}
