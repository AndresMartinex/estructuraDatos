/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Felipe
 */
public class listaCircular {
    private Nodo cabeza;
    private Nodo cola;
    
    
    
    public void agregarJugador(String name){
        Nodo nuevo = new Nodo(name);
        if(cabeza==null){
            cabeza=nuevo;
            cola=nuevo;
            nuevo.next=cabeza;
        }else{
            cola.next=nuevo;
            nuevo.next=cabeza;
            cola=nuevo;
        }
    }
    
    public String mostrarJugadores(){
       if (cabeza == null) {
        return "La lista está vacía";
    } else {
        StringBuilder result = new StringBuilder();
        Nodo actual = cabeza;
        
        do {
            result.append(actual.name).append(" --> ");
            actual = actual.next;
        } while (actual != cabeza);
        
        result.append("Regresar al inicio");
        return "Jugadores: " + result.toString();
          
        }
    }
    
   public boolean eliminarJugador(String name) {
    if (cabeza == null) {
        return false;
    }

    Nodo actual = cabeza;
    Nodo anterior = null;

    do {
        if (actual.name.equals(name)) { 
            if (anterior != null) {
                anterior.next = actual.next;
                if (actual == cabeza) {
                    cabeza = actual.next;
                }
            } else {
                
                if (cabeza == cola) {
                    cabeza = null;
                    cola = null;
                } else {
                    cabeza = actual.next;
                }
            }
            return true;
        }
        anterior = actual;
        actual = actual.next;
    } while (actual != cabeza);

    return false;
}
   
   public String jugar(){
       if(cabeza==null){
           return "la lista esta vacia";
       }
       String jugadorActual=cabeza.name;
       cabeza=cabeza.next;
       cola=cola.next;
       return "Turno del jugador"+jugadorActual;
   }
        
        
      
        
    }
    

