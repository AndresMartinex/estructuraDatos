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
public class Pila {

    private PilaNodo top;
    int size;

    public Pila() {
        top = null;
        this.size = 0;
    }

   

    public boolean pilaVacia() {

        return top == null;
    }

    public void push(int data) {
        PilaNodo nuevoNodo = new PilaNodo(data);
        if (pilaVacia()) {
            top = nuevoNodo;

        } else {
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
        size++;
    }

    public int pop() {
        if (pilaVacia()) {
            throw new  RuntimeException("la pila esta vacia");
        } 
         int valor=top.data;
         top=top.siguiente;
         return valor;
    }

    public void mostarPila() {
        PilaNodo nuevoNodo = new PilaNodo(size);

        if (pilaVacia()) {
            System.out.println("pila vacia");

            return;
        } else {
            PilaNodo actual = top;
            while (actual != null) {
                System.out.println(actual.data);
                actual = actual.siguiente;

            }
        }
    }

    public int mostrarTop() {

        if (pilaVacia()) {
            System.out.println("pila vacia");

        } else {
       

        }
        return top.data;

    }
}
