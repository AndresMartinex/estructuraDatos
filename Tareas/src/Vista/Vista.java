/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Prioridad;
import Modelo.Tarea;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Vista {

    private Scanner sc;

    public Vista() {
        this.sc = new Scanner(System.in);

    }

    public int mostrarmenu() {
        System.out.println("\n Gestion de tareas");
        System.out.println("1. añadir  tareas personal");
        System.out.println("2. añadir  tarea de trabajo");
        System.out.println("3. asignar prioridad");
        System.out.println("4. mostrar lista de tareas");
        System.out.println("5. salir");
        System.out.println("6. seleccione una opcion");

        return sc.nextInt();

    }

    public String pedirNombre() {
        System.out.println("ingrese nombre de la tarea");
        sc.nextLine();
        return sc.nextLine();
    }

    public String pedirDescription() {
        System.out.println("ingrese la descripcion de la tarea");
        return sc.nextLine();
    }

    public int pedirPrioridad() {
        System.out.println("ingrese la prioridad (1-5)");
        return sc.nextInt();
    }

    public String pedirObjetoAsociativo() {
        System.out.println("ingrese el nombre del proyecto:");
        return sc.nextLine();
    }

    public void mostrarLista(Tarea cabeza) {
        if (cabeza == null) {
            System.out.println("LISTA TAREAS VACIA");

        } else {
            Tarea actual = cabeza;
            System.out.println("Lista de tareas");
            while (actual != null) {
                String tipoTarea=actual.obtenerTipoTarea();
                System.out.println("Nombre:"+actual.getNombreTask()+"Descripcion:"+actual.getDescription()+"tipo:"+tipoTarea);
if (actual instanceof Prioridad){
    System.out.println("Prioridad: "+((Prioridad) actual).obtenerPrioridad());
}
actual=actual.getSiguiente();
            }
        }
    }
    public int pedirPosicionPrioridad(){
        System.out.println("ingrese la prioridad se la tarea que desea asiganar");
        return sc.nextInt();
        
    }

}
