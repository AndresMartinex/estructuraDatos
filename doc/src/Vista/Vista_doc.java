/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.modelo_doc;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Vista_doc {
     private  static Scanner scanner;

    public Vista_doc(Scanner scanner) {
        this.scanner = new Scanner(System.in);

    }

  
  

    public int mostrarMenu() {
        System.out.println("\n  Centro de servicio");
        System.out.println("1. Regisitrar cliente");
        System.out.println("2. Atender Cleinte");
        System.out.println("3. Mostrar lista de espera");
        System.out.println("4. Salir");
        return scanner.nextInt();
    }
    
    public String pedirNombre(){
        System.out.println("Ingrese el nombre del cliente");
        scanner.nextLine();
        return  scanner.nextLine();
        
    }
    public String pedirDocumento(){
        System.out.println("Ingrese el documento del cliente");
        scanner.nextLine();
        return  scanner.nextLine();
        
    }
    
     public int Sservicio(){
       System.out.println("\n  Centro de servicio");
        System.out.println("1. atencion cliente");
        System.out.println("2.pago servicio");
        System.out.println("3. Registro PQRS");
        System.out.println("4. Seleccione una opcion");
        return scanner.nextInt();
    }
     
     public void  mostrarClienteAtendido(modelo_doc cliente){
         if(cliente!=null){
             System.out.println("atendido a :"+cliente.getNombre()+"-servicio-"+cliente.getServicio());
             
         }
         else{
             System.out.println("No hay cliente en espera");
             
         }
     }
     
     public void mostrarListaEspera(modelo_doc cabeza){
         if(cabeza==null){
             System.out.println("la lista esta vacia");
         }else{
             modelo_doc actual= cabeza;
             System.out.println("lista de espera");
            while(actual!=null){
          System.out.println("Nombre"+actual.getNombre()+"Documento"+actual.getDocumento()+"servicio"+actual.getServicio());
         actual= actual.getSiguiente();
             
         }
     }
    

}
}
