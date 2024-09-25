/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.model_doc;
import Modelo.modelo_doc;
import Vista.Vista_doc;

/**
 *
 * @author Felipe
 */
public class Controlador_doc {
    private model_doc mod;
    private  Vista_doc view;

    public Controlador_doc(model_doc mod, Vista_doc view) {
        this.mod = mod;
        this.view = view;
    }
    public void iniciar(){
        int opcion;
        do{
            opcion=view.mostrarMenu();
            switch(opcion){
                case 1:
                    String nombre=view.pedirNombre();
                    String documento= view.pedirDocumento();
                    int servicioOpcion = view.Sservicio();
                      
                    
                    String servicio ="";
                     
                    
                    switch (servicioOpcion){
                        case 1:
                            servicio="servicio al cliente";
                            break;
                            case 2:
                                servicio="pago de compra";
                                break;
                            case 3:
                                servicio = "registro PQRS";
                                break;
                                default:
                                    System.out.println("opcion invalida");
                                    servicio="servicio del cliente";
                                    break;
                    }
                    mod.agrgarCliente(nombre,documento,servicio);
                    System.out.println("cliente en espera agregado");
                    
                    break;
                    case 2:
                        modelo_doc clienteAtendido=mod.Atender();
                        view.mostrarClienteAtendido(clienteAtendido);
                        break;
                          case 3:
                    view.mostrarListaEspera(mod.getCabeza());
                    break;
                    
                case 4:
                    System.out.println("saliendo del sistema");
                    break;
                    
                default:
                    System.out.println("Opcion invalida, intente nuevamente ");

            }

        }while(opcion!=4);
            }
        }
    
    

