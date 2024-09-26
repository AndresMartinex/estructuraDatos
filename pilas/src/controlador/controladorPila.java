/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;
import modelo.*;
import vista.vistaPila;

/**
 *
 * @author Felipe
 */
public class controladorPila {

    private Pila modelo;
    private vistaPila view;

    public controladorPila(Pila modelo, vistaPila view) {
        this.modelo = modelo;
        this.view = view;
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            int opcion = view.mostrarMenu();

            switch (opcion) {
                case 1:
                    int numero = view.pedirNumero();
                    modelo.push(numero);
                    view.mostrarMensaje("numero aplicado correctamente");
                    break;
                case 2:
                    int quitar = modelo.pop();
                    view.mostrarMensaje("numero desapilado" + quitar);
                    break;
                case 3:
                    int cima = modelo.mostrarTop();
                    view.mostrarMensaje("ultimo dato de la pila" + cima);
                    break;
                case 4:
                    modelo.mostarPila();
                    break;
                case 5:
                    continuar = false;
                    view.mostrarMensaje("saliendo.......");
                    break;
                default:
                    view.mostrarMensaje("opcion invalida");
                    break;
            }
        }
    }

}
