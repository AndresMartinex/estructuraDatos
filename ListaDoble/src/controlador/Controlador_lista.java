/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static javafx.scene.input.KeyCode.T;
import modelo.listaEnlazada;
import vista.Lista;

/**
 *
 * @author Felipe
 */
public class Controlador_lista <T> {
    
    private listaEnlazada<T> modelo;
    private Lista lista;
    
    public Controlador_lista(listaEnlazada <T> Modelo, Lista lista) {
        this.lista = lista;
        this.modelo = modelo;
    }
    
    public void iniciar() {
        int opcion;
        
        do {
            lista.mostrarMenu();
            opcion = lista.obtenerOpcion();

            
        } while (opcion != 0);
        
    }
    
    public void procesar(int opcion) {
        switch (opcion) {
            case 1:
                
                agregarFinal();
                break;
            case 2:
                agregarInicio();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                search();
                break;
            case 5:
                System.out.println("Cerrando programa");
                break;
            
            default:
                lista.mostrarMensaje("opcion invalida");
        }
    }
    
    private void agregarFinal() {
        T elementos = (T) Integer.valueOf(lista.obtenerNumero("ingrese elemento para agregar al final de la lista"));
        modelo.agregarFinalLista(elementos);
        lista.mostrarMensaje("Elemento agregado al final");
    }
    
    private void agregarInicio() {
        T elementos = (T) Integer.valueOf(lista.obtenerNumero("ingrese elemento para agregar al inicio de la lista"));
        modelo.agregarInicio(elementos);
        lista.mostrarMensaje("Elemento agregado al inicio");
    }
    
    private void eliminar() {
        T elementos = (T) Integer.valueOf(lista.obtenerNumero("ingrese elemento para elminar de la lista"));
        
        modelo.eliminar(elementos);
        lista.mostrarMensaje("elemento eliminado");
    }
    
    private void search() {

    }
}
