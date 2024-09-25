/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cls_nodos;

import Controlador.Controlador_Nodos;
import Modelo.Lista;
import Modelo.Nodo;
import Vista.*;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Cls_Nodos {

    private static Scanner scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        Vista_Nodos view = new Vista_Nodos(scanner);
        Controlador_Nodos cn = new Controlador_Nodos(lista, view);
    }

}
