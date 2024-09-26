/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import controlador.controladorPila;
import modelo.Pila;
import vista.vistaPila;

/**
 *
 * @author Felipe
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila modelo = new Pila();
        vistaPila view = new vistaPila();
        controladorPila con = new controladorPila(modelo, view);
        con.iniciar();
    }

}
