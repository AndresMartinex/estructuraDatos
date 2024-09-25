/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21_08;

/**
 *
 * @author Felipe
 */
public class Clase21_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ListaSimple Lista= new ListaSimple();
      Lista.agregar(2);
      Lista.agregar(9);
      Lista.agregar(0);
      Lista.agregar(3);
      
        System.out.println("lista despues de agregar elementos");
        Lista.mostarLista();
        Lista.eliminar();
       
        System.out.println("Lista despues de eliminar elemento");
        Lista.mostarLista();
    }
    
}
