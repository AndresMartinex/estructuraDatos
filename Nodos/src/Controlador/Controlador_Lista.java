/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Controlador_Nodos;
import Vista_Nodos.vista_nodos;

/**
 *
 * @author Felipe
 */
public class Controlador_Lista {
    private Controlador_Nodos Modelo;
    private vista_nodos vista;

    public Controlador_Lista(Controlador_Nodos Modelo, vista_nodos vista) {
        this.Modelo = Modelo;
        this.vista = vista;
    }
    
    public void agregarelementos(int valor){
        Modelo.agregar(valor);
    }
    public void elminarelemento(){
        Modelo.eliminar();
    }
     public void ultimoelminarelemento(){
        Modelo.eliminarultimodate(5);
    }
     public  void mostrarlista(){
       vista.mostarLista(Modelo.getcabeza());
     }
    
}
