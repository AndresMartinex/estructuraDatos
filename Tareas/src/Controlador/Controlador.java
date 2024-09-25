/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ListaEnlazada;
import Modelo.Tarea;
import Modelo.Tareatrabajo;
import Modelo.task;
import Vista.Vista;

/**
 *
 * @author Felipe
 */
public class Controlador {
    private ListaEnlazada ListaE;
    private Vista view;

    public Controlador(ListaEnlazada ListaE, Vista view) {
        this.ListaE = ListaE;
        this.view = view;
    }
    
    public  void  iniciar (){
        int opcion;
        do{
            opcion=view.mostrarmenu();
            switch(opcion){
                case 1:
                    String nombre=view.pedirNombre();
                    String description= view.pedirDescription();
                    task tarea= new task(nombre,description);
                    ListaE.anadirTarea(tarea);
                    System.out.println("tarea personal añadida");
break;
            
                case 2:
                     String nombret=view.pedirNombre();
                    String descriptiont= view.pedirDescription();
                    String proyectot=view.pedirObjetoAsociativo();
                    task tareat= new task(nombre, description), descriptiont,proyectot);
                    ListaE.anadirTarea(tareat);
                    System.out.println("tarea de trabajo añadida");
                    break;
                case 3:
                    
                        }
        }
    }
}
