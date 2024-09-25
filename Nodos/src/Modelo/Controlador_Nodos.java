/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Modelo_nodo;
import nodos.Nodos;
import java.time.temporal.Temporal;

/**
 *
 * @author Felipe
 */
public class Controlador_Nodos {
    private Modelo_nodo cabeza;
    private int tam=5;

    public Controlador_Nodos() {
        this.cabeza = null;
    }
    public  void  agregar(int dat){
        Modelo_nodo NuevoNodo= new Modelo_nodo(dat);
        if(cabeza==null){
            cabeza=NuevoNodo;
            
        }else{
           Modelo_nodo temporal= cabeza;
           while(temporal.getSiguiente()!= null){
             temporal=temporal.getSiguiente();
             
               
           }
           temporal.setSiguiente(NuevoNodo);
           
        }
        
    }
    public void eliminar(){
        if(cabeza!=null){
            cabeza=cabeza.getSiguiente();
            
        }else{
            System.out.println("LISTA VACIA");
            
        }
       
          
     
    }
    public Modelo_nodo getcabeza(){
        return cabeza;
        
    }
    public int buscarElemnto( int date){
        Modelo_nodo Actual= cabeza;
        while (cabeza!=null) {
if(Actual.getData()==date){
    Actual=Actual.getSiguiente();
    return Actual.getData();
    
}    return -1;     
            
        }
        return 0;
    }
    
     public void eliminarultimodate(int tamano){
        
    if(cabeza!=null){
       
             cabeza=cabeza.getSiguiente();
        
           
            
        }else{
            System.out.println("LISTA VACIA");
            
        }
       
        }
       
          
     
    }


