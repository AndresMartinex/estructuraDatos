/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;

import Controlador.Controlador_doc;
import Modelo.model_doc;
import Vista.Vista_doc;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Doc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
model_doc lista = new model_doc();
        Scanner scanner = null;
        Vista_doc view = new Vista_doc(scanner);
        Controlador_doc cn = new Controlador_doc(lista, view);
    }
    
}
