
package com.mycompany.listasabiertas;


public class Nodo {
    private int valor;
    private String nombres;
    //Atributo para hacer referencia al nodo siguiente
    private Nodo siguiente;

    //Constructor
    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }
    
    //Setter and getter

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
