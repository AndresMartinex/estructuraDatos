/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21_08;

import java.time.temporal.Temporal;

/**
 *
 * @author Felipe
 */
public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }
    public  void  agregar(int dat){
        Nodo NuevoNodo= new Nodo(dat);
        if(cabeza==null){
            cabeza=NuevoNodo;
            
        }else{
           Nodo Temporal= cabeza;
           while(Temporal.siguiente != null){
             Temporal=  Temporal.siguiente;
             
               
           }
           Temporal.siguiente=NuevoNodo;
           
        }
        
    }
    public void eliminar(){
        if(cabeza!=null){
            cabeza=cabeza.siguiente;
            
        }else{
            System.out.println("LISTA VACIA");
            
        }
        
       
           
       }
          
       public void mostarLista(){
        Nodo   Temporal = cabeza;
        while(Temporal!=null){
            System.out.println(Temporal.data+"->");
           Temporal= Temporal.siguiente;
        }
           System.out.println("null");
    }
    
}
