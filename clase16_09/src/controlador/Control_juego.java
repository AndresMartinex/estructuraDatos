/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
import modelo.*;
import vista.*;

/**
 *
 * @author Felipe
 */
public class Control_juego {
     private listaCircular listaCircular;
    private view vista;
    
   

    public Control_juego(listaCircular listaCircular, view vista) {
        this.listaCircular = listaCircular;
        this.vista = vista;
    }
    
    public void ejecutar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 5); // Asumo que la opción 5 es la de salir
    }
    
    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1: // Agregar jugador
                String nombre = vista.nombreJugador();
                listaCircular.agregarJugador(nombre);
                vista.mostrarMensaje("Jugador agregado al juego: " + nombre);
                break;
                
            case 2: // Eliminar jugador
                nombre = vista.nombreJugador();
                boolean eliminado = listaCircular.eliminarJugador(nombre);
                if (eliminado) {
                    vista.mostrarMensaje("Jugador eliminado: " + nombre);
                } else {
                    vista.mostrarMensaje("Jugador no encontrado: " + nombre);
                }
                break;
                
            case 3: // Mostrar jugadores
                String jugadores = listaCircular.mostrarJugadores();
                vista.mostrarMensaje(jugadores);
                break;
                
            case 4: // Otra opción (si tienes alguna acción extra)
                vista.mostrarMensaje("Opción no implementada.");
                break;
                
            case 5: // Salir
                vista.mostrarMensaje("Saliendo del juego...");
                break;
                
            default:
                vista.mostrarMensaje("Opción no válida, intenta de nuevo.");
                break;
        }
    }

   
}
