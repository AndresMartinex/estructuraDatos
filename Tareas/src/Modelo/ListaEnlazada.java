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
public class ListaEnlazada {
    private Tarea cabeza;
    
    public  ListaEnlazada(){
        this.cabeza=null;
    }
    public void anadirTarea( Tarea tarea){
        if(cabeza==null){
            cabeza=tarea;
            
        }else{
            Tarea actual= cabeza;
            while (actual.getSiguiente()!=null) {
                actual=actual.getSiguiente();
                
                
                
            }
            
            actual.setSiguiente(tarea);
        }
    }
}
