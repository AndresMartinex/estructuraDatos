/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe
 */
public abstract class Tarea {
   
        protected  String nombreTask;
        protected String description;
        protected Tarea siguiente;

        public Tarea(String nombreTask, String description) {
            this.nombreTask = nombreTask;
            this.description = description;
            this.siguiente = null;
        }
public  abstract  String obtenerTipoTarea();

        public String getNombreTask() {
            return nombreTask;
        }

        public void setNombreTask(String nombreTask) {
            this.nombreTask = nombreTask;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String Description) {
            this.description = Description;
        }

        public Tarea getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Tarea siguiente) {
            this.siguiente = siguiente;
        }
    

        
    }

