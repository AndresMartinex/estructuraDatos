/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import Modelo.Nodo;
import Vista.Vista_Nodos;

/**
 *
 * @author Felipe
 */
public class Controlador_Nodos {
 private Lista lista;
    private Vista_Nodos vista;

    public Controlador_Nodos(Lista lista, Vista_Nodos vista) {
        this.lista = lista;
        this.vista = vista;
    }

   

    public void iniciar() {
        int opcion;

        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String nombre = vista.pedirNombre();
                    String documento = vista.pedirDocumento();
                    int servicioOpcion = vista.Sservicio();

                    String servicio = "";

                    switch (servicioOpcion) {
                        case 1:
                            servicio = "servicio al cliente";
                            break;

                        case 2:

                            servicio = "pagos de servicios";
                            break;

                        case 3:
                            servicio = "Registro PQRS";
                            break;

                        default:
                            System.out.println("Opcion invalida");
                            servicio = "servicio al cliente";
                            break;

                    }

                    lista.agregarCliente(nombre, documento, servicio);
                    System.out.println("Cliente añadido a la espera");

                    break;
                    
                case 2:
                    Nodo clienteAtendido=lista.AtenderCliente();
                    vista.mostrarClienteAtendido(clienteAtendido);
                    break;
                    
                case 3:
                    vista.mostrarListaEspera(lista.getCabeza());
                    break;
                    
                case 4:
                    System.out.println("saliendo del sistema");
                    break;
                    
                default:
                    System.out.println("Opcion invalida, intente nuevamente ");

            }

        }while(opcion!=4);
        
    }
}



