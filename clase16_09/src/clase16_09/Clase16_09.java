/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16_09;

import controlador.Control_juego;
import modelo.listaCircular;
import vista.view;

/**
 *
 * @author Felipe
 */
public class Clase16_09 {

    /**
     * @param args the command line arguments  
     */
    public static void main(String[] args) {
        listaCircular modelo = new listaCircular();
        view vista = new view();
        Control_juego con = new Control_juego(modelo, vista);
        con.ejecutar();

    }
    
}
