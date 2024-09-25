/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.ombre
 */
package Modelo;

/**
 *
 * @author Felipe
 */
public class Tareatrabajo extends Tarea implements Prioridad{
    private  int prioridad;
    private String proyectoAsociado;

    public Tareatrabajo(String nombre,String descripcion ,String proyectoAsociado) {
     
    super(nombre,descripcion);
    this.proyectoAsociado=proyectoAsociado;
    return;
    
    
}
    @Override
    public void  establecerPrioridad(int prioridad){
        this.prioridad=prioridad;
        
    }
    @Override
    public int  obtenerPrioridad(){
        return prioridad;
    }
    public String obtenerTipoTarea(){
        return "tarea del trabajo:"+proyectoAsociado;
    }

}
