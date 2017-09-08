/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

/**
 *
 * @author Jaime Ontiverps
 */
public class ClaseNodo {
     private Nodo siguiente;
    private Object contiene;

    public ClaseNodo() {
        siguiente=null;
        contiene=0;
    }

    public ClaseNodo(Object contiene) {
        this.contiene=contiene;
    }
    public ClaseNodo(Nodo siguiente, Object contiene) {
        this.siguiente=siguiente;
        this.contiene=contiene;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getContiene() {
        return contiene;
    }

    public void setContiene(Object contiene) {
        this.contiene = contiene;
    }
}
