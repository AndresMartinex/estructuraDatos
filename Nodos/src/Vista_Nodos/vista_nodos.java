/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_Nodos;

import Modelo.Modelo_nodo;
import java.time.temporal.Temporal;

/**
 *
 * @author Felipe
 */
public class vista_nodos {
  public void mostarLista(Modelo_nodo cabeza){
        Modelo_nodo  Temporal = cabeza;
        while(Temporal!=null){
            System.out.println(Temporal.getData()+"->");
           Temporal= Temporal.getSiguiente();
        }
           System.out.println("null");
    }
  public void mostramensaje(String mensaje){
      System.out.println(mensaje);
  }

    
}
