/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

import Controlador.Controlador_Lista;
import Modelo.Controlador_Nodos;
import Vista_Nodos.vista_nodos;

/**
 *
 * @author Felipe
 */
public class Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controlador_Nodos modelo = new Controlador_Nodos();
        vista_nodos view = new vista_nodos();
        Controlador_Lista lista = new Controlador_Lista(modelo, view);

        lista.agregarelementos(2);
        lista.agregarelementos(9);
        lista.agregarelementos(0);
        lista.agregarelementos(3);

        view.mostramensaje("lista despues de agregar datos");
        lista.mostrarlista();

        lista.elminarelemento();
        lista.ultimoelminarelemento();
        

        view.mostramensaje("lista despues de eliminar elementos");
        lista.mostrarlista();
    }

}
