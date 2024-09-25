/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import modelo.Nodo;

/**
 *
 * @author Felipe
 */
public class view {
    private Scanner sc=new Scanner(System.in);
     private Nodo cabeza;
    private Nodo cola;
    

  public void mostrarMenu(){
      System.out.println("n/--Menu parque de diversiones");
      System.out.println("1.agregar jugador a la lista");
      System.out.println("2.mostrar jugadores en la lista");
      System.out.println("3.eliminar jugador de la lista");
      System.out.println("4.jugar un turno");
      System.out.println("5. salir");
      
      System.out.println("Seleccione una opcion");
  
  }
  
  public  int leerOpcion(){
      
      
      
      return sc.nextInt();
  }
  
  public String nombreJugador(){
     
      Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese su nombre: ");
    String nombre = sc.nextLine();
    return nombre;
     
      
      
  }
  public void mostrarMensaje(String mensaje){
      System.out.println(mensaje);
  }
    
    
}
