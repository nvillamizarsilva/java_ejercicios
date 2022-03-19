
package com.mycompany.listascirculares;

public class Nodo {
    private int valor;
    private Nodo siguiente;

    //Constructor
    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }
    //SEtter and getter

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}


