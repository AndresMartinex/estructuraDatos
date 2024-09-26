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
public class vistaPila {
    private Scanner sc;

    public vistaPila() {
        sc=new Scanner(System.in);
    }
    
    
    
    public int mostrarMenu(){
        System.out.println("n/ Menu de la pila");
        System.out.println("1. Apilar");
        System.out.println("2. Desapilar");
        System.out.println("3. Ver tope");
        System.out.println("4. Ver pila");
        System.out.println("5. Salir");
        System.out.println("ingrese una opcion valida");
        return sc.nextInt();
    }
    
    
    public int pedirNumero(){
        System.out.println("ingrese el dato");
        return sc.nextInt();
    }
    public void mostrarMensaje(String msj){
        System.out.println(msj);
    }
    public void msotrarNumero(int numero){
        System.out.println("el numero es: "+ numero);
    }
}
