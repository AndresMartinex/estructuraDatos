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
public class model_doc {
    private modelo_doc cabeza;

    public model_doc() {
        this.cabeza = null;
    }
    
    public void agrgarCliente(String Nombre,String documento,String Servicio){
        modelo_doc nuevomodelo= new modelo_doc(Nombre, documento, Servicio);
        if(cabeza==null){
            cabeza=nuevomodelo;
        }else{
            modelo_doc temporal=cabeza;
            while(temporal.getSiguiente()!=null){
                temporal= temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevomodelo);
        }
    }
    public modelo_doc Atender(){
        if(cabeza==null){
            return null;
        }else{
            modelo_doc clienteAtendido=cabeza;
            cabeza=cabeza.getSiguiente();
            return clienteAtendido;
        }
     
    }
    
    public modelo_doc getCabeza(){
    return cabeza;
}
}
