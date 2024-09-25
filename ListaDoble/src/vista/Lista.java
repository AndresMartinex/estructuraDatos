/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Lista {
    private Scanner sc;

    public Lista(Scanner sc) {
        this.sc =new Scanner(System.in);
    }
    
    public void mostrarMenu(){
        System.out.println("\n Menu");
        System.out.println("1. Agregar elemento al final ");
        System.out.println("2. Agregar elemento al inicio");
        System.out.println("3. Eliminar elemento de la lista");
        System.out.println("4. Buscar elemento en la lista");
        System.out.println("0. Salir");
        System.out.println("Seleccione alguna opcion");
    }
    
    public int obtenerOpcion(){
        return sc.nextInt();
    }
    public  int obtenerNumero(String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
