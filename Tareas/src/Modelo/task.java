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
public class task extends Tarea implements Prioridad {
    private  int prioridad;

    public task(String nombre,String description) {
        super(nombre,description);
        this.prioridad=0;
        
    }
    public void establecerPrioridad(int prioridad){
        this.prioridad=prioridad;
    }
    @Override
    public int obtenerPrioridad(){
      
        return obtenerPrioridad();
    
    }
    
    @Override
    public  String obtenerTipoTarea(){
        return "tarea personal";
    }
    
}
